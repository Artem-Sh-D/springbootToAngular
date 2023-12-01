package com.example.springboottoangular.repository;

import com.example.springboottoangular.entity.Plane;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface PlaneRepository extends JpaRepository<Plane,Long> {
}
