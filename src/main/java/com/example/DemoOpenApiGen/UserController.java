package com.example.DemoOpenApiGen;


import com.example.model.User;
import com.generated.api.UserApi;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class UserController implements UserApi {


    @Override
    public ResponseEntity<Void> createUser(User comExampleModelUser) {
        return null;
    }

    @Override
    public ResponseEntity<Void> createUsersWithArrayInput(List<User> comExampleModelUser) {
        return null;
    }

    @Override
    public ResponseEntity<Void> createUsersWithListInput(List<User> comExampleModelUser) {
        return null;
    }

    @Override
    public ResponseEntity<Void> deleteUser(String username) {
        return null;
    }

    @Override
    public ResponseEntity<User> getUserByName(String username) {
        return null;
    }

    @Override
    public ResponseEntity<String> loginUser(String username, String password) {
        return null;
    }

    @Override
    public ResponseEntity<Void> logoutUser() {
        return null;
    }

    @Override
    public ResponseEntity<Void> updateUser(String username, User comExampleModelUser) {
        return null;
    }
}
