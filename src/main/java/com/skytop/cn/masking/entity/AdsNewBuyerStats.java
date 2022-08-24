package com.skytop.cn.masking.entity;


public class AdsNewBuyerStats {

  private java.sql.Date dt;
  private Long recentDays;
  private Long newOrderUserCount;
  private Long newPaymentUserCount;


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


  public Long getNewOrderUserCount() {
    return newOrderUserCount;
  }

  public void setNewOrderUserCount(Long newOrderUserCount) {
    this.newOrderUserCount = newOrderUserCount;
  }


  public Long getNewPaymentUserCount() {
    return newPaymentUserCount;
  }

  public void setNewPaymentUserCount(Long newPaymentUserCount) {
    this.newPaymentUserCount = newPaymentUserCount;
  }

}
