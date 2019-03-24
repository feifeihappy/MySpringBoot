package com.zk.springboot.service;

import com.zk.springboot.model.TrainTicketEntity;

import java.util.List;


public interface TrainTicketService {
    List<TrainTicketEntity> queryTrainTicket(String city);
}
