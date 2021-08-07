package certifications.pruebas.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/feature/login_and_check.feature",
        glue = "certifications.pruebas.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)

public class RegistetrAndCheck {
}
