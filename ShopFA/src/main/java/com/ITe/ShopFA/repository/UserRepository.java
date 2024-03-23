package com.ITe.ShopFA.repository;

import com.ITe.ShopFA.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Query(value = "SELECT u FROM User u WHERE u.userName=:value1 AND u.password=:value2" )
    public List<User> selectByNameAndPassword(@Param("value1") String userName, @Param("value2") String password);
}
