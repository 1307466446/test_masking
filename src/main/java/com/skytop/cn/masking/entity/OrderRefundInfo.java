package com.skytop.cn.masking.entity;


public class OrderRefundInfo {

  private Long id;
  private Long userId;
  private Long orderId;
  private Long skuId;
  private String refundType;
  private Long refundNum;
  private java.math.BigDecimal refundAmount;
  private String refundReasonType;
  private String refundReasonTxt;
  private String refundStatus;
  private java.sql.Timestamp createTime;


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
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


  public String getRefundType() {
    return refundType;
  }

  public void setRefundType(String refundType) {
    this.refundType = refundType;
  }


  public Long getRefundNum() {
    return refundNum;
  }

  public void setRefundNum(Long refundNum) {
    this.refundNum = refundNum;
  }


  public java.math.BigDecimal getRefundAmount() {
    return refundAmount;
  }

  public void setRefundAmount(java.math.BigDecimal refundAmount) {
    this.refundAmount = refundAmount;
  }


  public String getRefundReasonType() {
    return refundReasonType;
  }

  public void setRefundReasonType(String refundReasonType) {
    this.refundReasonType = refundReasonType;
  }


  public String getRefundReasonTxt() {
    return refundReasonTxt;
  }

  public void setRefundReasonTxt(String refundReasonTxt) {
    this.refundReasonTxt = refundReasonTxt;
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

}
