package com.jk.service;

import com.jk.bean.Attr;
import com.jk.bean.Value;
import com.jk.utils.PageResult;

import java.util.List;

public interface AttrService {

    //分页查询列表
    PageResult queryAttrPageList(Integer page, Integer rows, Attr attr);

    //查询关联表
    List<Value> queryList();
}
