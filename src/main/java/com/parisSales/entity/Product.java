package com.parisSales.entity;

import lombok.Data;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.web.multipart.MultipartFile;


import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name="product")
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotEmpty(message = "Product name required")
    @Column(name = "productName")
    private String productName;

    @Min(value = 0, message = "Product price required")
    @Column(name ="productPrice")
    private BigDecimal productPrice;

    @Column(name ="productDescription")
    private  String productDescription;

    @Column(name = "inStock")
    private  boolean inStock;

    @Column(name = "unitsInStock")
    private int unitsInStock;

    @Column( name = "dateCreated")
    @UpdateTimestamp
    private Date dateCreated;

    @Column(name = "productImageUrl")
    private String productImageUrl;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false )
    private ProductCategory productCategory;




}
