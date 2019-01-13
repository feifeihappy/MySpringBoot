package com.zk.springboot.dao;

import com.zk.springboot.model.ProvinceEntity;

import java.util.List;

public interface ProvincesMapper {
    List<ProvinceEntity> queryCityName(ProvinceEntity provinceEntity);
}
