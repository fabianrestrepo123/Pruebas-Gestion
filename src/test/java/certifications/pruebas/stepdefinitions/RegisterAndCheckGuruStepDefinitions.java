package certifications.pruebas.stepdefinitions;

import certifications.pruebas.task.CaseOne;
import certifications.pruebas.task.CaseTwoAndThree;
import certifications.pruebas.task.LoginAndcheck;
import certifications.pruebas.task.Register;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class RegisterAndCheckGuruStepDefinitions {

    Actor user = Actor.named("user");

    @Managed(driver =  "chrome")
    WebDriver driver;

    @Before
    public void  config(){user.can(BrowseTheWeb.with(driver));}

    @Given("the user must be on the page the guru")
    public void theUserMustBeOnThePageTheGuru() {
        user.wasAbleTo(Open.url("http://demo.guru99.com/V4/index.php"));

    }
    @When("make a resgister")
    public void makeAResgister() {
        user.wasAbleTo(Register.register());
    }

    @Then("validate message")
    public void validateMessage() {

    }

    @Given("the user must be on the page the guru home")
    public void theUserMustBeOnThePageTheGuruhome() {
        user.wasAbleTo(Open.url("http://demo.guru99.com/V4/index.php"));

    }

    @When("make a check")
    public void makeACheck() {
        user.attemptsTo(LoginAndcheck.Login(), CaseOne.one(), CaseTwoAndThree.two());

    }

    @Then("validate messages")
    public void validateMessages() {

    }

}
