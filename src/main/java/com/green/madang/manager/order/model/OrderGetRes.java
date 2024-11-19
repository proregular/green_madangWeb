package com.green.madang.manager.order.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderGetRes {
    private int orderId;
    private int bookId;
    private int custId;
    private int salePrice;
    private String name;
    private String bookName;
    private String orderDate;
}
