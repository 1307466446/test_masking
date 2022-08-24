package com.skytop.cn.masking.entity;


public class SkuSaleAttrValue {

  private Long id;
  private Long skuId;
  private Long spuId;
  private Long saleAttrValueId;
  private Long saleAttrId;
  private String saleAttrName;
  private String saleAttrValueName;


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  public Long getSkuId() {
    return skuId;
  }

  public void setSkuId(Long skuId) {
    this.skuId = skuId;
  }


  public Long getSpuId() {
    return spuId;
  }

  public void setSpuId(Long spuId) {
    this.spuId = spuId;
  }


  public Long getSaleAttrValueId() {
    return saleAttrValueId;
  }

  public void setSaleAttrValueId(Long saleAttrValueId) {
    this.saleAttrValueId = saleAttrValueId;
  }


  public Long getSaleAttrId() {
    return saleAttrId;
  }

  public void setSaleAttrId(Long saleAttrId) {
    this.saleAttrId = saleAttrId;
  }


  public String getSaleAttrName() {
    return saleAttrName;
  }

  public void setSaleAttrName(String saleAttrName) {
    this.saleAttrName = saleAttrName;
  }


  public String getSaleAttrValueName() {
    return saleAttrValueName;
  }

  public void setSaleAttrValueName(String saleAttrValueName) {
    this.saleAttrValueName = saleAttrValueName;
  }

}
