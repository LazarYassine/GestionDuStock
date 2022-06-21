package com.example.GestionDuStock.Controllers;

import com.example.GestionDuStock.entites.Users;
import com.example.GestionDuStock.services.IuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class UserController {


    @Autowired
    private IuserService iuserService;


    // Controller User Start

    @PostMapping(path = "/ajouterUser")
    public void AJouterUser(@RequestBody Users user ) {

        iuserService.AjouterUser(user);
    }

    @PutMapping(path = "/modifierUser")
    public void ModifierUser( @RequestBody Users user ) {

        iuserService.ModifierUser(user);

    }

    @DeleteMapping(path = "/deleteUser")
    public void DeleteUser( @RequestBody  Users user ) {

        iuserService.SupprimerUser(user);

    }

    @GetMapping(path = "/fetchUsers")
    public List<Users> fetchUsers() {

        return iuserService.listUser();

    }



    // Controller User End

}
