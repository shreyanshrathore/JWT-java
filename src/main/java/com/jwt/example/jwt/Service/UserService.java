package com.jwt.example.jwt.Service;

import com.jwt.example.jwt.Model.JwtModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    private final List<JwtModel> store = new ArrayList<>();
    public List<JwtModel> GetUser() {
        store.add(new JwtModel(UUID.randomUUID().toString(), "Shreyansh", "shreyansh@gmail.com"));
        return store;
    }
}
