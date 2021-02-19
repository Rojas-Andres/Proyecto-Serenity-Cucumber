package proyecto2.stepdefinitions;
//import sun.security.util.PendingException;
import cucumber.api.java.Before;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import proyecto2.task.Login;
import proyecto2.task.OpenUp;
import proyecto2.task.Search;

public class ChoucairAcademyStefDefinitions {
    //Preparamos el scenario para el actor
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Than branon wants to learn automation at the academy choucair$")
    public void thanBranonWantsToLearnAutomationAtTheAcademyChoucair() {
        //OpenUp esta en task y creamos precondiciones
        OnStage.theActorCalled("branon").wasAbleTo(OpenUp.thePage(),(Login.onThePage()));

    }


    @When("^he search for the course (.*) on the choucair academy plataform$")
    public void heSearchForTheCourseRecursosAutomatizacionBancolombiaOnTheChoucairAcademyPlataform(String course) {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(course));

    }

    @Then("^he finds the course called resources Recursos Automatizacion Bancolombia$")
    public void heFindsTheCourseCalledResourcesRecursosAutomatizacionBancolombia() {
        // Write code here that turns the phrase above into concrete actions
    }
}
