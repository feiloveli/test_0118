package com.jk.mapper;

import com.jk.bean.Attr;
import com.jk.bean.Value;

import java.util.HashMap;
import java.util.List;

public interface AttrMapper {

    //分页统计数量
    int queryAttrPageCount(HashMap<String, Object> params);

    //分页查询
    List<Attr> queryAttrPageList(HashMap<String, Object> params);

    //查询关联表
    List<Value> queryList();
}
