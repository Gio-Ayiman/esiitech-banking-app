package entities;
import enums.Genre;

import java.time.LocalDate;

public class Utilisateur {
    private String nom;
    private Genre genre;
    private LocalDate dateNaissance;
    private String quartier;

    public Utilisateur(String nom, Genre genre, LocalDate dateNaissance, String quartier) {
        this.nom = nom;
        this.genre = genre;
        this.dateNaissance = dateNaissance;
        this.quartier = quartier;
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
