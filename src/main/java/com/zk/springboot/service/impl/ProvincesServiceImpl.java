package com.zk.springboot.service.impl;

import com.github.pagehelper.PageHelper;
import com.zk.springboot.dao.ProvincesMapper;
import com.zk.springboot.model.ProvinceEntity;
import com.zk.springboot.service.ProvincesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: MySpringBoot
 * @description: 省市区服务
 * @author: zpf
 * @create: 2019-01-13 13:06
 **/
@Service("provincesServiceImpl")
public class ProvincesServiceImpl implements ProvincesService {

    @Resource
    private ProvincesMapper provincesMapper;

    @Override
    public List<ProvinceEntity> queryCityName(ProvinceEntity provinceEntity) {
        //开启分页查询，写在查询语句上方
        //只有紧跟在PageHelper.startPage方法后的第一个Mybatis的查询（Select）方法会被分页。
        PageHelper.startPage(provinceEntity.getPageNum(), provinceEntity.getPageSize());
        List<ProvinceEntity> result = provincesMapper.queryCityName(provinceEntity);
//        PageInfo<ProvinceEntity> pageInfo = new PageInfo<>(result);
        return result;
    }
}
