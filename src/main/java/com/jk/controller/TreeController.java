package com.jk.controller;

import com.jk.bean.Tree;
import com.jk.service.TreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("tree")
public class TreeController {

    @Autowired
    private TreeService treeService;

    @RequestMapping("toTree")
    public String toTree() {
        return "tree";
    }


    //树
    @RequestMapping("gettree")
    @ResponseBody
    public List<Tree> bootstraptree() {
        return treeService.bootstraptree();
    }

}
