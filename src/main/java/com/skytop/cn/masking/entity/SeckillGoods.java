package com.skytop.cn.masking.entity;


public class SeckillGoods {

  private Long id;
  private Long spuId;
  private Long skuId;
  private String skuName;
  private String skuDefaultImg;
  private java.math.BigDecimal price;
  private java.math.BigDecimal costPrice;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp checkTime;
  private String status;
  private java.sql.Timestamp startTime;
  private java.sql.Timestamp endTime;
  private Long num;
  private Long stockCount;
  private String skuDesc;


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  public Long getSpuId() {
    return spuId;
  }

  public void setSpuId(Long spuId) {
    this.spuId = spuId;
  }


  public Long getSkuId() {
    return skuId;
  }

  public void setSkuId(Long skuId) {
    this.skuId = skuId;
  }


  public String getSkuName() {
    return skuName;
  }

  public void setSkuName(String skuName) {
    this.skuName = skuName;
  }


  public String getSkuDefaultImg() {
    return skuDefaultImg;
  }

  public void setSkuDefaultImg(String skuDefaultImg) {
    this.skuDefaultImg = skuDefaultImg;
  }


  public java.math.BigDecimal getPrice() {
    return price;
  }

  public void setPrice(java.math.BigDecimal price) {
    this.price = price;
  }


  public java.math.BigDecimal getCostPrice() {
    return costPrice;
  }

  public void setCostPrice(java.math.BigDecimal costPrice) {
    this.costPrice = costPrice;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public java.sql.Timestamp getCheckTime() {
    return checkTime;
  }

  public void setCheckTime(java.sql.Timestamp checkTime) {
    this.checkTime = checkTime;
  }


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public java.sql.Timestamp getStartTime() {
    return startTime;
  }

  public void setStartTime(java.sql.Timestamp startTime) {
    this.startTime = startTime;
  }


  public java.sql.Timestamp getEndTime() {
    return endTime;
  }

  public void setEndTime(java.sql.Timestamp endTime) {
    this.endTime = endTime;
  }


  public Long getNum() {
    return num;
  }

  public void setNum(Long num) {
    this.num = num;
  }


  public Long getStockCount() {
    return stockCount;
  }

  public void setStockCount(Long stockCount) {
    this.stockCount = stockCount;
  }


  public String getSkuDesc() {
    return skuDesc;
  }

  public void setSkuDesc(String skuDesc) {
    this.skuDesc = skuDesc;
  }

}
