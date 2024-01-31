package services;

import entities.Agence;
import entities.Client;

import java.util.ArrayList;
import java.util.Scanner;

public class AgenceService {

    public Agence creerAgence(Scanner scanner) {
        System.out.println("Veuillez entrer le nom de l'agence");
        String nomAgence = scanner.nextLine();

        System.out.println("Veuillez entrer le code agence");
        String codeAgence = scanner.nextLine();

        return new Agence(nomAgence, codeAgence);
    }

    public void ajouterClientToAgence(Agence agence, Client client) {

        if (agence.getClients() == null) {
            agence.setClients(new ArrayList<>());
            agence.getClients().add(client);
        } else {
            agence.getClients().add(client);
        }

    }
}
