package com.skytop.cn.masking.entity;


public class ActivityRule {

  private Long id;
  private Long activityId;
  private String activityType;
  private java.math.BigDecimal conditionAmount;
  private Long conditionNum;
  private java.math.BigDecimal benefitAmount;
  private java.math.BigDecimal benefitDiscount;
  private Long benefitLevel;


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  public Long getActivityId() {
    return activityId;
  }

  public void setActivityId(Long activityId) {
    this.activityId = activityId;
  }


  public String getActivityType() {
    return activityType;
  }

  public void setActivityType(String activityType) {
    this.activityType = activityType;
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


  public Long getBenefitLevel() {
    return benefitLevel;
  }

  public void setBenefitLevel(Long benefitLevel) {
    this.benefitLevel = benefitLevel;
  }

}
