package cucumber.TP3;

public class BilletVIP implements ChoixTicket{

	@Override
	public void acheterTicket(Object o) {
		// TODO Auto-generated method stub
		if ((o instanceof Princesse) || (o instanceof Prince))
		{
			System.out.println("Vous avez vendu un billet VIP à un Prince ou une Princesse");
		}
		
	}
	


}
