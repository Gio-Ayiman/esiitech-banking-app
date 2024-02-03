package entities;
import enums.Genre;
import enums.Role;
import jdk.jshell.execution.Util;

import java.time.LocalDate;

public class Utilisateur {
    private String nom;
    private Genre genre;
    private LocalDate dateNaissance;
    private String quartier;

    protected String username;
    protected String password;
    protected Role role;

    public Utilisateur(){}

    public Utilisateur(String nom, Genre genre, LocalDate dateNaissance, String quartier) {
        this.nom = nom;
        this.genre = genre;
        this.dateNaissance = dateNaissance;
        this.quartier = quartier;
    }

    public Utilisateur(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getNom() {
        return this.nom;
    }

    public Genre getGenre() {
        return this.genre;
    }

    public LocalDate getDateNaissance() {
        return this.dateNaissance;
    }

    public String getQuartier() {
        return this.quartier;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Utilisateur{" +
                "nom='" + nom + '\'' +
                ", genre=" + genre +
                ", dateNaissance=" + dateNaissance +
                ", quartier='" + quartier + '\'' +
                '}';
    }
}
