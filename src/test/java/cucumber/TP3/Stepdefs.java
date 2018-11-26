package cucumber.TP3;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class Stepdefs {
	private Joueur umtiti;
	private Equipe france;
	private Equipe cameroun;
	

	
	@Given("^la création de Umtiti qui appartient de cameroun$")
	public void la_création_de_Umtiti_qui_appartient_de_cameroun(){
		cameroun = new Equipe("Equipe de Cameroun",1955,new ArrayList<>());
		umtiti = new Joueur(7,"Umtiti",cameroun);
	}

	@When("^le manager valide le transfert du Umtiti de cameroun à france$")
	public void le_manager_valide_le_transfert_du_Umtiti_de_cameroun_à_france(){
		france = new Equipe("Equipe de France",1904,new ArrayList<Joueur>());
		umtiti.transferJoueur(france);
	}

	@Then("^l'équipe de joueur après le transfert sera france$")
	public void l_équipe_de_joueur_après_le_transfert_sera_france(){
		assertEquals(france, umtiti.getEquipe());
	}

	private String name;
	private int Charbon;
    	private int NombreHeuredispo;
    	private String Etat;
	private int Etat2;
	private int capacity =0;

	
	@Given("^Creation d un charbonnier avec un nom, une Qte de Charbon, son nombre d heures de travail ainsi que son etat d humeur$")
	public void creation_d_un_charbonnier_avec_un_nom_une_Qte_de_Charbon_son_nombre_d_heures_de_travail_ainsi_que_son_etat_d_humeur(){
    	// Write code here that turns the phrase above into concrete actions
		this.name = "marc";	
		this.Charbon = 10;
		this.NombreHeuredispo = 72;
		this.Etat = "Content";

	}	

	@Given("^la creation d une mine avec son nom\\.$")
	public void la_creation_d_une_mine_avec_son_nom(){
	    // Write code here that turns the phrase above into concrete actions
		this.name="mine1";
    
	}

	@Then("^Le charbonnier est affecte a la mine et peut y travailler\\.$")
	public void le_charbonnier_est_affecte_a_la_mine_et_peut_y_travailler(Charbonnier charbonn1, Mine mine1){
    		// Write code here that turns the phrase above into concrete actions
    		charbonn1.Travailler(mine1);
    		assertEquals(2, charbonn1.getEtat2());
	}

 	private String fruit;
    	private String actualAnswer;
    	private String Prince;

    @Given("^blanche neige ate \"([^\"]*)\"$")
    public void fruit_is(String fruit) {
        this.fruit = fruit;
    }
	
    @Given("^blanche neige kissed by \"([^\"]*)\"$")
    public void blanche_neige_kissed_by(String arg1) {
    // Write code here that turns the phrase above into concrete actions
	this.Prince=arg1;
}


    @When("^I ask whether she is alive$")
    public void i_ask_whether_she_is_alive() {
        this.actualAnswer = IsAlive.isAlive(fruit);
    }

    @When("^I ask whether she is waked$")
    public void i_ask_whether_is_awake() {
        this.actualAnswer = IsAlive.isWaked(Prince);
    }

    @Then("^I should be told \"([^\"]*)\"$")
    public void i_should_be_told(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }

    
	

}
