package com.example.wellsfargo.repositories;

import com.example.wellsfargo.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {}
