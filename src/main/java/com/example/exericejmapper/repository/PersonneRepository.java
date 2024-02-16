package com.example.exericejmapper.repository;

import com.example.exericejmapper.Personne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonneRepository extends JpaRepository<Personne, Long> {
}