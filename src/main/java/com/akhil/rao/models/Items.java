package com.akhil.rao.models;

import com.akhil.rao.enums.ItemType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Items {

    @Id
    @GeneratedValue
    private int itemId;
    @Column(unique = true)
    private String itemName;
    private double itemPrice;
    private ItemType itemType;
    private int itemDiscountPercent;
    private boolean itemInStock;

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    public int getItemDiscountPercent() {
        return itemDiscountPercent;
    }

    public void setItemDiscountPercent(int itemDiscountPercent) {
        this.itemDiscountPercent = itemDiscountPercent;
    }

    public Items() {

    }

    public Items(String itemName, double itemPrice, ItemType itemType, int itemDiscountPercent,boolean itemInStock) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemType = itemType;
        this.itemDiscountPercent = itemDiscountPercent;
        this.itemInStock = itemInStock;
    }
}
