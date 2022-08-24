package com.skytop.cn.masking.entity;


public class AdsOrderByProvince {

  private java.sql.Date dt;
  private Long recentDays;
  private String provinceId;
  private String provinceName;
  private String areaCode;
  private String isoCode;
  private String isoCode31662;
  private Long orderCount;
  private java.math.BigDecimal orderTotalAmount;


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


  public String getProvinceId() {
    return provinceId;
  }

  public void setProvinceId(String provinceId) {
    this.provinceId = provinceId;
  }


  public String getProvinceName() {
    return provinceName;
  }

  public void setProvinceName(String provinceName) {
    this.provinceName = provinceName;
  }


  public String getAreaCode() {
    return areaCode;
  }

  public void setAreaCode(String areaCode) {
    this.areaCode = areaCode;
  }


  public String getIsoCode() {
    return isoCode;
  }

  public void setIsoCode(String isoCode) {
    this.isoCode = isoCode;
  }


  public String getIsoCode31662() {
    return isoCode31662;
  }

  public void setIsoCode31662(String isoCode31662) {
    this.isoCode31662 = isoCode31662;
  }


  public Long getOrderCount() {
    return orderCount;
  }

  public void setOrderCount(Long orderCount) {
    this.orderCount = orderCount;
  }


  public java.math.BigDecimal getOrderTotalAmount() {
    return orderTotalAmount;
  }

  public void setOrderTotalAmount(java.math.BigDecimal orderTotalAmount) {
    this.orderTotalAmount = orderTotalAmount;
  }

}
