package com.skytop.cn.masking.entity;


public class RefundPayment {

  private Long id;
  private String outTradeNo;
  private Long orderId;
  private Long skuId;
  private String paymentType;
  private String tradeNo;
  private java.math.BigDecimal totalAmount;
  private String subject;
  private String refundStatus;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp callbackTime;
  private String callbackContent;


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  public String getOutTradeNo() {
    return outTradeNo;
  }

  public void setOutTradeNo(String outTradeNo) {
    this.outTradeNo = outTradeNo;
  }


  public Long getOrderId() {
    return orderId;
  }

  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }


  public Long getSkuId() {
    return skuId;
  }

  public void setSkuId(Long skuId) {
    this.skuId = skuId;
  }


  public String getPaymentType() {
    return paymentType;
  }

  public void setPaymentType(String paymentType) {
    this.paymentType = paymentType;
  }


  public String getTradeNo() {
    return tradeNo;
  }

  public void setTradeNo(String tradeNo) {
    this.tradeNo = tradeNo;
  }


  public java.math.BigDecimal getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(java.math.BigDecimal totalAmount) {
    this.totalAmount = totalAmount;
  }


  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }


  public String getRefundStatus() {
    return refundStatus;
  }

  public void setRefundStatus(String refundStatus) {
    this.refundStatus = refundStatus;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public java.sql.Timestamp getCallbackTime() {
    return callbackTime;
  }

  public void setCallbackTime(java.sql.Timestamp callbackTime) {
    this.callbackTime = callbackTime;
  }


  public String getCallbackContent() {
    return callbackContent;
  }

  public void setCallbackContent(String callbackContent) {
    this.callbackContent = callbackContent;
  }

}
