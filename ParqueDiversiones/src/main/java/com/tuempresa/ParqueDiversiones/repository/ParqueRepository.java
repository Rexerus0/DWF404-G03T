package com.tuempresa.ParqueDiversiones.repository;

import com.tuempresa.ParqueDiversiones.model.Parque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParqueRepository extends JpaRepository<Parque, Long> {
}
