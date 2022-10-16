package com.example.demo.repository;

import com.example.demo.entity.Universite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UniversiteRepository extends JpaRepository<Universite,Integer> {
}
