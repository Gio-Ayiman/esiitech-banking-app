package services;

import entities.Utilisateur;
import enums.Genre;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;
public class UtilisateurService {

    public Utilisateur creerUtilisateur(Scanner scanner) {
        System.out.println("Veuillez entrer votre nom");
        String nom = scanner.nextLine();

        System.out.println("Entrez votre genre (M/F)");
        Genre genre = convertToGenre(scanner.nextLine());

        System.out.println("Entrez votre date de naissance (JJ/MM/AAAA)");
        LocalDate dateNaissance = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy").withLocale(Locale.FRANCE));

        System.out.println("Entrez votre quartier");
        String quartier = scanner.nextLine();

        return new Utilisateur(nom, genre, dateNaissance, quartier);
    }

    private Genre convertToGenre(String genre) {
        if (genre.equalsIgnoreCase("M")) {
            return Genre.MASCUSLIN;
        } else if (genre.equalsIgnoreCase("F")) {
            return Genre.FEMININ;
        } else {
            return Genre.INCONNU;
        }
    }
}
