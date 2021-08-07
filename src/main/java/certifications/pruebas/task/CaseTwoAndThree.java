package certifications.pruebas.task;

import certifications.pruebas.utils.Constant;
import io.cucumber.java.bs.A;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.questions.Text;

import static certifications.pruebas.userinterfaces.HomePage.*;

public class CaseTwoAndThree implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(SendKeys.of(Constant.NAME).into(ENTER_NAME),
                SendKeys.of(Constant.DATE_OF_BIRTH).into(DATE_OF_BIRTH),
                SendKeys.of(Constant.ADDRES).into(ADDRESS),
                SendKeys.of(Constant.CITY).into(CITY),
                SendKeys.of(Constant.STATE).into(STATE),
                SendKeys.of(Constant.PIN).into(PIN),
                SendKeys.of(Constant.MOBILE).into(MOBILE_NUMBER),
                SendKeys.of(Constant.EMAIL).into(EMAIL),
                SendKeys.of(Constant.PASSWORD).into(PASSWORD_COUNT),
                Click.on(SUBMIT_CUSTOMER));
        actor.remember("Customer_id", Text.of(CUSTOMER_ID).viewedBy(actor).asString());
        String customer = actor.recall("Customer_id");
        System.out.println("valor: "+customer);
        actor.attemptsTo(Click.on(BUTTON_NEW_ACCOUNT),
                SendKeys.of(customer).into(ENTER_CUSTOMER_ID),
                SendKeys.of(Constant.INITIAL).into(ENTER_INITAL),
                Click.on(SUBMIT_ACCOUNT));
        actor.remember("Account_id",Text.of(ACCOUNT_ID).viewedBy(actor).asString());
        String accountID = actor.recall("Account_id");
        System.out.println("numero de cuenta: "+ accountID);
        actor.remember("CurrentAmount",Text.of(CURRENT_AMOUNT).viewedBy(actor).asString());
        String currentAcount = actor.recall("CurrentAmount");
        System.out.println("el valor de la cuenta es: "+currentAcount);

        actor.attemptsTo(Click.on(BUTTON_WITHDRAWAL),
                SendKeys.of(accountID).into(ENTER_ACCOUNT_NO),
                SendKeys.of(Constant.INITIAL).into(AMOUNT),
                SendKeys.of(Constant.DESCRIPTION).into(DESCRIPTION),
                Click.on(BUTTON_SUBMIT));
        actor.remember("CurrentBalance", Text.of(CURRENT_BALANCE).viewedBy(actor).asString());
        String current = actor.recall("CurrentBalance");
        System.out.println("El valor de la cuenta es: "+ current);
    }

    public static CaseTwoAndThree two (){
        return new CaseTwoAndThree();
    }
}
