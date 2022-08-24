package com.skytop.cn.masking.entity;


public class CartInfo {

  private Long id;
  private String userId;
  private Long skuId;
  private java.math.BigDecimal cartPrice;
  private Long skuNum;
  private String imgUrl;
  private String skuName;
  private Long isChecked;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp operateTime;
  private Long isOrdered;
  private java.sql.Timestamp orderTime;
  private String sourceType;
  private Long sourceId;


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  public Long getSkuId() {
    return skuId;
  }

  public void setSkuId(Long skuId) {
    this.skuId = skuId;
  }


  public java.math.BigDecimal getCartPrice() {
    return cartPrice;
  }

  public void setCartPrice(java.math.BigDecimal cartPrice) {
    this.cartPrice = cartPrice;
  }


  public Long getSkuNum() {
    return skuNum;
  }

  public void setSkuNum(Long skuNum) {
    this.skuNum = skuNum;
  }


  public String getImgUrl() {
    return imgUrl;
  }

  public void setImgUrl(String imgUrl) {
    this.imgUrl = imgUrl;
  }


  public String getSkuName() {
    return skuName;
  }

  public void setSkuName(String skuName) {
    this.skuName = skuName;
  }


  public Long getIsChecked() {
    return isChecked;
  }

  public void setIsChecked(Long isChecked) {
    this.isChecked = isChecked;
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


  public Long getIsOrdered() {
    return isOrdered;
  }

  public void setIsOrdered(Long isOrdered) {
    this.isOrdered = isOrdered;
  }


  public java.sql.Timestamp getOrderTime() {
    return orderTime;
  }

  public void setOrderTime(java.sql.Timestamp orderTime) {
    this.orderTime = orderTime;
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

}
