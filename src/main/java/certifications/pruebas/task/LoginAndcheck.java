package certifications.pruebas.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.questions.Text;

import static certifications.pruebas.userinterfaces.Home.*;
import static certifications.pruebas.userinterfaces.HomePage.*;

public class LoginAndcheck implements Task{


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(SendKeys.of(Register.datoss.getDatos()[0]).into(ENTER_USER),
                SendKeys.of(Register.datoss.getDatos()[1]).into(ENTER_PASSWORD),
                Click.on(CLIC_LOGIN));

        actor.remember("Texto", Text.of(VALIDATION_MESSAGE).viewedBy(actor).asString());
        String valor = actor.recall("Texto");
        System.out.println( valor);

        actor.attemptsTo(Click.on(BUTTON_DEPOSIT));

    }

        public static LoginAndcheck Login(){
        return new LoginAndcheck();
    }

}
