package com.skytop.cn.masking.entity;


public class BaseProvince {

  private Long id;
  private String name;
  private String regionId;
  private String areaCode;
  private String isoCode;
  private String iso31662;


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getRegionId() {
    return regionId;
  }

  public void setRegionId(String regionId) {
    this.regionId = regionId;
  }


  public String getAreaCode() {
    return areaCode;
  }

  public void setAreaCode(String areaCode) {
    this.areaCode = areaCode;
  }


  public String getIsoCode() {
    return isoCode;
  }

  public void setIsoCode(String isoCode) {
    this.isoCode = isoCode;
  }


  public String getIso31662() {
    return iso31662;
  }

  public void setIso31662(String iso31662) {
    this.iso31662 = iso31662;
  }

}
