package com.example.GestionDuStock.Controllers;

import com.example.GestionDuStock.entites.Produit;
import com.example.GestionDuStock.services.IproduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class ProduitController {

    @Autowired
    private IproduitService iproduitService;

    // Produit Controller Start

    @PostMapping(path = "/AjouterProduit")
    public void AjouterProduits(@RequestBody Produit produit){

        iproduitService.AjouterProduit(produit);

    }

    @PutMapping(path = "/ModifierProduit")
    public void ModifierProduit(@RequestBody Produit produit) {

        iproduitService.ModifierProduit(produit);

    }

    @DeleteMapping(path = "/SupprimerProduit")
    public void SupprimerProduit(@RequestBody Produit produit) {

        iproduitService.SupprimerProduit(produit);

    }

    @GetMapping(value = "/fetchProduits")
    public List<Produit> fetchProduits() {

        return iproduitService.listProduit();

    }
    // Produit Controller End

}
