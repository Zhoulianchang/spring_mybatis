package com.zhoulianchang.mybatis.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Indent {
    private Integer id;

    private Integer userId;

    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date createTime;

    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date endTime;

    private Integer state;

    private Integer sort;

    private String expressNum;

    private String expressCode;

    private String indentNum;

    private Double total;

    private Integer addressId;

    private String reason;

    private String message;

    private Double expressFee;

    private Integer storeId;

    private Integer macId;

    private Double commission;

    private String mtPeisongId;

    private Boolean takeawayFlag;

    private Boolean machineStatus;

    private Integer couponId;

    private Double settlementPrice;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getExpressNum() {
        return expressNum;
    }

    public void setExpressNum(String expressNum) {
        this.expressNum = expressNum;
    }

    public String getExpressCode() {
        return expressCode;
    }

    public void setExpressCode(String expressCode) {
        this.expressCode = expressCode;
    }

    public String getIndentNum() {
        return indentNum;
    }

    public void setIndentNum(String indentNum) {
        this.indentNum = indentNum;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Double getExpressFee() {
        return expressFee;
    }

    public void setExpressFee(Double expressFee) {
        this.expressFee = expressFee;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Integer getMacId() {
        return macId;
    }

    public void setMacId(Integer macId) {
        this.macId = macId;
    }

    public Double getCommission() {
        return commission;
    }

    public void setCommission(Double commission) {
        this.commission = commission;
    }

    public String getMtPeisongId() {
        return mtPeisongId;
    }

    public void setMtPeisongId(String mtPeisongId) {
        this.mtPeisongId = mtPeisongId;
    }

    public Boolean getTakeawayFlag() {
        return takeawayFlag;
    }

    public void setTakeawayFlag(Boolean takeawayFlag) {
        this.takeawayFlag = takeawayFlag;
    }

    public Boolean getMachineStatus() {
        return machineStatus;
    }

    public void setMachineStatus(Boolean machineStatus) {
        this.machineStatus = machineStatus;
    }

    public Integer getCouponId() {
        return couponId;
    }

    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }

    public Double getSettlementPrice() {
        return settlementPrice;
    }

    public void setSettlementPrice(Double settlementPrice) {
        this.settlementPrice = settlementPrice;
    }
}