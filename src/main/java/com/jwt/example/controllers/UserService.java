package com.jwt.example.controllers;

import com.jwt.example.models.User;
import org.springframework.stereotype.Service;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<User> store=new ArrayList<>();

    public UserService()
    {
      store.add(new User(UUID.randomUUID().toString(),"Ashu","Ashu@gmail.com"));
      store.add(new User(UUID.randomUUID().toString(),"chandan","chandan@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"kesar","kesar@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"ankit","ankit@gmail.com"));

}

    public List<User> getUser(){
        return this.store;
    }
}

