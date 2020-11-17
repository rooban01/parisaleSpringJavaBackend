package com.parisSales.dao;

import com.parisSales.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

@CrossOrigin ("http://localhost:4200")
public interface ProductRepository extends JpaRepository<Product,Long> {
    Page<Product> findByProductCategoryId(@RequestParam("id") Long id, Pageable pageable);
    Page<Product> findByProductNameContaining(@RequestParam("name") String name, Pageable pageable);
}
