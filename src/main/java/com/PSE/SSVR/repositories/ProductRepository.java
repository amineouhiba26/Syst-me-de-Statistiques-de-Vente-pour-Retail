package com.PSE.SSVR.repositories;

import com.PSE.SSVR.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends
        JpaRepository<Product, Long> {}
