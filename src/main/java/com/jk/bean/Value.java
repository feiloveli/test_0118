package com.jk.bean;

import java.util.List;

public class Value {

    //private Integer id;        //编号

    private String shxzh;      //属性值

    //private String shfqy;      //是否启用

    private Integer shxm_id;   //属性id

    private String shxzh_mch;  //属性值名

    //private String chjshj;      //创建时间

    private List<Value> children;


    public String getShxzh() {
        return shxzh;
    }

    public void setShxzh(String shxzh) {
        this.shxzh = shxzh;
    }

    public Integer getShxm_id() {
        return shxm_id;
    }

    public void setShxm_id(Integer shxm_id) {
        this.shxm_id = shxm_id;
    }

    public String getShxzh_mch() {
        return shxzh_mch;
    }

    public void setShxzh_mch(String shxzh_mch) {
        this.shxzh_mch = shxzh_mch;
    }

    public List<Value> getChildren() {
        return children;
    }

    public void setChildren(List<Value> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "Value{" +
                "shxzh='" + shxzh + '\'' +
                ", shxm_id=" + shxm_id +
                ", shxzh_mch='" + shxzh_mch + '\'' +
                ", children=" + children +
                '}';
    }
}
