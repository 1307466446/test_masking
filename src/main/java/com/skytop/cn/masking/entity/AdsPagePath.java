package com.skytop.cn.masking.entity;


public class AdsPagePath {

  private java.sql.Date dt;
  private Long recentDays;
  private String source;
  private String target;
  private Long pathCount;


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


  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }


  public String getTarget() {
    return target;
  }

  public void setTarget(String target) {
    this.target = target;
  }


  public Long getPathCount() {
    return pathCount;
  }

  public void setPathCount(Long pathCount) {
    this.pathCount = pathCount;
  }

}
