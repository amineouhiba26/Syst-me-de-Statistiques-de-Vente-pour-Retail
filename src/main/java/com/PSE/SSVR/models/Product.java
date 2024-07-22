package com.PSE.SSVR.prods;

import jakarta.persistence.*;

import java.util.Set;

@Entity

public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String sku ;
    private String name ;
    private double price ;
    private String description ;
    private Long stock ;
    private String category ;
    private String brand;
    @OneToMany(mappedBy = "product")
    private Set<PriceHistory> priceHistories;

    @OneToMany(mappedBy = "product")
    private Set<OrderItem> orderItems;

    public Product() {
    }

    public Product(Long id, String sku,
                   String name, double price,
                   String description,
                   Long stock, String category,
                   String brand) {
        this.id = id;
        this.sku = sku;
        this.name = name;
        this.price = price;
        this.description = description;
        this.stock = stock;
        this.category = category;
        this.brand = brand;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getStock() {
        return stock;
    }

    public void setStock(Long stock) {
        this.stock = stock;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }



}
