package entities;

import enums.Genre;
import enums.Role;

import java.time.LocalDate;

public class Client extends Utilisateur {
    private Compte compte;

    public Client(String nom, Genre genre, LocalDate dateNaissance, String quartier) {
        super(nom, genre, dateNaissance, quartier);
        this.role = Role.CLIENT;
    }

    public Compte getCompte() {
        return this.compte;
    }

    public void setCompte(Compte compte) {
        this.compte = compte;
    }

    public static Client fromUser(Utilisateur user) {
        return new Client(user.getNom(), user.getGenre(), user.getDateNaissance(), user.getQuartier());
    }
}
