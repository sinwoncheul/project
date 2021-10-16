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
@Table(name = "PRODUCT")
public class Product {
    @Id
    @Column(name = "PRODUCT_NO")
    private Long product_no = null;

    @Column(name = "PRODUCT_NAME_NO")
    private Long product_name_no = null;

    @Column(name = "PRODUCT_COLOR")
    private String product_color = null;

    @Column(name = "PRODUCT_SIZE")
    private String product_size = null;

    @ManyToOne
    @JoinColumn(name = "PRODUCT_NAME_NO")
    private ProductDetail productDetail;






}
