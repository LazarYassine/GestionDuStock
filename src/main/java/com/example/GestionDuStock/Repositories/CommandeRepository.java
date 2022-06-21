package com.example.GestionDuStock.Repositories;

import com.example.GestionDuStock.entites.Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CommandeRepository extends JpaRepository<Commande, Long> {
}
