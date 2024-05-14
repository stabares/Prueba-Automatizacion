package company.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
    public static final Target USERNAME_BOX = Target.the("Entrada de texto para el nombre de usuario").locatedBy("//*[@id='user-name']");
    public static final Target PASSWORD_BOX = Target.the("Entrada de texto para la contraseña").locatedBy("//*[@id='password']");
    public static final Target LOGIN_BUTTON = Target.the("Boton para iniciar sesion").locatedBy("//*[@id='login-button']");
}
