package com.example.wellsfargo.repositories;

import com.example.wellsfargo.entities.Portfolio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PortfolioRepository extends JpaRepository<Portfolio, Long> {}
