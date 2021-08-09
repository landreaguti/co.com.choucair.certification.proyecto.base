package co.com.choucair.certification.proyectobase.stepdefinitios;

import co.com.choucair.certification.proyectobase.model.AcademyChoucairData;
import co.com.choucair.certification.proyectobase.questions.Answer;
import co.com.choucair.certification.proyectobase.taks.Login;
import co.com.choucair.certification.proyectobase.taks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;


public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage () {
        OnStage.setTheStage(new OnlineCast());
    }



    @Given("^than Laura wants to learn automation at the academy choucair$")
    public void thanLauraWantsTOLearnAutomationAttheAcademyChoucair(List<AcademyChoucairData> academyChoucairData) throws Exception {
        OnStage.theActorCalled("Laura").wasAbleTo(OpenUp.thePage(), (Login.onThePage(academyChoucairData.get(0).getStrUser(),academyChoucairData.get(0).getStrPassword())));




    }

    @When("^she search for the course (.*) on the choucair academy platform$")
    public void sheSearchFortheCourseRecursosAutomatizaciónBancolombiaOnTheChoucairAcademyPlatform(List<AcademyChoucairData>academyChoucairData)
    throws Exception {

        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(academyChoucairData.get(0).getStrCourse()));

    }
    @Then("^she finds the course called recourses (.*)$")
    public void sheFindTheCoursecalledResourcesRecursosAutomatizaciónBancolombia(List<AcademyChoucairData>academyChoucairData) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(academyChoucairData.get(0).getStrCourse())));




    }

}


