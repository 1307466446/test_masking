package com.skytop.cn.masking.entity;


public class FavorInfo {

  private Long id;
  private Long userId;
  private Long skuId;
  private Long spuId;
  private String isCancel;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp cancelTime;


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
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


  public String getIsCancel() {
    return isCancel;
  }

  public void setIsCancel(String isCancel) {
    this.isCancel = isCancel;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public java.sql.Timestamp getCancelTime() {
    return cancelTime;
  }

  public void setCancelTime(java.sql.Timestamp cancelTime) {
    this.cancelTime = cancelTime;
  }

}
