package entities;

import enums.StatutCompte;

public class Compte {
    private String numero;
    private Double solde;
    private StatutCompte statut;
    private Client proprietaire;

    public Compte(String numero, Double solde, StatutCompte statut) {
        this.numero = numero;
        this.solde = solde;
        this.statut = statut;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Double getSolde() {
        return solde;
    }

    public void setSolde(Double solde) {
        this.solde = solde;
    }

    public StatutCompte getStatut() {
        return statut;
    }

    public void setStatut(StatutCompte statut) {
        this.statut = statut;
    }

    public Client getProprietaire() {
        return proprietaire;
    }

    public void setProprietaire(Client proprietaire) {
        this.proprietaire = proprietaire;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "numero='" + numero + '\'' +
                ", solde=" + solde +
                ", statut=" + statut +
                ", proprietaire=" + proprietaire +
                '}';
    }
}
