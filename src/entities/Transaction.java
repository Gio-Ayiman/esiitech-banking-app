package entities;

import enums.TypeTransaction;

public class Transaction {
    private Compte compte;
    private TypeTransaction typeTransaction;
    private Double montantTransaction;
    private Compte compteDestinataire;

    public Transaction(Compte compte, TypeTransaction typeTransaction, Double montantTransaction) {
        this.compte = compte;
        this.typeTransaction = typeTransaction;
        this.montantTransaction = montantTransaction;
    }

    public Transaction(Compte compte, TypeTransaction typeTransaction, Double montantTransaction, Compte compteDestinataire) {
        this.compte = compte;
        this.typeTransaction = typeTransaction;
        this.montantTransaction = montantTransaction;
        this.compteDestinataire = compteDestinataire;
    }

    public Compte getCompte() {
        return compte;
    }

    public void setCompte(Compte compte) {
        this.compte = compte;
    }

    public TypeTransaction getTypeTransaction() {
        return typeTransaction;
    }

    public void setTypeTransaction(TypeTransaction typeTransaction) {
        this.typeTransaction = typeTransaction;
    }

    public Double getMontantTransaction() {
        return montantTransaction;
    }

    public void setMontantTransaction(Double montantTransaction) {
        this.montantTransaction = montantTransaction;
    }

    public Compte getCompteDestinataire() {
        return compteDestinataire;
    }

    public void setCompteDestinataire(Compte compteDestinataire) {
        this.compteDestinataire = compteDestinataire;
    }
}
