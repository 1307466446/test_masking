package com.skytop.cn.masking.entity;


public class AdsTradeStatsByCate {

  private java.sql.Date dt;
  private Long recentDays;
  private String category1Id;
  private String category1Name;
  private String category2Id;
  private String category2Name;
  private String category3Id;
  private String category3Name;
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


  public String getCategory1Id() {
    return category1Id;
  }

  public void setCategory1Id(String category1Id) {
    this.category1Id = category1Id;
  }


  public String getCategory1Name() {
    return category1Name;
  }

  public void setCategory1Name(String category1Name) {
    this.category1Name = category1Name;
  }


  public String getCategory2Id() {
    return category2Id;
  }

  public void setCategory2Id(String category2Id) {
    this.category2Id = category2Id;
  }


  public String getCategory2Name() {
    return category2Name;
  }

  public void setCategory2Name(String category2Name) {
    this.category2Name = category2Name;
  }


  public String getCategory3Id() {
    return category3Id;
  }

  public void setCategory3Id(String category3Id) {
    this.category3Id = category3Id;
  }


  public String getCategory3Name() {
    return category3Name;
  }

  public void setCategory3Name(String category3Name) {
    this.category3Name = category3Name;
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
