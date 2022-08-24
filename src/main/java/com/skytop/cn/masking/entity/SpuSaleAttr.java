package com.skytop.cn.masking.entity;


public class SpuSaleAttr {

  private Long id;
  private Long spuId;
  private Long baseSaleAttrId;
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


  public String getSaleAttrName() {
    return saleAttrName;
  }

  public void setSaleAttrName(String saleAttrName) {
    this.saleAttrName = saleAttrName;
  }

}
