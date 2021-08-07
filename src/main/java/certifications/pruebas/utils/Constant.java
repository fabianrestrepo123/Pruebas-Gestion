package certifications.pruebas.utils;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.questions.Text;

import static certifications.pruebas.userinterfaces.Credentials.ID_SESION;

public class Constant {

    public Constant() {
        this.datos = null;
    }

    int numero = (int)(Math.random()*10+100);

    public static final String EMAIL = "pachin"+(int)(Math.random()*10+10000)+"@gmail.com";

    public String[] getDatos() {
        return datos;
    }

    public void setDatos(String[] datos) {
        this.datos = datos;
    }

    String datos [] = new String[2];

    public static final String NAME = "Fabian Restrepo";
    public static final String DATE_OF_BIRTH = "21051997";
    public static final String ADDRES = "calle75sur53";
    public static final String CITY = "medellin";
    public static final String STATE = "soltero";
    public static final String PIN = "199700";
    public static final String MOBILE = "3109377788";
    public static final String PASSWORD = "restrepo1400";
    public static final String ACCOUNT_FALSE = "1400";
    public static final String INITIAL = "100000";
    public static final String DESCRIPTION = "Deposito para el usuario";







}
