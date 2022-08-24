package com.skytop.cn.masking.entity;


public class OrderDetail {

  private Long id;
  private Long orderId;
  private Long skuId;
  private String skuName;
  private String imgUrl;
  private java.math.BigDecimal orderPrice;
  private Long skuNum;
  private java.sql.Timestamp createTime;
  private String sourceType;
  private Long sourceId;
  private java.math.BigDecimal splitTotalAmount;
  private java.math.BigDecimal splitActivityAmount;
  private java.math.BigDecimal splitCouponAmount;


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


  public Long getSkuId() {
    return skuId;
  }

  public void setSkuId(Long skuId) {
    this.skuId = skuId;
  }


  public String getSkuName() {
    return skuName;
  }

  public void setSkuName(String skuName) {
    this.skuName = skuName;
  }


  public String getImgUrl() {
    return imgUrl;
  }

  public void setImgUrl(String imgUrl) {
    this.imgUrl = imgUrl;
  }


  public java.math.BigDecimal getOrderPrice() {
    return orderPrice;
  }

  public void setOrderPrice(java.math.BigDecimal orderPrice) {
    this.orderPrice = orderPrice;
  }


  public Long getSkuNum() {
    return skuNum;
  }

  public void setSkuNum(Long skuNum) {
    this.skuNum = skuNum;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public String getSourceType() {
    return sourceType;
  }

  public void setSourceType(String sourceType) {
    this.sourceType = sourceType;
  }


  public Long getSourceId() {
    return sourceId;
  }

  public void setSourceId(Long sourceId) {
    this.sourceId = sourceId;
  }


  public java.math.BigDecimal getSplitTotalAmount() {
    return splitTotalAmount;
  }

  public void setSplitTotalAmount(java.math.BigDecimal splitTotalAmount) {
    this.splitTotalAmount = splitTotalAmount;
  }


  public java.math.BigDecimal getSplitActivityAmount() {
    return splitActivityAmount;
  }

  public void setSplitActivityAmount(java.math.BigDecimal splitActivityAmount) {
    this.splitActivityAmount = splitActivityAmount;
  }


  public java.math.BigDecimal getSplitCouponAmount() {
    return splitCouponAmount;
  }

  public void setSplitCouponAmount(java.math.BigDecimal splitCouponAmount) {
    this.splitCouponAmount = splitCouponAmount;
  }

}
