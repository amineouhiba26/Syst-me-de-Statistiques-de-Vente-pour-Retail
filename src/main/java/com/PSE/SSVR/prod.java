package com.PSE.SSVR;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class prod {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String prodName;
    private String prodDescription;

}
