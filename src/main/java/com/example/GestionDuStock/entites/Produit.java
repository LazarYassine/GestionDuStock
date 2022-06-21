package com.example.GestionDuStock.entites;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor @NoArgsConstructor
public class Produit implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String nom;
    private int qte;
    private double prix;

    @ManyToOne
    private Categorie  categorie;

    @ManyToMany(mappedBy = "produits")
            @JsonIgnore
    List<Commande> cmd = new ArrayList<>();

}

