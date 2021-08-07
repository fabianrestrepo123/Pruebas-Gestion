package certifications.pruebas.task;

import certifications.pruebas.utils.Constant;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.Wait;

import static certifications.pruebas.userinterfaces.HomePage.*;

public class CaseOne implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(SendKeys.of(Constant.ACCOUNT_FALSE).into(ENTER_ACCOUNT_NO),
                Click.on(AMOUNT));
        actor.remember("Required", Text.of(DESCRIPTION_REQUIRED).viewedBy(actor).asString());
        String valorDos = actor.recall("Required");
        System.out.println("Campo obligatorio: "+ valorDos);
        actor.attemptsTo(Click.on(BUTTON_NEW_CUSTOMER));



    }

    public static CaseOne one (){
        return new CaseOne();
    }
}
