package com.skytop.cn.masking.entity;


public class BaseAttrInfo {

  private Long id;
  private String attrName;
  private Long categoryId;
  private Long categoryLevel;


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  public String getAttrName() {
    return attrName;
  }

  public void setAttrName(String attrName) {
    this.attrName = attrName;
  }


  public Long getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Long categoryId) {
    this.categoryId = categoryId;
  }


  public Long getCategoryLevel() {
    return categoryLevel;
  }

  public void setCategoryLevel(Long categoryLevel) {
    this.categoryLevel = categoryLevel;
  }

}
