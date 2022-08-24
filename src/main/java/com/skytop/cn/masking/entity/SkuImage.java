package com.skytop.cn.masking.entity;


public class SkuImage {

  private Long id;
  private Long skuId;
  private String imgName;
  private String imgUrl;
  private Long spuImgId;
  private String isDefault;


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


  public String getImgName() {
    return imgName;
  }

  public void setImgName(String imgName) {
    this.imgName = imgName;
  }


  public String getImgUrl() {
    return imgUrl;
  }

  public void setImgUrl(String imgUrl) {
    this.imgUrl = imgUrl;
  }


  public Long getSpuImgId() {
    return spuImgId;
  }

  public void setSpuImgId(Long spuImgId) {
    this.spuImgId = spuImgId;
  }


  public String getIsDefault() {
    return isDefault;
  }

  public void setIsDefault(String isDefault) {
    this.isDefault = isDefault;
  }

}
