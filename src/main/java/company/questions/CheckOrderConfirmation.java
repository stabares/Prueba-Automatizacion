package company.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static company.userinterfaces.CheckoutPage.TEXT_ORDER_CONFIRMATION;

public class CheckOrderConfirmation implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return TEXT_ORDER_CONFIRMATION.resolveFor(actor).isVisible();
    }

    public static CheckOrderConfirmation isVisible() {
        return new CheckOrderConfirmation();
    }
}
