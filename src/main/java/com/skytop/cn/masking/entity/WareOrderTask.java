package com.skytop.cn.masking.entity;


public class WareOrderTask {

  private Long id;
  private Long orderId;
  private String consignee;
  private String consigneeTel;
  private String deliveryAddress;
  private String orderComment;
  private String paymentWay;
  private String taskStatus;
  private String orderBody;
  private String trackingNo;
  private java.sql.Timestamp createTime;
  private Long wareId;
  private String taskComment;


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  public Long getOrderId() {
    return orderId;
  }

  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }


  public String getConsignee() {
    return consignee;
  }

  public void setConsignee(String consignee) {
    this.consignee = consignee;
  }


  public String getConsigneeTel() {
    return consigneeTel;
  }

  public void setConsigneeTel(String consigneeTel) {
    this.consigneeTel = consigneeTel;
  }


  public String getDeliveryAddress() {
    return deliveryAddress;
  }

  public void setDeliveryAddress(String deliveryAddress) {
    this.deliveryAddress = deliveryAddress;
  }


  public String getOrderComment() {
    return orderComment;
  }

  public void setOrderComment(String orderComment) {
    this.orderComment = orderComment;
  }


  public String getPaymentWay() {
    return paymentWay;
  }

  public void setPaymentWay(String paymentWay) {
    this.paymentWay = paymentWay;
  }


  public String getTaskStatus() {
    return taskStatus;
  }

  public void setTaskStatus(String taskStatus) {
    this.taskStatus = taskStatus;
  }


  public String getOrderBody() {
    return orderBody;
  }

  public void setOrderBody(String orderBody) {
    this.orderBody = orderBody;
  }


  public String getTrackingNo() {
    return trackingNo;
  }

  public void setTrackingNo(String trackingNo) {
    this.trackingNo = trackingNo;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public Long getWareId() {
    return wareId;
  }

  public void setWareId(Long wareId) {
    this.wareId = wareId;
  }


  public String getTaskComment() {
    return taskComment;
  }

  public void setTaskComment(String taskComment) {
    this.taskComment = taskComment;
  }

}
