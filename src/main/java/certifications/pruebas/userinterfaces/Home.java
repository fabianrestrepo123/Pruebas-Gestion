package certifications.pruebas.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Home {

    public static  Target CLICK_HERE = Target.the("Click on here").
            locatedBy("//a[contains(text(),'here')]");

    public static  Target ENTER_USER = Target.the("Enter user").
            locatedBy("//input[@onkeyup='validateuserid();']");

    public static  Target ENTER_PASSWORD = Target.the("enter password").
            locatedBy("//input[@onkeyup='validatepassword();']");

    public static  Target CLIC_LOGIN = Target.the("clic login").
            locatedBy(" //input[@name='btnLogin']");


}
