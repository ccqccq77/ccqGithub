package com.jd.o2o.ccq.domain.web;

import java.sql.Timestamp;

/**
 * Created by ccq on 2017/9/4.
 */
public class Invoice {

    private Long invoiceId;//发票id
    private String pin;//到家用户标识
    private String jdPin;//到家用户标识
    private Integer invoiceType;//发票类型（0、增值税）
    private Integer titleType;//抬头类型（0、个人；1、企业）
    private String titleContent;//抬头内容
    private String taxNum;//税号
    private String invoiceContent;//发票内容
    private String userEmail;//用户邮箱
    private Timestamp updateTime;// 更新数据库时间戳
    private Byte yn;// 删除标识（0、正常；1、删除）

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getJdPin() {
        return jdPin;
    }

    public void setJdPin(String jdPin) {
        this.jdPin = jdPin;
    }

    public Integer getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(Integer invoiceType) {
        this.invoiceType = invoiceType;
    }

    public Integer getTitleType() {
        return titleType;
    }

    public void setTitleType(Integer titleType) {
        this.titleType = titleType;
    }

    public String getTitleContent() {
        return titleContent;
    }

    public void setTitleContent(String titleContent) {
        this.titleContent = titleContent;
    }

    public String getTaxNum() {
        return taxNum;
    }

    public void setTaxNum(String taxNum) {
        this.taxNum = taxNum;
    }

    public String getInvoiceContent() {
        return invoiceContent;
    }

    public void setInvoiceContent(String invoiceContent) {
        this.invoiceContent = invoiceContent;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public Long getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(Long invoiceId) {
        this.invoiceId = invoiceId;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    public Byte getYn() {
        return yn;
    }

    public void setYn(Byte yn) {
        this.yn = yn;
    }
}
