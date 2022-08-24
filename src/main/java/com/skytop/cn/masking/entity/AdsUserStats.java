package com.skytop.cn.masking.entity;


public class AdsUserStats {

  private java.sql.Date dt;
  private Long recentDays;
  private Long newUserCount;
  private Long activeUserCount;


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


  public Long getNewUserCount() {
    return newUserCount;
  }

  public void setNewUserCount(Long newUserCount) {
    this.newUserCount = newUserCount;
  }


  public Long getActiveUserCount() {
    return activeUserCount;
  }

  public void setActiveUserCount(Long activeUserCount) {
    this.activeUserCount = activeUserCount;
  }

}
