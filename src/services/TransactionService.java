package services;

import entities.Compte;

import java.util.Scanner;

public class TransactionService {

    public void depot(Scanner scanner, Compte compte) {
        double montant;

        System.out.println("Veuillez saisir le montant a deposer");
        montant = scanner.nextDouble();
        compte.setSolde(montant + compte.getSolde());
    }

    public void retrait(Scanner scanner, Compte compte) {
        double montant;

        System.out.println("Veuillez saisir le montant a retirer");
        montant = scanner.nextDouble();

        if (montant > compte.getSolde()) {
            System.out.println("Solde insuffisant");
        } else {
            compte.setSolde(compte.getSolde() - montant);
            System.out.println("Vous venez de retirer " + montant + "XAF. \nLe solde de votre compte est " + compte.getSolde() + "XAF");
        }
    }

    public void virement(Scanner scanner, Compte compteADebiter, Compte compteACrediter) {
        double montant;

        System.out.println("Veuillez entrer le montant de la transaction");
        montant = scanner.nextDouble();

        if (montant > compteADebiter.getSolde()) {
            System.out.println("Le solde de votre compte est insuffisant");
        } else {
            compteADebiter.setSolde(compteADebiter.getSolde() - montant);
            compteACrediter.setSolde(montant + compteACrediter.getSolde());
        }

    }
}
