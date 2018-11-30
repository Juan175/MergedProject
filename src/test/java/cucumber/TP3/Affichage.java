package cucumber.TP3;

import java.util.Observable;

public class Affichage implements Observateur {


	@Override
	public void actualiser(Match match) {
		// TODO Auto-generated method stub
		
	}

/*	 // Méthode appelée automatiquement lors d'un changement d'état du GPS.
    public void actualiser(Observable o)
    {
    	    Match match = (Match) o ;
            if(o instanceof Match)
            {       
                    Match m = (Match) o;
                    System.out.println("La date du match : "+m.getDateMatch()+"  Précision : "+m.getEquipe1()+"/10");
            }                     
    }
*/

}
