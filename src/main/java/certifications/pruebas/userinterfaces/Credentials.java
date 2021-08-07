package certifications.pruebas.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Credentials {

    public static Target ID_SESION = Target.the("Copy user").
            locatedBy("(//td[contains(text(),'')])[3]");

    public static Target PASSWORD = Target.the("Copy password").
            locatedBy("(//td[contains(text(),'')])[5]");


}

