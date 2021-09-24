package com.example.grandmagasin.repositories;

import com.example.grandmagasin.models.Commande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeRepository extends JpaRepository<Commande, Long> {
}
