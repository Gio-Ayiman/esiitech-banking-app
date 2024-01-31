package services;

import entities.Banque;

import java.util.Scanner;

public class BanqueService {
    public Banque creerBanque(Scanner scanner) {
        System.out.println("Veuillez entrer le nom de la banque");
        String nomBanque = scanner.nextLine();

        System.out.println("Veuillez entrer le quartier de la banque");
        String quartier = scanner.nextLine();

        System.out.println("Veuillez entrer le code banque");
        String codeBanque = scanner.nextLine();


        return null;
    }
}
