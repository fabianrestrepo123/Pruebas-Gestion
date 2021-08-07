package certifications.pruebas.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class RegisterEmail {

    public static Target ENTER_EMAIL = Target.the("Enter  email").
            locatedBy("//input[@type='text']");

    public static Target CLIC_SUBMIT = Target.the("Clic on submit").
            locatedBy("//input[@name='btnLogin']");
}
