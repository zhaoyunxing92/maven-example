/**
 * Copyright(C) 2018 Hangzhou zhaoyunxing92 Technology Co., Ltd. All rights reserved.
 */
package com.sunny.maven;

/**
 * @author zhaoyunxing92
 * @class: com.sunny.maven.Order
 * @date: 2018-08-17 12:45
 * @des: 订单
 */
public class Order {
    /**
     * 订单名称
     */
    private String name;
    /**
     * 价格
     */
    private double price;
    /**
     * 用户信息
     */
    private User user;

    public Order(String name, double price, User user) {
        this.name = name;
        this.price = price;
        this.user = user;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Order{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", user=" + user +
                '}';
    }
}
