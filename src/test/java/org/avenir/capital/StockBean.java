package org.avenir.capital;

public class StockBean {

    private String stockCode;
    private Double price;

    public StockBean(String stockCode, Double price) {
        this.stockCode = stockCode;
        this.price = price;
    }

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }


}
