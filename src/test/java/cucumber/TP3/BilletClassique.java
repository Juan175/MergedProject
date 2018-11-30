package cucumber.TP3;

public class BilletClassique implements ChoixTicket {

	@Override
	public void acheterTicket(Object o) {
		// TODO Auto-generated method stub
		if (o instanceof Charbonnier)
		{
			System.out.println("Vous avez vendu un billet classique à un Charbonnier");
		}
	}

}
