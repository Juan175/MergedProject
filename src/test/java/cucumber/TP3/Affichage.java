package cucumber.TP3;

import java.util.Observable;

public class Affichage implements Observateur {


	@Override
	public void actualiser(Match o) {
		System.out.println("La date du match : "+o.getDateMatch()+"  Les deux équipes : "+o.getEquipe1()+" et "+o.getEquipe2());		
	}

	
}
