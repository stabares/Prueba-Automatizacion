package company.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CheckoutPage {
    public static final Target FIRST_NAME_BOX = Target.the("Registra el nombre").locatedBy("//*[@id='first-name']");
    public static final Target LAST_NAME_BOX = Target.the("Registra el apellido").locatedBy("//*[@id='last-name']");
    public static final Target POSTAL_CODE_BOX = Target.the("Registra el codigo postal").locatedBy("//*[@id='postal-code']");
    public static final Target BTN_CONTINUE = Target.the("Boton para continuar").locatedBy("//*[@id='continue']");
    public static final Target BTN_FINISH = Target.the("Boton para finalizar").locatedBy("//*[@id='finish']");
    public static final Target TEXT_ORDER_CONFIRMATION = Target.the("Texto de orden confirmada").locatedBy("//*[@class='complete-header']");
}

