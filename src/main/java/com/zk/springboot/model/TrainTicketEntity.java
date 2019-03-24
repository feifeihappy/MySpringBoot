package com.zk.springboot.model;

import java.time.LocalTime;

/**
 * zpf
 * 全国火车票代售点
 * 2019-3-21 16:29:04
 */
public class TrainTicketEntity {

    private Integer id;
    private String province;
    private String city;
    private String county;
    private String agencyName;
    private String address;
    private String phoneNo;
    private LocalTime startTimeAm;
    private LocalTime stopTimeAm;
    private LocalTime startTimePm;
    private LocalTime stopTimePm;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public LocalTime getStartTimeAm() {
        return startTimeAm;
    }

    public void setStartTimeAm(LocalTime startTimeAm) {
        this.startTimeAm = startTimeAm;
    }

    public LocalTime getStopTimeAm() {
        return stopTimeAm;
    }

    public void setStopTimeAm(LocalTime stopTimeAm) {
        this.stopTimeAm = stopTimeAm;
    }

    public LocalTime getStartTimePm() {
        return startTimePm;
    }

    public void setStartTimePm(LocalTime startTimePm) {
        this.startTimePm = startTimePm;
    }

    public LocalTime getStopTimePm() {
        return stopTimePm;
    }

    public void setStopTimePm(LocalTime stopTimePm) {
        this.stopTimePm = stopTimePm;
    }
}
