package com.PSE.SSVR.models;

import jakarta.persistence.*;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity (name = "Products")

public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    @Column(name = "item_id")
    private Long itemId;
    @Column(name = "created_at")
    private ZonedDateTime createdAt;
    @Column(name = "discount_amount")
    private Double discountAmount;
    @Column(name = "category")
    private String category;

    @Column(name = "name")
    private String name;
    @Column(name = "price")
    private Double price;
    @Column(name = "qty_canceled")
    private Double qtyCanceled;
    @Column(name = "qty_invoiced")
    private Double qtyInvoiced;
    @Column(name = "qty_ordered")
    private Double qtyOrdered;
    @Column(name = "qty_refunded")
    private Double qtyRefunded;
    @Column(name = "qty_shipped")
    private Double qtyShipped;
    @Column(name = "sku")
    private String sku;
    @Column(name = "updated_at")
    private ZonedDateTime updatedAt;
    @Column(name = "capacity")
    private String capacity;
    @Column(name = "brand")
    private String brand;
    @OneToMany(mappedBy = "product",
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    private List<PriceHistory> priceHistory =
            new ArrayList<>();


    public Product() {}

    public Product(Long itemId, ZonedDateTime createdAt,
                   Double discountAmount, String category,
                   String name, Double price,
                   Double qtyCanceled, Double qtyInvoiced,
                   Double qtyOrdered, Double qtyRefunded,
                   Double qtyShipped, String sku,
                   ZonedDateTime updatedAt, String capacity,
                   String brand) {
        this.itemId = itemId;
        this.createdAt = createdAt;
        this.discountAmount = discountAmount;
        this.category = category;
        this.name = name;
        this.price = price;
        this.qtyCanceled = qtyCanceled;
        this.qtyInvoiced = qtyInvoiced;
        this.qtyOrdered = qtyOrdered;
        this.qtyRefunded = qtyRefunded;
        this.qtyShipped = qtyShipped;
        this.sku = sku;
        this.updatedAt = updatedAt;
        this.capacity = capacity;
        this.brand = brand;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public ZonedDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Double getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(Double discountAmount) {
        this.discountAmount = discountAmount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getQtyCanceled() {
        return qtyCanceled;
    }

    public void setQtyCanceled(Double qtyCanceled) {
        this.qtyCanceled = qtyCanceled;
    }

    public Double getQtyInvoiced() {
        return qtyInvoiced;
    }

    public void setQtyInvoiced(Double qtyInvoiced) {
        this.qtyInvoiced = qtyInvoiced;
    }

    public Double getQtyOrdered() {
        return qtyOrdered;
    }

    public void setQtyOrdered(Double qtyOrdered) {
        this.qtyOrdered = qtyOrdered;
    }

    public Double getQtyRefunded() {
        return qtyRefunded;
    }

    public void setQtyRefunded(Double qtyRefunded) {
        this.qtyRefunded = qtyRefunded;
    }

    public Double getQtyShipped() {
        return qtyShipped;
    }

    public void setQtyShipped(Double qtyShipped) {
        this.qtyShipped = qtyShipped;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public ZonedDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(ZonedDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public List<PriceHistory> getPriceHistory() {
        return priceHistory;
    }

    public void setPriceHistory(List<PriceHistory> priceHistory) {
        this.priceHistory = priceHistory;
    }

}
