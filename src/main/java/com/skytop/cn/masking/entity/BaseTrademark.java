package com.skytop.cn.masking.entity;


public class BaseTrademark {

  private Long id;
  private String tmName;
  private String logoUrl;


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  public String getTmName() {
    return tmName;
  }

  public void setTmName(String tmName) {
    this.tmName = tmName;
  }


  public String getLogoUrl() {
    return logoUrl;
  }

  public void setLogoUrl(String logoUrl) {
    this.logoUrl = logoUrl;
  }

}
