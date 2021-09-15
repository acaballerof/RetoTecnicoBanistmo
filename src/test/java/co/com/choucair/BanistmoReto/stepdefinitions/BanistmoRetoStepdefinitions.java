package co.com.choucair.BanistmoReto.stepdefinitions;

import co.com.choucair.BanistmoReto.model.BanistmoData;
import co.com.choucair.BanistmoReto.questions.Answer;
import co.com.choucair.BanistmoReto.tasks.OpenUp;
import co.com.choucair.BanistmoReto.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnlineCast;
import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class BanistmoRetoStepdefinitions {

    @Before
    public void setStage(){setTheStage(new OnlineCast());}

    @Given("^than Alberto wants to read the Reglamento Inversion Virtual document$")
    public void thanAlbertoWantsToReadTheReglamentoInversionVirtualDocument(){
        theActorCalled("Alberto").wasAbleTo(OpenUp.thePage());
    }

    @When("^he seach for the PDF document$")
    public void heSeachForThePDFDocument(){
        theActorInTheSpotlight().attemptsTo(Search.toThe());
    }

    @Then("^he find the PDF document about Contrato Para La Inversion Virtual Bancolombia$")
    public void heFindThePDFDocumentAboutContratoParaLaInversionVirtualBancolombia(List<BanistmoData> banistmoData) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(banistmoData.get(0))));
    }
}
