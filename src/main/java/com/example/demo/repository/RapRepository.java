package com.example.demo.repository;

import com.example.demo.entity.Rap;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RapRepository extends JpaRepository<Rap, String> {
    List<Rap> findByHeThongRapContainingIgnoreCaseAndMaNhom(String maHeThingRap);
}
