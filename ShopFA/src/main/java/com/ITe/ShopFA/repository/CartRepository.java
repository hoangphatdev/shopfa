package com.ITe.ShopFA.repository;

import com.ITe.ShopFA.model.Cart;
import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.*;
@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {
}
