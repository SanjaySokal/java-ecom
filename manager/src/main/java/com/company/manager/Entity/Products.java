package com.company.manager.Entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "products")
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Long price;

    @OneToOne
    @JoinColumn(name = "catagory")
    private Catagories catagory;

    private String image;

    private String desc;

    private String small;

    private Long del;

    private int inStock;

    @Column(name = "date", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date date;

    @OneToOne(mappedBy = "productId")
    private Cart cart;

    @OneToOne(mappedBy = "productId")
    private Orders orders;
}
