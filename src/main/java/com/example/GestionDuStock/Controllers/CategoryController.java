package com.example.GestionDuStock.Controllers;

import com.example.GestionDuStock.entites.Categorie;
import com.example.GestionDuStock.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class CategoryController {


    @Autowired
    private IcategorieService icategorieService;

    // Category Controller Start

    @PostMapping(path = "/AjouterCategorie")
    public void AjouterCategorie(@RequestBody Categorie categorie) {

        icategorieService.AjouterCategorie(categorie);

    }

    @PutMapping(path = "/ModifierCategorie")
    public void ModifierCategorie(@RequestBody Categorie categorie) {

        icategorieService.ModifierCategorie(categorie);

    }

    @DeleteMapping(path = "/SupprimerCategorie")
    public void SupprimerCategorie(@RequestBody Categorie categorie) {

        icategorieService.SupprimerCategorie(categorie);

    }

    @GetMapping(value = "/fetchCategorie")
    public List<Categorie> fetchCategorie() {

        return icategorieService.listCategorie();

    }

    // Category Controller End

}
