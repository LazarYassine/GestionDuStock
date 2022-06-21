package com.example.GestionDuStock.Controllers;

import com.example.GestionDuStock.entites.Commande;
import com.example.GestionDuStock.services.IcommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class CommandeController {

    @Autowired
    private IcommandeService icommandeService;

    // Commande Controller Start

    @PostMapping(path = "/AjouterCommande")
    public void AjouterCommande( @RequestBody Commande commande) {

        icommandeService.AjouterCommande(commande);

    }

    @PutMapping(path = "/ModifierCommande")
    public void ModifierCommande(@RequestBody Commande commande) {

        icommandeService.ModifierCommande(commande);

    }

    @DeleteMapping(path = "/SupprimerCommande")
    public void SupprimerCommande(@RequestBody Commande commande) {

        icommandeService.SupprimerCommande(commande);

    }

    @GetMapping(value = "/fetchCommande")
    public List<Commande> fetchCommande() {

        return icommandeService.listCommande();

    }


    // Commande Controller End

}
