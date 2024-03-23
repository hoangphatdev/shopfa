package com.ITe.ShopFA.model;

import jakarta.persistence.*;
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
        name = "user_tb",
        schema = "shopfa",
        uniqueConstraints = @UniqueConstraint(
                name = "idenCard_unique",
                columnNames = "idenCard"
        )
)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;
    private String userName;
    private String password;
    private String fullName;
    @Column(nullable = false)
    private String identifyCard;
    private String phone;
    private String address;

}
