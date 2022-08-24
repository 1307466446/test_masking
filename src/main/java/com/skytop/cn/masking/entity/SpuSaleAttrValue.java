package com.skytop.cn.masking.entity;


public class SpuSaleAttrValue {

  private Long id;
  private Long spuId;
  private Long baseSaleAttrId;
  private String saleAttrValueName;
  private String saleAttrName;


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


  public Long getBaseSaleAttrId() {
    return baseSaleAttrId;
  }

  public void setBaseSaleAttrId(Long baseSaleAttrId) {
    this.baseSaleAttrId = baseSaleAttrId;
  }


  public String getSaleAttrValueName() {
    return saleAttrValueName;
  }

  public void setSaleAttrValueName(String saleAttrValueName) {
    this.saleAttrValueName = saleAttrValueName;
  }


  public String getSaleAttrName() {
    return saleAttrName;
  }

  public void setSaleAttrName(String saleAttrName) {
    this.saleAttrName = saleAttrName;
  }

}
