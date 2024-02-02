package services;

import entities.Agence;
import entities.Client;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AgenceService {
    public Agence creerAgence(Scanner scanner) {
        System.out.println("Veuillez entrer le nom de l'agence");
        String nom = scanner.nextLine();

        System.out.println("Veuillez entrer le code agence");
        String codeAgence = scanner.nextLine();

        return new Agence(nom, codeAgence);
    }

    public Agence getAgenceParNom(String nomAgence, List<Agence> agences) {
        for (Agence agence : agences) {
            if (agence.getNom() == nomAgence) return agence;
        }

        return null;
    }

    public void enrollerClient(Agence agence, Client client) {
        if (agence.getClients() == null) {
            agence.setClients(new ArrayList<>());
            agence.getClients().add(client);
        } else {
            agence.getClients().add(client);
        }
    }
}
