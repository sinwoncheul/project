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
@Table(name = "PAYMENT")
public class Payment {
    @Id
    @Column(name = "PAYMENT_NO")
    private String  payment_no = null;

    @Column(name = "PAYMENT METTHOD")
    private String product_content = null;

    @Column(name = "PAYMENT_DATE")
    private Date payment_date = null;

    @ManyToOne
    @JoinColumn(name = "ORDER_NO")
    private Order order;
}
    