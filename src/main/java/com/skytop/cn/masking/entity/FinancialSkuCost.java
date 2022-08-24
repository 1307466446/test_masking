package com.skytop.cn.masking.entity;


public class FinancialSkuCost {

  private String id;
  private Long skuId;
  private String skuName;
  private String busiDate;
  private String isLastest;
  private java.math.BigDecimal skuCost;
  private java.sql.Timestamp createTime;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
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


  public String getBusiDate() {
    return busiDate;
  }

  public void setBusiDate(String busiDate) {
    this.busiDate = busiDate;
  }


  public String getIsLastest() {
    return isLastest;
  }

  public void setIsLastest(String isLastest) {
    this.isLastest = isLastest;
  }


  public java.math.BigDecimal getSkuCost() {
    return skuCost;
  }

  public void setSkuCost(java.math.BigDecimal skuCost) {
    this.skuCost = skuCost;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }

}
