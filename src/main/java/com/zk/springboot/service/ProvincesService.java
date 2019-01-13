package com.zk.springboot.service;

import com.zk.springboot.model.ProvinceEntity;

import java.util.List;

public interface ProvincesService {
    List<ProvinceEntity> queryCityName(ProvinceEntity provinceEntity);
}
