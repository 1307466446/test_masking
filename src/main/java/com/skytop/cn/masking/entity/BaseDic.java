package com.skytop.cn.masking.entity;


public class BaseDic {

  private String dicCode;
  private String dicName;
  private String parentCode;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp operateTime;


  public String getDicCode() {
    return dicCode;
  }

  public void setDicCode(String dicCode) {
    this.dicCode = dicCode;
  }


  public String getDicName() {
    return dicName;
  }

  public void setDicName(String dicName) {
    this.dicName = dicName;
  }


  public String getParentCode() {
    return parentCode;
  }

  public void setParentCode(String parentCode) {
    this.parentCode = parentCode;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public java.sql.Timestamp getOperateTime() {
    return operateTime;
  }

  public void setOperateTime(java.sql.Timestamp operateTime) {
    this.operateTime = operateTime;
  }

}
