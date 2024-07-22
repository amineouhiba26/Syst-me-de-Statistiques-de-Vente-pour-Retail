package com.PSE.SSVR;

import com.PSE.SSVR.prods.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends
        JpaRepository<Product, Long> {}
