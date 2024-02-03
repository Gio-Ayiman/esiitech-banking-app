package services;

import entities.Utilisateur;

public class AuthenticationService {
    public boolean authenticate(String username, String password, Utilisateur user) {
        if (!username.equals(user.getUsername()) && !password.equals(user.getPassword())) {
            System.out.println("Le mot de passe ou le username est incorrect");
            return false;
        }

        return true;
    }
}
