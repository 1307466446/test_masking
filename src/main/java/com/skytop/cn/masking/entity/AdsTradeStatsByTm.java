package com.skytop.cn.masking.entity;


public class AdsTradeStatsByTm {

  private java.sql.Date dt;
  private Long recentDays;
  private String tmId;
  private String tmName;
  private Long orderCount;
  private Long orderUserCount;
  private Long orderRefundCount;
  private Long orderRefundUserCount;


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


  public Long getOrderCount() {
    return orderCount;
  }

  public void setOrderCount(Long orderCount) {
    this.orderCount = orderCount;
  }


  public Long getOrderUserCount() {
    return orderUserCount;
  }

  public void setOrderUserCount(Long orderUserCount) {
    this.orderUserCount = orderUserCount;
  }


  public Long getOrderRefundCount() {
    return orderRefundCount;
  }

  public void setOrderRefundCount(Long orderRefundCount) {
    this.orderRefundCount = orderRefundCount;
  }


  public Long getOrderRefundUserCount() {
    return orderRefundUserCount;
  }

  public void setOrderRefundUserCount(Long orderRefundUserCount) {
    this.orderRefundUserCount = orderRefundUserCount;
  }

}
