package entities;

import java.util.List;

public class Banque {
    private String nom;
    private String quartier;
    private String codeBanque;
    private List<Agence> agences;

    public Banque(String nom, String quartier, String codeBanque) {
        this.nom = nom;
        this.quartier = quartier;
        this.codeBanque = codeBanque;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getQuartier() {
        return quartier;
    }

    public void setQuartier(String quartier) {
        this.quartier = quartier;
    }

    public String getCodeBanque() {
        return codeBanque;
    }

    public void setCodeBanque(String codeBanque) {
        this.codeBanque = codeBanque;
    }

    public List<Agence> getAgences() {
        return agences;
    }

    public void setAgences(List<Agence> agences) {
        this.agences = agences;
    }
}
