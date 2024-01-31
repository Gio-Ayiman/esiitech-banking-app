import entities.Utilisateur;
import services.UtilisateurService;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        UtilisateurService utilisateurService = new UtilisateurService();
        Utilisateur user = utilisateurService.creerUtilisateur(scanner);
        System.out.println(user);
    }
}
