package com.skytop.cn.masking.entity;


public class SkuInfo {

  private Long id;
  private Long spuId;
  private java.math.BigDecimal price;
  private String skuName;
  private String skuDesc;
  private java.math.BigDecimal weight;
  private Long tmId;
  private Long category3Id;
  private String skuDefaultImg;
  private Long isSale;
  private java.sql.Timestamp createTime;


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


  public java.math.BigDecimal getPrice() {
    return price;
  }

  public void setPrice(java.math.BigDecimal price) {
    this.price = price;
  }


  public String getSkuName() {
    return skuName;
  }

  public void setSkuName(String skuName) {
    this.skuName = skuName;
  }


  public String getSkuDesc() {
    return skuDesc;
  }

  public void setSkuDesc(String skuDesc) {
    this.skuDesc = skuDesc;
  }


  public java.math.BigDecimal getWeight() {
    return weight;
  }

  public void setWeight(java.math.BigDecimal weight) {
    this.weight = weight;
  }


  public Long getTmId() {
    return tmId;
  }

  public void setTmId(Long tmId) {
    this.tmId = tmId;
  }


  public Long getCategory3Id() {
    return category3Id;
  }

  public void setCategory3Id(Long category3Id) {
    this.category3Id = category3Id;
  }


  public String getSkuDefaultImg() {
    return skuDefaultImg;
  }

  public void setSkuDefaultImg(String skuDefaultImg) {
    this.skuDefaultImg = skuDefaultImg;
  }


  public Long getIsSale() {
    return isSale;
  }

  public void setIsSale(Long isSale) {
    this.isSale = isSale;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }

}
