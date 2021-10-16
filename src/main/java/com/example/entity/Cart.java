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
@Table(name = "CART")
public class Cart {
    
    @Id
    @Column(name = "CART_NO")
    private Long cart_no = null;

    @Column(name = "MEMBER_ID")
    private String member_id = null;

    @Column(name = "CART_COUNT")
    private Long cart_count = null;

    @Column(name = "CART_PRICE")
    private Long cart_price = null;

    @ManyToOne
    @JoinColumn(name = "PRODUCT_NO")
    private Product product;






}
