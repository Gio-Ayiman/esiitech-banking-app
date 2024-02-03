import entities.Agence;
import entities.Banque;
import services.AuthenticationService;
import entities.Utilisateur;
import services.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ClientService clientService = new ClientService();
        AgenceService agenceService = new AgenceService();
        CompteService compteService = new CompteService();
        BanqueService banqueService = new BanqueService();
        UtilisateurService utilisateurService = new UtilisateurService();
        AuthenticationService authenticationService = new AuthenticationService();

        List<Utilisateur> usersList = new ArrayList<>();
        List<Banque> banqueList = new ArrayList<>();
        List<Agence> agenceList = new ArrayList<>();


        Utilisateur admin = createUserAdmin();
        usersList.add(admin);

        System.out.println("======== Bienvenu sur l'application BankingApp d'Esiitech ==========" + "\n");

        boolean exitFirstMenu = false;
        do {
            afficherMenuConnexion();
            int choix = scanner.nextInt();
            scanner.nextLine();

            if (choix < 1 || choix > 2) {
                System.out.println("Entrez une option valide");
            } else if (choix == 1) {
                exitFirstMenu = true;

                System.out.println("Entrez votre username");
                String username = scanner.nextLine();

                System.out.println("Entrez votre mot de passe");
                String password = scanner.nextLine();

                Utilisateur userCourant = utilisateurService.findUserByUsername(username, usersList);
                boolean isAuthenticated = false;

                if (userCourant != null) {
                    isAuthenticated = authenticationService.authenticate(username, password, userCourant);
                } else {
                    System.out.println("Cette utilisateur n'existe pas en base de donnee");
                }

                if (Boolean.TRUE.equals(isAuthenticated)) {

                    boolean exitPremierMenuAdmin = false;

                    do {
                        afficherPremierMenuAdmin();

                        System.out.println("Choisissez une option");
                        int choixPremierMenuAdmin = scanner.nextInt();
                        scanner.nextLine();

                        if (choixPremierMenuAdmin < 1 || choixPremierMenuAdmin > 2) {
                            System.out.println("Option non valide. Recommencez !");
                        } else {
                            if (choixPremierMenuAdmin == 1) {
                                boolean choixCreerBanque = false;

                                if (banqueList.isEmpty()) {
                                    System.out.println("Il n'existe aucune banque ! Voulez vous creer une ? (OUI/NON)");
                                    choixCreerBanque = scanner.nextLine().equalsIgnoreCase("oui");
                                }

                                if (!banqueList.isEmpty()) {
                                    afficherListeBanque(banqueList);

                                    System.out.println("Voulez vous creer une autre banque ? (OUI/NON) ");
                                    choixCreerBanque = scanner.nextLine().equalsIgnoreCase("oui");

                                }

                                while (choixCreerBanque) {
                                    Banque banque = banqueService.creerBanque(scanner);
                                    banqueList.add(banque);
                                    afficherListeBanque(banqueList);

                                    System.out.println("Voulez vous creer une autre banque ? (OUI/NON) ");
                                    choixCreerBanque = scanner.nextLine().equalsIgnoreCase("oui");
                                }
                            }

                            if (choixPremierMenuAdmin == 2) {
                                if (agenceList.size() < 1) {

                                }
                            }
                        }
                    } while (!exitPremierMenuAdmin);

                } else {
                    afficherMenuConnexion();
                }


            }

        } while (!exitFirstMenu);

    }

    public static void afficherMenuConnexion() {
        System.out.println("1- Se connecter");
        System.out.println("2- Creer un compte");
    }


    public static void afficherPremierMenuAdmin() {
        System.out.println(" 1- Afficher la liste des banques ");
        System.out.println(" 2- Afficher la liste des agences");
    }

    public static Utilisateur createUserAdmin() {
        return new Utilisateur("admin", "admin");
    }

    public static void afficherListeBanque(List<Banque> banqueList) {
        int nombreBanque = banqueList.size();

        System.out.println("La liste des banques");
        for (int i = 0; i < nombreBanque; i++) {
            System.out.println(i + 1 + "- " + banqueList.get(i).getNom());
        }
    }
}
