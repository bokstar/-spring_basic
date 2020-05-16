package com.example.jpa_example.repository;

import com.example.jpa_example.model.Adress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Adress, Long> {
}