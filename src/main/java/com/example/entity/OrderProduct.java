package com.example.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name = "ORDER")
public class OrderProduct {
    @Id
    @Column(name = "ORDER_PRODUCT_NO")
    private Long order_product_no = null;

    @Column(name = "ORDER_PRODUCT_COUNT")
    private Long order_product_count = null;

    @Column(name = "ORDER_PRICE")
    private Long order_price = null;

    @ManyToOne
    @JoinColumn(name = "MEMBER_ID")
    private Company company;

    @ManyToOne
    @JoinColumn(name = "PRODUCT_NO")
    private Product product;
    
    @ManyToOne
    @JoinColumn(name = "ORDER_NO")
    private Order order;

   

}
