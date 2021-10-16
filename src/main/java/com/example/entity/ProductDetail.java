package com.example.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name = "PRODUCTDETAIL")
public class ProductDetail {
    @Id
    @Column(name = "PRODUCT_NAME_TITLE")
    private String  product_name_title = null;

    @Column(name = "PRODUCT_CONTENT")
    private String product_content = null;

    @Column(name = "PRODUCT_IMAGE")
    private String product_image = null;

    @Column(name = "PRODUCT_DATE")
    private Date product_date = null;
}
