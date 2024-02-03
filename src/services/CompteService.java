package services;

import entities.Agence;
import entities.Banque;
import entities.Compte;
import enums.StatutCompte;
import utils.Helper;

public class CompteService {
    public Compte creerCompte(Agence agence, Banque banque) {
        String codeBanque = banque.getCodeBanque();
        String codeAgence = agence.getCodeAgence();
        String numeroCompte = Helper.generateAccountNumber((int) (Math.random() * 99999));
        String cle = String.valueOf(20 + (int) (Math.random() * 10));

        String rib = codeBanque + codeAgence + numeroCompte + cle;

        return new Compte(rib, 0.0, StatutCompte.ACTIF);
    }

    public String consulterSolde(Compte compte) {
        return "Le solde du compte "+ compte.getNumero() + " est de " + compte.getSolde() + "XAF";
    }

    public void afficherCompte(Compte compte) {
        System.out.println(compte);
    }
}
