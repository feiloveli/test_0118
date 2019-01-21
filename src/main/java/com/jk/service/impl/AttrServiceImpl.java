package com.jk.service.impl;

import com.jk.bean.Attr;
import com.jk.bean.Value;
import com.jk.mapper.AttrMapper;
import com.jk.service.AttrService;
import com.jk.utils.PageResult;
import com.jk.utils.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class AttrServiceImpl implements AttrService {

    @Autowired
    private AttrMapper attrMapper;

    //分页查询列表
    @Override
    public PageResult queryAttrPageList(Integer page, Integer rows, Attr attr) {
        //总返回体
        PageResult pageResult = new PageResult();
        //查询参数
        HashMap<String, Object> params = new HashMap<>();
        params.put("attr", attr);
        //查询count
        int count = attrMapper.queryAttrPageCount(params);
        //把查询出来的count放到总返回当中
        pageResult.setTotal(count);
        //构建分页工具类
        PageUtil<Attr> pageUtil = new PageUtil<Attr>(count, page, rows);
        params.put("startIndex", pageUtil.getStartIndex());
        params.put("endIndex", pageUtil.getEndIndex());
        //查询list
        List<Attr> list = attrMapper.queryAttrPageList(params);
        //将查询出来的list放到总返回体重
        pageResult.setRows(list);
        return pageResult;
    }

    //查询关联表
    @Override
    public List<Value> queryList() {
        return attrMapper.queryList();
    }


}
