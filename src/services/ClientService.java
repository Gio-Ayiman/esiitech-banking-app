package services;

import entities.Client;
import entities.Compte;
import entities.Utilisateur;

public class ClientService {

    public Client creerClient(Utilisateur utilisateur, Compte compte) {
        Client client = Client.fromUser(utilisateur);
        client.setCompte(compte);

        return client;
    }
}
