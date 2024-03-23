package com.ITe.ShopFA.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(
        name = "order_tb",
        schema = "shopfa"
)
public class Order {
    @Id
    @GeneratedValue
    private long orderId;
    private long userId;
    private LocalDate OrderDate;
    private Double totalAmount;
}
