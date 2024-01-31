package entities;

import java.util.List;

public class Agence {
    private String nom;
    private String codeAgence;
    private List<Client> clients;

    public Agence(String nom, String codeAgence) {
        this.nom = nom;
        this.codeAgence = codeAgence;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCodeAgence() {
        return codeAgence;
    }

    public void setCodeAgence(String codeAgence) {
        this.codeAgence = codeAgence;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }
}
