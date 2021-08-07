package certifications.pruebas.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

    public static Target VALIDATION_MESSAGE = Target.the("Validation message").
            locatedBy("//td[contains(text(),' ')]");

    public static Target BUTTON_DEPOSIT = Target.the("Click on deposit").
            locatedBy("//a[contains(text(),'Deposit')]");

    public static Target ENTER_ACCOUNT_NO = Target.the("Enter account").
            locatedBy("//input[@onblur='validateaccountno();']");

    public static Target AMOUNT = Target.the("enter amount  ").
            locatedBy("//input[@onblur='validateammount();']");

    public static Target DESCRIPTION = Target.the("Enter description").
            locatedBy("//input[@onblur='validatedesc();']");

    public static Target DESCRIPTION_REQUIRED = Target.the("Enter description").
            locatedBy("//label[@id='message1']");

    public static Target BUTTON_SUBMIT = Target.the("Click on submit").
                locatedBy("//input[@name='AccSubmit']");

    public static Target BUTTON_NEW_CUSTOMER = Target.the("Click new customer").
            locatedBy("//a[contains(text(),'New Customer')]");

    public static Target ENTER_NAME = Target.the("Enter name").
            locatedBy("//input[@onblur='validatecustomername();']");

    public static Target GENDER = Target.the("click on gender").
            locatedBy("(//input[@name='rad1'])[1]");

    public static Target DATE_OF_BIRTH = Target.the("enter date of birth").
            locatedBy("//input[@onkeyup='validatedob();']");

    public static Target ADDRESS = Target.the("Enter adrres").
            locatedBy("//textarea[@onkeyup='validateAddress();']");

    public static Target CITY = Target.the("enter to city").
            locatedBy("//input[@onkeyup='validateCity();']");

    public static Target STATE = Target.the("enter to state").
            locatedBy("//input[@onkeyup='validateState();']");

    public static Target PIN = Target.the("ente to pin").
            locatedBy("//input[@onkeyup='validatePIN();']");

    public static Target MOBILE_NUMBER = Target.the("ente to number mobile").
            locatedBy("//input[@onkeyup='validateTelephone();']");

    public static Target EMAIL = Target.the("ente to email").
            locatedBy("//input[@onkeyup='validateEmail();']");

    public static Target PASSWORD_COUNT = Target.the("ente to password").
            locatedBy("//input[@onkeyup='validatepassword();']");

    public static Target SUBMIT_CUSTOMER = Target.the("Click on submit costumer").
            locatedBy("//input[@type='submit']");

    public static Target BUTTON_NEW_ACCOUNT = Target.the("Click on new account").
            locatedBy("//a[contains(text(),'New Account')]");

    public static Target ENTER_CUSTOMER_ID = Target.the("enter customer id").
            locatedBy("//input[@onkeyup='validatecustomerid();']");

    public static Target ENTER_INITAL = Target.the("enter initial deposit").
            locatedBy("//input[@onkeyup='validateinideposit();']");

    public static Target SUBMIT_ACCOUNT = Target.the("Click on subtmit").
            locatedBy("//input[@name='button2']");

    public static Target CUSTOMER_ID = Target.the("copy customer id").
            locatedBy("//tbody/tr[4]/td[2]");

    public static Target ACCOUNT_ID = Target.the("copy account id").
            locatedBy("//tbody/tr[4]/td[2]");

    public static Target CURRENT_AMOUNT = Target.the("copy current amount").
            locatedBy("//tbody/tr[10]/td[2]");

    public static Target BUTTON_WITHDRAWAL = Target.the("click Withdrawal").
            locatedBy("//a[contains(text(),'Withdrawal')]");

    public static Target CURRENT_BALANCE = Target.the("copy current balance").
            locatedBy("//tbody/tr[23]/td[2]");

}

