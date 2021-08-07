package certifications.pruebas.questions;

import certifications.pruebas.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidationMessage implements Question<String> {


    @Override
    public String answeredBy(Actor actor) {
        return Text.of(HomePage.VALIDATION_MESSAGE).viewedBy(actor).asString();
    }
    public static  ValidationMessage intheScreen(){
        return new ValidationMessage();
    }
}
