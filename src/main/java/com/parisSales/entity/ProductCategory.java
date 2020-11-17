package com.parisSales.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name ="productCategory")
@Data
public class ProductCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name ="categoryName")
    private String categoryName;

    @OneToMany(mappedBy = "productCategory", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Product> products;
}
