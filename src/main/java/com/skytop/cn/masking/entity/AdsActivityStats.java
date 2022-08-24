package com.skytop.cn.masking.entity;


public class AdsActivityStats {

  private java.sql.Date dt;
  private String activityId;
  private String activityName;
  private String startDate;
  private java.math.BigDecimal reduceRate;


  public java.sql.Date getDt() {
    return dt;
  }

  public void setDt(java.sql.Date dt) {
    this.dt = dt;
  }


  public String getActivityId() {
    return activityId;
  }

  public void setActivityId(String activityId) {
    this.activityId = activityId;
  }


  public String getActivityName() {
    return activityName;
  }

  public void setActivityName(String activityName) {
    this.activityName = activityName;
  }


  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  public java.math.BigDecimal getReduceRate() {
    return reduceRate;
  }

  public void setReduceRate(java.math.BigDecimal reduceRate) {
    this.reduceRate = reduceRate;
  }

}
