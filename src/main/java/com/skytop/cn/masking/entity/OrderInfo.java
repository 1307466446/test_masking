package com.skytop.cn.masking.entity;


public class OrderInfo {

  private Long id;
  private String consignee;
  private String consigneeTel;
  private java.math.BigDecimal totalAmount;
  private String orderStatus;
  private Long userId;
  private String paymentWay;
  private String deliveryAddress;
  private String orderComment;
  private String outTradeNo;
  private String tradeBody;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp operateTime;
  private java.sql.Timestamp expireTime;
  private String processStatus;
  private String trackingNo;
  private Long parentOrderId;
  private String imgUrl;
  private Long provinceId;
  private java.math.BigDecimal activityReduceAmount;
  private java.math.BigDecimal couponReduceAmount;
  private java.math.BigDecimal originalTotalAmount;
  private java.math.BigDecimal feightFee;
  private java.math.BigDecimal feightFeeReduce;
  private java.sql.Timestamp refundableTime;


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
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


  public java.math.BigDecimal getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(java.math.BigDecimal totalAmount) {
    this.totalAmount = totalAmount;
  }


  public String getOrderStatus() {
    return orderStatus;
  }

  public void setOrderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
  }


  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }


  public String getPaymentWay() {
    return paymentWay;
  }

  public void setPaymentWay(String paymentWay) {
    this.paymentWay = paymentWay;
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


  public String getOutTradeNo() {
    return outTradeNo;
  }

  public void setOutTradeNo(String outTradeNo) {
    this.outTradeNo = outTradeNo;
  }


  public String getTradeBody() {
    return tradeBody;
  }

  public void setTradeBody(String tradeBody) {
    this.tradeBody = tradeBody;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public java.sql.Timestamp getOperateTime() {
    return operateTime;
  }

  public void setOperateTime(java.sql.Timestamp operateTime) {
    this.operateTime = operateTime;
  }


  public java.sql.Timestamp getExpireTime() {
    return expireTime;
  }

  public void setExpireTime(java.sql.Timestamp expireTime) {
    this.expireTime = expireTime;
  }


  public String getProcessStatus() {
    return processStatus;
  }

  public void setProcessStatus(String processStatus) {
    this.processStatus = processStatus;
  }


  public String getTrackingNo() {
    return trackingNo;
  }

  public void setTrackingNo(String trackingNo) {
    this.trackingNo = trackingNo;
  }


  public Long getParentOrderId() {
    return parentOrderId;
  }

  public void setParentOrderId(Long parentOrderId) {
    this.parentOrderId = parentOrderId;
  }


  public String getImgUrl() {
    return imgUrl;
  }

  public void setImgUrl(String imgUrl) {
    this.imgUrl = imgUrl;
  }


  public Long getProvinceId() {
    return provinceId;
  }

  public void setProvinceId(Long provinceId) {
    this.provinceId = provinceId;
  }


  public java.math.BigDecimal getActivityReduceAmount() {
    return activityReduceAmount;
  }

  public void setActivityReduceAmount(java.math.BigDecimal activityReduceAmount) {
    this.activityReduceAmount = activityReduceAmount;
  }


  public java.math.BigDecimal getCouponReduceAmount() {
    return couponReduceAmount;
  }

  public void setCouponReduceAmount(java.math.BigDecimal couponReduceAmount) {
    this.couponReduceAmount = couponReduceAmount;
  }


  public java.math.BigDecimal getOriginalTotalAmount() {
    return originalTotalAmount;
  }

  public void setOriginalTotalAmount(java.math.BigDecimal originalTotalAmount) {
    this.originalTotalAmount = originalTotalAmount;
  }


  public java.math.BigDecimal getFeightFee() {
    return feightFee;
  }

  public void setFeightFee(java.math.BigDecimal feightFee) {
    this.feightFee = feightFee;
  }


  public java.math.BigDecimal getFeightFeeReduce() {
    return feightFeeReduce;
  }

  public void setFeightFeeReduce(java.math.BigDecimal feightFeeReduce) {
    this.feightFeeReduce = feightFeeReduce;
  }


  public java.sql.Timestamp getRefundableTime() {
    return refundableTime;
  }

  public void setRefundableTime(java.sql.Timestamp refundableTime) {
    this.refundableTime = refundableTime;
  }

}
