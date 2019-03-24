package com.zk.springboot.dao;

import com.zk.springboot.model.TrainTicketEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TrainTicketMapper {
    List<TrainTicketEntity> queryTrainTicket(@Param("city") String city);
}
