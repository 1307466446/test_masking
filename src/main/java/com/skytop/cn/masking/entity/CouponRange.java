package com.skytop.cn.masking.entity;


public class CouponRange {

  private Long id;
  private Long couponId;
  private String rangeType;
  private Long rangeId;


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


  public String getRangeType() {
    return rangeType;
  }

  public void setRangeType(String rangeType) {
    this.rangeType = rangeType;
  }


  public Long getRangeId() {
    return rangeId;
  }

  public void setRangeId(Long rangeId) {
    this.rangeId = rangeId;
  }

}
