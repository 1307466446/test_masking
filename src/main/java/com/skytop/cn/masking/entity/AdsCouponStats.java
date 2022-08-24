package com.skytop.cn.masking.entity;


public class AdsCouponStats {

  private java.sql.Date dt;
  private String couponId;
  private String couponName;
  private String startDate;
  private String ruleName;
  private java.math.BigDecimal reduceRate;


  public java.sql.Date getDt() {
    return dt;
  }

  public void setDt(java.sql.Date dt) {
    this.dt = dt;
  }


  public String getCouponId() {
    return couponId;
  }

  public void setCouponId(String couponId) {
    this.couponId = couponId;
  }


  public String getCouponName() {
    return couponName;
  }

  public void setCouponName(String couponName) {
    this.couponName = couponName;
  }


  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  public String getRuleName() {
    return ruleName;
  }

  public void setRuleName(String ruleName) {
    this.ruleName = ruleName;
  }


  public java.math.BigDecimal getReduceRate() {
    return reduceRate;
  }

  public void setReduceRate(java.math.BigDecimal reduceRate) {
    this.reduceRate = reduceRate;
  }

}
