package com.zk.springboot.controller;

import com.zk.springboot.core.ret.RetResponse;
import com.zk.springboot.core.ret.RetResult;
import com.zk.springboot.model.TrainTicketEntity;
import com.zk.springboot.service.TrainTicketService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * zpf
 * 火车票代售点
 * 2019-3-21 16:48:35
 */
@RestController
@RequestMapping(path = "/train")
public class TrainTicketController {
    private static final Logger LOGGER = LoggerFactory.getLogger(TrainTicketController.class);

    @Resource
    private TrainTicketService trainTicketServiceImpl;

    @RequestMapping(path = "/queryTrainTicket", method = RequestMethod.GET)
    public RetResult queryTrainTicket(@RequestParam String city) {

        List<TrainTicketEntity> result = trainTicketServiceImpl.queryTrainTicket(city);
        return RetResponse.makeOKRsp(result);

    }

}
