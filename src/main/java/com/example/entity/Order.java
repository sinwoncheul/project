package com.example.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
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
@Entity
@NoArgsConstructor
@Table(name = "Order")
public class Order {
    @Id
    @Column(name = "ORDER_NO")
    private Long order_no = null;

    @Column(name = "ORDER_TOTAL_PRICE")
    private Long order_total_price = null;

    @Column(name = "ORDER_STATE")
    private String order_STATE = null;

    @Column(name = "ORDER_ADDRESS")
    private Long order_address = null;

    @Column(name = "ORDER_DATE")
    private Date order_date = null;

    @ManyToOne
    @JoinColumn(name = "MEMBER_ID")
    private Company company;

}
