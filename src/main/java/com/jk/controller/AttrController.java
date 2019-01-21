package com.jk.controller;

import com.jk.bean.Attr;
import com.jk.bean.Value;
import com.jk.service.AttrService;
import com.jk.utils.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("attr")
public class AttrController {

    @Autowired
    private AttrService attrService;

    //跳转分页列表
    @RequestMapping("toAttrPage")
    public String toAttrPage() {
        return "collegePage";
    }

    //分页查询列表
    @RequestMapping("queryAttrPageList")
    @ResponseBody
    public PageResult queryAttrPageList(Integer page, Integer rows, Attr attr) {
        PageResult queryAttrPageList = attrService.queryAttrPageList(page,rows,attr);
        return queryAttrPageList;
    }

    //查询关联表
    @RequestMapping("queryValueList")
    @ResponseBody
    public List<Value> queryValueList(){
        List<Value> queryTypeList = attrService.queryList();
        return queryTypeList;
    }
}
