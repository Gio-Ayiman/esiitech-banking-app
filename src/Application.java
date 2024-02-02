import entities.*;
import services.*;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ClientService clientService = new ClientService();
        AgenceService agenceService = new AgenceService();
        CompteService compteService = new CompteService();

        System.out.println("======== Bienvenu sur l'application BankingApp d'Esiitech ==========" + "\n");

        boolean exit = false;
        int reponse;

        do {
            afficherMenu();

            try {

                do {
                    reponse = Integer.parseInt(scanner.nextLine());
                    if (reponse < 1 || reponse > 2) {
                        System.out.println("Veuillez entrer une option valide");
                        afficherMenu();
                    }

                    if (reponse == 1) {
                        UtilisateurService utilisateurService = new UtilisateurService();
                        Utilisateur user = utilisateurService.creerUtilisateur(scanner);

                        System.out.println("Vous venez de creer un utilisateur souhaitez-vous continuer ? (OUI/NON)");
                        String choix = scanner.nextLine();

                        if (choix.toLowerCase() == "oui") {
                            System.out.println("Creation de la banque");
                            BanqueService banqueService = new BanqueService();
                            Banque banque = banqueService.creerBanque(scanner);

                            System.out.println("Creation des agences");

                            boolean ajouterAgence;

                            do {
                                Agence agence = agenceService.creerAgence(scanner);
                                banqueService.ajouterAgence(banque, agence);
                                System.out.println("Voulez-vous creer une autre agence ? (OUI/NON)");
                                ajouterAgence = scanner.nextLine().toLowerCase() == "oui" ? true : false;
                            } while (ajouterAgence);

                            System.out.println("Dans quelle agence souhaitez-vous enroller votre client ? ");
                            for (Agence agence : banque.getAgences()) {
                                System.out.println(agence.getNom());
                            }

                            String nomAgence = scanner.nextLine();
                            Agence agence = agenceService.getAgenceParNom(nomAgence, banque.getAgences());

                            if (agence == null) {
                                System.out.println("Cette agence n'existe pas");
                            } else {
                                Compte compte = compteService.creerCompte(agence, banque);

                                Utilisateur utilisateur = utilisateurService.creerUtilisateur(scanner);
                                Client client = clientService.creerClient(utilisateur, compte);
                                compte.setProprietaire(client);
                                compteService.afficherCompte(compte);
                            }

                            System.out.println("1- Revenir au menu\n2- Quitter");
                            int choixQuitter = scanner.nextInt();

                            if (choixQuitter == 1) {
                                afficherMenu();
                            } else {
                                reponse = 4;
                            }
                        }
                    } else if (reponse == 2) {
                        // TODO
                    }

                } while (reponse > 0 || reponse < 3);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }


            exit = false;
        } while (exit);


    }


    public static void afficherMenu() {
        System.out.println(" 1- Creer un utilisateur ");
        System.out.println(" 2- Creer une banque ");
    }
}
