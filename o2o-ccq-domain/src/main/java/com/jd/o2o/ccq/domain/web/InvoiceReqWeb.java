package com.jd.o2o.ccq.domain.web;

/**
 * Created by ccq on 2017/9/6.
 */
public class InvoiceReqWeb {
    private Long invoiceId;//发票id
    private Integer titleType;//抬头类型（0、代表个人；1、企业）
    private String titleContent;//抬头内容
    private String taxNum;//纳税人识别号
    private String userEmail;//用户邮箱

    public Long getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(Long invoiceId) {
        this.invoiceId = invoiceId;
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

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
}
