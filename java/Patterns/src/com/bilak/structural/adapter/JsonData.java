package com.bilak.structural.adapter;

import java.lang.reflect.Field;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class JsonData
 * @since 10/1/2022 - 17.53
 **/
public class JsonData {
    private String data;

    public JsonData(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
