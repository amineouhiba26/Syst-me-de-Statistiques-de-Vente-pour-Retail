package com.PSE.SSVR.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity

public class PriceHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    private double price;

    private int oldPrice ;
    private int newPrice ;
    private Date changeDate ;

    public PriceHistory() {}

    public PriceHistory(int id, Product product,
                        int oldPrice,int newPrice,
                        Date changeDate) {
        this.product=product;
        this.id = id;
        this.oldPrice = oldPrice;
        this.newPrice = newPrice;
        this.changeDate = changeDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public Product getProduct() {
        return product;
    }


    public int getOldPrice() {
        return oldPrice;
    }

    public void setOldPrice(int oldPrice) {
        this.oldPrice = oldPrice;
    }

    public int getNewPrice() {
        return newPrice;
    }

    public void setNewPrice(int newPrice) {
        this.newPrice = newPrice;
    }

    public Date getChangeDate() {
        return changeDate;
    }

    public void setChangeDate(Date changeDate) {
        this.changeDate = changeDate;
    }
}
