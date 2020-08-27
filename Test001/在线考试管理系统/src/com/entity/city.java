package com.entity;

public class city {
    //城市信息类
    private Integer id;//城市id
    private String name;//城市名称
    private Integer provinceId;//所属省份的id;

    public city() {
    }

    public city(Integer id, String name, Integer provinceId) {
        this.id = id;
        this.name = name;
        this.provinceId = provinceId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }
}
