package com.skytop.cn.masking.entity;


public class AdsRepeatPurchaseByTm {

  private java.sql.Date dt;
  private Long recentDays;
  private String tmId;
  private String tmName;
  private java.math.BigDecimal orderRepeatRate;


  public java.sql.Date getDt() {
    return dt;
  }

  public void setDt(java.sql.Date dt) {
    this.dt = dt;
  }


  public Long getRecentDays() {
    return recentDays;
  }

  public void setRecentDays(Long recentDays) {
    this.recentDays = recentDays;
  }


  public String getTmId() {
    return tmId;
  }

  public void setTmId(String tmId) {
    this.tmId = tmId;
  }


  public String getTmName() {
    return tmName;
  }

  public void setTmName(String tmName) {
    this.tmName = tmName;
  }


  public java.math.BigDecimal getOrderRepeatRate() {
    return orderRepeatRate;
  }

  public void setOrderRepeatRate(java.math.BigDecimal orderRepeatRate) {
    this.orderRepeatRate = orderRepeatRate;
  }

}
