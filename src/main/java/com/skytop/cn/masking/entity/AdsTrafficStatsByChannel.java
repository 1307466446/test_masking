package com.skytop.cn.masking.entity;


public class AdsTrafficStatsByChannel {

  private java.sql.Date dt;
  private Long recentDays;
  private String channel;
  private Long uvCount;
  private Long avgDurationSec;
  private Long avgPageCount;
  private Long svCount;
  private java.math.BigDecimal bounceRate;


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


  public String getChannel() {
    return channel;
  }

  public void setChannel(String channel) {
    this.channel = channel;
  }


  public Long getUvCount() {
    return uvCount;
  }

  public void setUvCount(Long uvCount) {
    this.uvCount = uvCount;
  }


  public Long getAvgDurationSec() {
    return avgDurationSec;
  }

  public void setAvgDurationSec(Long avgDurationSec) {
    this.avgDurationSec = avgDurationSec;
  }


  public Long getAvgPageCount() {
    return avgPageCount;
  }

  public void setAvgPageCount(Long avgPageCount) {
    this.avgPageCount = avgPageCount;
  }


  public Long getSvCount() {
    return svCount;
  }

  public void setSvCount(Long svCount) {
    this.svCount = svCount;
  }


  public java.math.BigDecimal getBounceRate() {
    return bounceRate;
  }

  public void setBounceRate(java.math.BigDecimal bounceRate) {
    this.bounceRate = bounceRate;
  }

}
