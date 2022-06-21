package com.example.GestionDuStock.services;

import com.example.GestionDuStock.Repositories.CategorieRepository;
import com.example.GestionDuStock.entites.Categorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service @Transactional
public class CategorieServiceImp implements IcategorieService {

    @Autowired
    private CategorieRepository categorieRepository;

    @Override
    public void AjouterCategorie(Categorie categorie) {

        categorieRepository.save( categorie );

    }

    @Override
    public void ModifierCategorie(Categorie categorie) {

        Categorie ca1 = new Categorie();
        ca1.setId(categorie.getId());
        ca1.setNom(categorie.getNom());
        categorieRepository.save(ca1);

    }

    @Override
    public void SupprimerCategorie(Categorie categorie) {

        categorieRepository.deleteById(categorie.getId());

    }

    @Override
    public List<Categorie> listCategorie() {
        List<Categorie> listProd = categorieRepository.findAll(); //

        return listProd;
    }

}
