package services;

import entities.Agence;
import entities.Banque;
import entities.Client;
import entities.Compte;
import enums.StatutCompte;

import java.util.Scanner;

public class CompteService {
    public Compte creerCompte(Agence agence, Banque banque) {
        String codeBanque = banque.getCodeBanque();
        String codeAgence = agence.getCodeAgence();
        String numeroCompte = String.valueOf(Math.round(Math.random() * 5000));
        String cle = String.valueOf(Math.round(Math.random() * 2));

        String rib = codeBanque + codeAgence + numeroCompte + cle;

        return new Compte(rib, 0.0, StatutCompte.ACTIF);
    }

    public void afficherCompte(Compte compte) {
        System.out.println(compte);
    }
}
