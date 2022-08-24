package com.skytop.cn.masking.entity;


public class WareOrderTaskDetail {

  private Long id;
  private Long skuId;
  private String skuName;
  private Long skuNum;
  private Long taskId;
  private String refundStatus;


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


  public String getSkuName() {
    return skuName;
  }

  public void setSkuName(String skuName) {
    this.skuName = skuName;
  }


  public Long getSkuNum() {
    return skuNum;
  }

  public void setSkuNum(Long skuNum) {
    this.skuNum = skuNum;
  }


  public Long getTaskId() {
    return taskId;
  }

  public void setTaskId(Long taskId) {
    this.taskId = taskId;
  }


  public String getRefundStatus() {
    return refundStatus;
  }

  public void setRefundStatus(String refundStatus) {
    this.refundStatus = refundStatus;
  }

}
