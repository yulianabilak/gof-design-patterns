package com.bilak.structural.facade.domain;

import com.bilak.domain.EquipmentCategory;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class Equipment
 * @since 10/14/2022 - 16.07
 **/
public class Equipment {
    private String name;
    private EquipmentCategory category;
    private Double basePrice;
    private Integer length;

    public Equipment(String name, EquipmentCategory category, Double basePrice, Integer length) {
        this.name = name;
        this.category = category;
        this.basePrice = basePrice;
        this.length = length;
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

    public Double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(Double basePrice) {
        this.basePrice = basePrice;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Equipment{" +
                "name='" + name + '\'' +
                ", category=" + category +
                ", basePrice=" + basePrice +
                ", length=" + length +
                '}';
    }
}
