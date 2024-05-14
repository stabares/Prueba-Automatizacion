package company.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ProductsPage {
    public static final Target BTN_ADD_TO_CART = Target.the("Click en producto").locatedBy("//*[@id='add-to-cart-sauce-labs-backpack']");
    public static final Target BTN_SHOPPING_CART = Target.the("Click en el carrito").locatedBy("//*[@id='shopping_cart_container']");
    public static final Target BTN_CHECKOUT = Target.the("Boton para el checkout").locatedBy("//*[@id='checkout']");
}
