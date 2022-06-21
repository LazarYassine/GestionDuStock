package com.example.GestionDuStock.services;

import com.example.GestionDuStock.Repositories.CategorieRepository;
import com.example.GestionDuStock.Repositories.ProduitRepository;
import com.example.GestionDuStock.entites.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service @Transactional
public class ProduitServiceImp implements IproduitService {

    @Autowired
    private ProduitRepository produitRepository;

    @Autowired
    private CategorieRepository categorieRepository;


    @Override
    public void AjouterProduit(Produit produit) {

        produitRepository.save(produit);

    }

    @Override
    public void ModifierProduit(Produit produit) {

        Produit p = new Produit();
        p.setId(produit.getId());
        p.setNom(produit.getNom());
        p.setQte(produit.getQte());
        p.setPrix(produit.getPrix());
        produitRepository.save(produit);
    }

    @Override
    public void SupprimerProduit(Produit produit) {

        produitRepository.deleteById(produit.getId());

    }

    @Override
    public List<Produit> listProduit() {
        List<Produit> listProd = produitRepository.findAll(); //

        return listProd;
    }
}
