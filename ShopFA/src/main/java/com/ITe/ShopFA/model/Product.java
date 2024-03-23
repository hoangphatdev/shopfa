package com.ITe.ShopFA.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(
        name = "product_tb",
        schema = "shopfa"
)
public class Product {
    @Id
    @GeneratedValue
    private long productId;
    private String productName;
    private Double price;
    private long remainQuantity;
    private String producer;
}
