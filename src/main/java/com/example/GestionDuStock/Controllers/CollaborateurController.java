package com.example.GestionDuStock.Controllers;

import com.example.GestionDuStock.entites.Collaborateur;
import com.example.GestionDuStock.services.IcollaborateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class CollaborateurController {

    @Autowired
    private IcollaborateurService icollaborateurService;

    // Collaborateur Controller Start

    @PostMapping(path = "/AjouterCollaborateur")
    public void AjouterCollaborateur( @RequestBody Collaborateur collaborateur) {

        icollaborateurService.AjouterCollaborateur(collaborateur);

    }

    @PutMapping(path = "/ModifierCollaborateur")
    public void ModifierCollaborateur( @RequestBody Collaborateur collaborateur) {

        icollaborateurService.ModifierCollaborateur(collaborateur);

    }


    @DeleteMapping(path = "/SupprimerCollaborateur")
    public void SupprimerCollaborateur( @RequestBody Collaborateur collaborateur) {

        icollaborateurService.SupprimerCollaborateur(collaborateur);

    }

    @GetMapping(value = "/fetchCollaborateur")
    public List<Collaborateur> fetchCollaborateur() {

        return icollaborateurService.listCollaborateur();

    }


    // Collaborateur Controller End

}
