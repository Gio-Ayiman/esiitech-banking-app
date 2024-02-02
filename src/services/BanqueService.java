package services;

import entities.Agence;
import entities.Banque;

import java.util.ArrayList;
import java.util.Scanner;

public class BanqueService {

    public Banque creerBanque(Scanner scanner) {
        System.out.println("Veuillez entrer le nom de la banque");
        String nom = scanner.nextLine();

        System.out.println("Veuillez entrer le nom du quartier");
        String quartier = scanner.nextLine();

        System.out.println("Veuillez entrer le code banque");
        String codeBanque = scanner.nextLine();

        return new Banque(nom, quartier, codeBanque);
    }

    public void ajouterAgence(Banque banque, Agence agence) {
        if (banque.getAgences() == null) {
            banque.setAgences(new ArrayList<>());
            banque.getAgences().add(agence);
        } else {
            banque.getAgences().add(agence);
        }
    }
}
