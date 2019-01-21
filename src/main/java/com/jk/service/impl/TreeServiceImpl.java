package com.jk.service.impl;

import com.jk.bean.Tree;
import com.jk.mapper.TreeMapper;
import com.jk.service.TreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TreeServiceImpl implements TreeService {

    @Autowired
    private TreeMapper treeMapper;

    //树
    @Override
    public List<Tree> bootstraptree() {
        int id = 0;
        List<Tree> bootreeNode = bootreeNode(id);
        return bootreeNode;
    }

    private List<Tree> bootreeNode(int id) {
        List<Tree> bootstraptree = treeMapper.bootstraptree(id);
        for (Tree bootstapBean2 : bootstraptree) {
            Integer id2 = bootstapBean2.getId();
            List<Tree> bootreeNode = bootreeNode(id2);
            if (bootreeNode == null || bootreeNode.size() <= 0) {
                bootstapBean2.setSelectable(true);
            } else {
                bootstapBean2.setSelectable(false);
                bootstapBean2.setNodes(bootreeNode);
            }
        }
        return bootstraptree;
    }

}
