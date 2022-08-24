package com.skytop.cn.masking.entity;


public class AdsUserAction {

  private java.sql.Date dt;
  private Long recentDays;
  private Long homeCount;
  private Long goodDetailCount;
  private Long cartCount;
  private Long orderCount;
  private Long paymentCount;


  public java.sql.Date getDt() {
    return dt;
  }

  public void setDt(java.sql.Date dt) {
    this.dt = dt;
  }


  public Long getRecentDays() {
    return recentDays;
  }

  public void setRecentDays(Long recentDays) {
    this.recentDays = recentDays;
  }


  public Long getHomeCount() {
    return homeCount;
  }

  public void setHomeCount(Long homeCount) {
    this.homeCount = homeCount;
  }


  public Long getGoodDetailCount() {
    return goodDetailCount;
  }

  public void setGoodDetailCount(Long goodDetailCount) {
    this.goodDetailCount = goodDetailCount;
  }


  public Long getCartCount() {
    return cartCount;
  }

  public void setCartCount(Long cartCount) {
    this.cartCount = cartCount;
  }


  public Long getOrderCount() {
    return orderCount;
  }

  public void setOrderCount(Long orderCount) {
    this.orderCount = orderCount;
  }


  public Long getPaymentCount() {
    return paymentCount;
  }

  public void setPaymentCount(Long paymentCount) {
    this.paymentCount = paymentCount;
  }

}
