package com.zk.springboot.service.impl;

import com.zk.springboot.dao.TrainTicketMapper;
import com.zk.springboot.model.TrainTicketEntity;
import com.zk.springboot.service.TrainTicketService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: MySpringBoot
 * @description: 省市区服务
 * @author: zpf
 * @create: 2019-01-13 13:06
 **/
@Service("trainTicketServiceImpl")
public class TrainTicketServiceImpl implements TrainTicketService {

    @Resource
    private TrainTicketMapper trainTicketMapper;

    @Override
    public List<TrainTicketEntity> queryTrainTicket(String city) {
        List<TrainTicketEntity> trainTicketEntities = trainTicketMapper.queryTrainTicket(city);
//        TrainTicketEntity trainTicketEntity = null;
//        if (trainTicketEntities!=null&&!trainTicketEntities.isEmpty()){
//             trainTicketEntity = trainTicketEntities.get(0);
//        }
        return trainTicketEntities;
    }
}
