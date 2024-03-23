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
        name = "cart_tb",
        schema = "shopfa"
)
public class Cart {
    @Id
    @GeneratedValue
    private long cardId;
    private long orderId;
    private String productName;
    private String quantity;
    private Double price;
}
