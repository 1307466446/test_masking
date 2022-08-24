package com.skytop.cn.masking.entity;


public class CouponInfo {

  private Long id;
  private String couponName;
  private String couponType;
  private java.math.BigDecimal conditionAmount;
  private Long conditionNum;
  private Long activityId;
  private java.math.BigDecimal benefitAmount;
  private java.math.BigDecimal benefitDiscount;
  private java.sql.Timestamp createTime;
  private String rangeType;
  private Long limitNum;
  private Long takenCount;
  private java.sql.Timestamp startTime;
  private java.sql.Timestamp endTime;
  private java.sql.Timestamp operateTime;
  private java.sql.Timestamp expireTime;
  private String rangeDesc;


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  public String getCouponName() {
    return couponName;
  }

  public void setCouponName(String couponName) {
    this.couponName = couponName;
  }


  public String getCouponType() {
    return couponType;
  }

  public void setCouponType(String couponType) {
    this.couponType = couponType;
  }


  public java.math.BigDecimal getConditionAmount() {
    return conditionAmount;
  }

  public void setConditionAmount(java.math.BigDecimal conditionAmount) {
    this.conditionAmount = conditionAmount;
  }


  public Long getConditionNum() {
    return conditionNum;
  }

  public void setConditionNum(Long conditionNum) {
    this.conditionNum = conditionNum;
  }


  public Long getActivityId() {
    return activityId;
  }

  public void setActivityId(Long activityId) {
    this.activityId = activityId;
  }


  public java.math.BigDecimal getBenefitAmount() {
    return benefitAmount;
  }

  public void setBenefitAmount(java.math.BigDecimal benefitAmount) {
    this.benefitAmount = benefitAmount;
  }


  public java.math.BigDecimal getBenefitDiscount() {
    return benefitDiscount;
  }

  public void setBenefitDiscount(java.math.BigDecimal benefitDiscount) {
    this.benefitDiscount = benefitDiscount;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public String getRangeType() {
    return rangeType;
  }

  public void setRangeType(String rangeType) {
    this.rangeType = rangeType;
  }


  public Long getLimitNum() {
    return limitNum;
  }

  public void setLimitNum(Long limitNum) {
    this.limitNum = limitNum;
  }


  public Long getTakenCount() {
    return takenCount;
  }

  public void setTakenCount(Long takenCount) {
    this.takenCount = takenCount;
  }


  public java.sql.Timestamp getStartTime() {
    return startTime;
  }

  public void setStartTime(java.sql.Timestamp startTime) {
    this.startTime = startTime;
  }


  public java.sql.Timestamp getEndTime() {
    return endTime;
  }

  public void setEndTime(java.sql.Timestamp endTime) {
    this.endTime = endTime;
  }


  public java.sql.Timestamp getOperateTime() {
    return operateTime;
  }

  public void setOperateTime(java.sql.Timestamp operateTime) {
    this.operateTime = operateTime;
  }


  public java.sql.Timestamp getExpireTime() {
    return expireTime;
  }

  public void setExpireTime(java.sql.Timestamp expireTime) {
    this.expireTime = expireTime;
  }


  public String getRangeDesc() {
    return rangeDesc;
  }

  public void setRangeDesc(String rangeDesc) {
    this.rangeDesc = rangeDesc;
  }

}
