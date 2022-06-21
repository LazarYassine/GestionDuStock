package com.example.GestionDuStock.services;

import com.example.GestionDuStock.Repositories.CollaborateurRepository;
import com.example.GestionDuStock.entites.Collaborateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CollaborateurService implements IcollaborateurService {

    @Autowired
    private CollaborateurRepository collaborateurRepository;


    @Override
    public void AjouterCollaborateur( Collaborateur collaborateur) {
        collaborateurRepository.save( collaborateur);
    }

    @Override
    public void ModifierCollaborateur( Collaborateur collaborateur) {
         Collaborateur c1=new Collaborateur();
         c1.setId(collaborateur.getId());
         c1.setNom(collaborateur.getNom());
         c1.setPrenom(collaborateur.getPrenom());
         c1.setTel(collaborateur.getTel());
       collaborateurRepository.save(c1);
    }

    @Override
    public void SupprimerCollaborateur(Collaborateur collaborateur) {

        collaborateurRepository.deleteById(collaborateur.getId());

    }

    @Override
    public List<Collaborateur> listCollaborateur() {
        return collaborateurRepository.findAll();
    }
}
