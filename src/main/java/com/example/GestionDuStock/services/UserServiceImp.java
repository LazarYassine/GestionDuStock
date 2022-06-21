package com.example.GestionDuStock.services;

import com.example.GestionDuStock.Repositories.UsersRepository;
import com.example.GestionDuStock.entites.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImp implements IuserService {


    @Autowired
    private UsersRepository usersRepository;


    @Override
    public void AjouterUser( Users user) {
        usersRepository.save(user);

    }

    @Override
    public void ModifierUser(Users user) {

        usersRepository.save(user);
    }

    @Override
    public void SupprimerUser(Users user) {

        usersRepository.deleteById(user.getId_User());

    }

    @Override
    public List<Users> listUser() {

        return usersRepository.findAll();

    }

}
