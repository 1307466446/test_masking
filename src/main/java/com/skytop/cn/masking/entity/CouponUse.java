package com.skytop.cn.masking.entity;


public class CouponUse {

  private Long id;
  private Long couponId;
  private Long userId;
  private Long orderId;
  private String couponStatus;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp getTime;
  private java.sql.Timestamp usingTime;
  private java.sql.Timestamp usedTime;
  private java.sql.Timestamp expireTime;


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  public Long getCouponId() {
    return couponId;
  }

  public void setCouponId(Long couponId) {
    this.couponId = couponId;
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


  public String getCouponStatus() {
    return couponStatus;
  }

  public void setCouponStatus(String couponStatus) {
    this.couponStatus = couponStatus;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public java.sql.Timestamp getGetTime() {
    return getTime;
  }

  public void setGetTime(java.sql.Timestamp getTime) {
    this.getTime = getTime;
  }


  public java.sql.Timestamp getUsingTime() {
    return usingTime;
  }

  public void setUsingTime(java.sql.Timestamp usingTime) {
    this.usingTime = usingTime;
  }


  public java.sql.Timestamp getUsedTime() {
    return usedTime;
  }

  public void setUsedTime(java.sql.Timestamp usedTime) {
    this.usedTime = usedTime;
  }


  public java.sql.Timestamp getExpireTime() {
    return expireTime;
  }

  public void setExpireTime(java.sql.Timestamp expireTime) {
    this.expireTime = expireTime;
  }

}
