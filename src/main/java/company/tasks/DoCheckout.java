package company.tasks;

import company.userinterfaces.CheckoutPage;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.logging.Logger;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoCheckout implements Task {

    private final String firstName;
    private final String lastName;
    private final String postalCode;

    public DoCheckout(String firstName, String lastName, String postalCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.postalCode = postalCode;
    }

    public static Performable completeInformation () {
        String firstName = "Daniel";
        String lastName = "Torres";
        String postalCode = "35001";
        return instrumented(DoCheckout.class, firstName , lastName, postalCode);
    }

    @Override
    @Step("Registra la informacion del usuario")
    public <T extends Actor> void performAs(T actor) {
        Logger.getAnonymousLogger().info("Registra la informacion del usuario, da click en continuar y finalizar");
        actor.attemptsTo(
                Enter.theValue(firstName).into(CheckoutPage.FIRST_NAME_BOX),
                Enter.theValue(lastName).into(CheckoutPage.LAST_NAME_BOX),
                Enter.theValue(postalCode).into(CheckoutPage.POSTAL_CODE_BOX),
                Click.on(CheckoutPage.BTN_CONTINUE),
                Click.on(CheckoutPage.BTN_FINISH)
        );
    }
}
