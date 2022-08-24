package com.skytop.cn.masking.entity;


public class CommentInfo {

  private Long id;
  private Long userId;
  private String nickName;
  private String headImg;
  private Long skuId;
  private Long spuId;
  private Long orderId;
  private String appraise;
  private String commentTxt;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp operateTime;


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


  public String getNickName() {
    return nickName;
  }

  public void setNickName(String nickName) {
    this.nickName = nickName;
  }


  public String getHeadImg() {
    return headImg;
  }

  public void setHeadImg(String headImg) {
    this.headImg = headImg;
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


  public Long getOrderId() {
    return orderId;
  }

  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }


  public String getAppraise() {
    return appraise;
  }

  public void setAppraise(String appraise) {
    this.appraise = appraise;
  }


  public String getCommentTxt() {
    return commentTxt;
  }

  public void setCommentTxt(String commentTxt) {
    this.commentTxt = commentTxt;
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
