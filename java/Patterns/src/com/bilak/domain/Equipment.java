package com.bilak.domain;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project Singleton
 * @class Equipment
 * @since 9/13/2022 - 12.11
 **/
public class Equipment implements Cloneable {
    private String name;
    private EquipmentCategory category;
    private boolean isInStock;
    private double pricePerDayRegular;
    private double pricePerHourRegular;
    private double pricePerDayWknds;
    private double pricePerHourWknds;

    public Equipment() {
    }

    public Equipment(String name, EquipmentCategory category, boolean isInStock, double pricePerDayRegular, double pricePerHourRegular, double pricePerDayWknds, double pricePerHourWknds) {
        this.name = name;
        this.category = category;
        this.isInStock = isInStock;
        this.pricePerDayRegular = pricePerDayRegular;
        this.pricePerHourRegular = pricePerHourRegular;
        this.pricePerDayWknds = pricePerDayWknds;
        this.pricePerHourWknds = pricePerHourWknds;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EquipmentCategory getCategory() {
        return category;
    }

    public void setCategory(EquipmentCategory category) {
        this.category = category;
    }

    public boolean isInStock() {
        return isInStock;
    }

    public void setInStock(boolean inStock) {
        isInStock = inStock;
    }

    public double getPricePerDayRegular() {
        return pricePerDayRegular;
    }

    public void setPricePerDayRegular(double pricePerDayRegular) {
        this.pricePerDayRegular = pricePerDayRegular;
    }

    public double getPricePerHourRegular() {
        return pricePerHourRegular;
    }

    public void setPricePerHourRegular(double pricePerHourRegular) {
        this.pricePerHourRegular = pricePerHourRegular;
    }

    public double getPricePerDayWknds() {
        return pricePerDayWknds;
    }

    public void setPricePerDayWknds(double pricePerDayWknds) {
        this.pricePerDayWknds = pricePerDayWknds;
    }

    public double getPricePerHourWknds() {
        return pricePerHourWknds;
    }

    public void setPricePerHourWknds(double pricePerHourWknds) {
        this.pricePerHourWknds = pricePerHourWknds;
    }

    @Override
    public String toString() {
        return "Equipment{" +
                "name='" + name + '\'' +
                ", category=" + category +
                ", isInStock=" + isInStock +
                ", pricePerDayRegular=" + pricePerDayRegular +
                ", pricePerHourRegular=" + pricePerHourRegular +
                ", pricePerDayWknds=" + pricePerDayWknds +
                ", pricePerHourWknds=" + pricePerHourWknds +
                '}';
    }

    @Override
    public Equipment clone() {
        try {
            return (Equipment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
