package certifications.pruebas.task;

import certifications.pruebas.utils.Constant;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.EnterValue;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.questions.Text;

import static certifications.pruebas.userinterfaces.Credentials.*;
import static certifications.pruebas.userinterfaces.Home.*;
import static certifications.pruebas.userinterfaces.RegisterEmail.*;

public class Register implements Task {

    public static Constant datoss = new Constant();

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CLICK_HERE),
                SendKeys.of(Constant.EMAIL).into(ENTER_EMAIL),
                Click.on(CLIC_SUBMIT));
        actor.remember("UserID", Text.of(ID_SESION).viewedBy(actor).asString());
        actor.remember("Password", Text.of(PASSWORD).viewedBy(actor).asString());
        System.out.println("userID: "+ actor.recall("UserID")+
                "Password: "+actor.recall("Password"));

        String datosOne [] = {actor.recall("UserID"),actor.recall("Password")};
        datoss.setDatos(datosOne);
    }



    public static Register register( ){
        return new Register();
    }
}
