package com.skytop.cn.masking.entity;


public class AdsUserRetention {

  private java.sql.Date dt;
  private String createDate;
  private Long retentionDay;
  private Long retentionCount;
  private Long newUserCount;
  private java.math.BigDecimal retentionRate;


  public java.sql.Date getDt() {
    return dt;
  }

  public void setDt(java.sql.Date dt) {
    this.dt = dt;
  }


  public String getCreateDate() {
    return createDate;
  }

  public void setCreateDate(String createDate) {
    this.createDate = createDate;
  }


  public Long getRetentionDay() {
    return retentionDay;
  }

  public void setRetentionDay(Long retentionDay) {
    this.retentionDay = retentionDay;
  }


  public Long getRetentionCount() {
    return retentionCount;
  }

  public void setRetentionCount(Long retentionCount) {
    this.retentionCount = retentionCount;
  }


  public Long getNewUserCount() {
    return newUserCount;
  }

  public void setNewUserCount(Long newUserCount) {
    this.newUserCount = newUserCount;
  }


  public java.math.BigDecimal getRetentionRate() {
    return retentionRate;
  }

  public void setRetentionRate(java.math.BigDecimal retentionRate) {
    this.retentionRate = retentionRate;
  }

}
