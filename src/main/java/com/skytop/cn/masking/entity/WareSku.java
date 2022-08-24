package com.skytop.cn.masking.entity;


public class WareSku {

  private Long id;
  private Long skuId;
  private Long warehouseId;
  private Long stock;
  private String stockName;
  private Long stockLocked;


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


  public Long getWarehouseId() {
    return warehouseId;
  }

  public void setWarehouseId(Long warehouseId) {
    this.warehouseId = warehouseId;
  }


  public Long getStock() {
    return stock;
  }

  public void setStock(Long stock) {
    this.stock = stock;
  }


  public String getStockName() {
    return stockName;
  }

  public void setStockName(String stockName) {
    this.stockName = stockName;
  }


  public Long getStockLocked() {
    return stockLocked;
  }

  public void setStockLocked(Long stockLocked) {
    this.stockLocked = stockLocked;
  }

}
