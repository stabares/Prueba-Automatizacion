package company.tasks;

import company.userinterfaces.ProductsPage;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import java.util.logging.Logger;

public class AddProduct implements Task {

    public static AddProduct correctly (){
        return Tasks.instrumented(AddProduct.class);
    }

    @Override
    @Step("Agrega un producto al carrito y da click en Checkout")
    public <T extends Actor> void performAs(T actor) {
        Logger.getAnonymousLogger().info("Agrega un producto al carrito y da click en en Checkout");
        actor.attemptsTo(
                Click.on(ProductsPage.BTN_ADD_TO_CART),
                Click.on(ProductsPage.BTN_SHOPPING_CART),
                Click.on(ProductsPage.BTN_CHECKOUT)
        );
    }
}
