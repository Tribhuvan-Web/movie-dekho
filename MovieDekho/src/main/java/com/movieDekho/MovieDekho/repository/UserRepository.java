package com.movieDekho.MovieDekho.repository;

import com.movieDekho.MovieDekho.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);

    Optional<User> findByPhone(String phone);

    @Query("select  u from  User  u where  u.email = :identifier or u.phone = :identifier")
    Optional<User> findByEmailOrPhone(@Param("identifier") String identifier);

    boolean existsByEmail(String email);
}
