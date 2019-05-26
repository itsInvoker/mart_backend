package com.akhil.rao.items;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Items {

    @Id
    @GeneratedValue
    private int itemId;
    private String itemName;
    private double itemPrice;
    private String itemType;
    private int itemDiscountPercent;

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

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
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

    public Items(String itemName, double itemPrice, String itemType, int itemDiscountPercent) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemType = itemType;
        this.itemDiscountPercent = itemDiscountPercent;
    }
}
