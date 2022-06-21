package com.example.GestionDuStock.entites;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity

public class Commande implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull @Temporal(TemporalType.DATE)
    private Date date;
    private int qte;
    @ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.ALL })
    @JoinTable(name = "commande_produit",
            joinColumns = @JoinColumn(name = "commande_id", referencedColumnName = "Id"),
            inverseJoinColumns = @JoinColumn(name = "produit_id", referencedColumnName = "Id"))
    @JsonIgnore
    List<Produit> produits = new ArrayList<>();

    @ManyToOne
    private Collaborateur collaborateur;


 public Commande() {
    }

    public Commande(Date date, int qte, Collaborateur collaborateur) {
        this.date = date;
        this.qte = qte;
        this.collaborateur = collaborateur;
    }

    public Commande(Date date, int qte) {
        this.date = date;
        this.qte = qte;

    }

    public Long getIdCommande() {
        return id;
    }

    public void setIdCommande(Long id) {
        this.id = id;
    }

    public Date getDateCommande() {
        return date;
    }

    public void setDateCommande(Date date) {
        this.date = date;
    }

    public int getQteCommande() {
        return qte;
    }

    public void setQteCommande(int qte) {
        this.qte = qte;
    }

    public List<Produit> getProduits() {
        return produits;
    }

    public void setProduits(List<Produit> produits) {
        this.produits = produits;
    }

    public Collaborateur getCollaborateur() {
        return collaborateur;
    }

    public void setCollaborateur(Collaborateur collaborateur) {
        this.collaborateur = collaborateur;
    }
}
