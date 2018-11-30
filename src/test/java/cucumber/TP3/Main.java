package cucumber.TP3;

import java.util.Date;

public class Main{

	        // Méthode principale.
	        public static void main(String[] args)
	        {
	                // Création de l'objet Gps observable.
	                Match match = new Match();
	                // Création de deux observeurs AfficheResume et AfficheComplet
	                Prince prince = new Prince("Charmant");
	                // On ajoute AfficheResume comme observeur de Gps.
	                match.ajouterObservateur(prince);
	                // On simule l'arrivée de nouvelles valeurs via des capteurs.
	                Equipe equipe1 = new Equipe();
	                Equipe equipe2 = new Equipe();
	                Date d = new Date();
	                match.setMesures(equipe1,equipe2,d);
	                // On ajoute AfficheComplet comme observeur de Gps.
	                match.ajouterObservateur(prince);	                
	        }
}

