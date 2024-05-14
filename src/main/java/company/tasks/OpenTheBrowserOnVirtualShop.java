package company.tasks;

import company.userinterfaces.VirtualShopPage;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import java.util.logging.Logger;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenTheBrowserOnVirtualShop implements Task {
    @Override
    @Step("{0} Abre el navegador en la pagina inicio de sesion de la tienda virtual")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(new VirtualShopPage()));
        Logger.getAnonymousLogger().info("Se abre Swag Labs");
    }

    public static OpenTheBrowserOnVirtualShop on (){
        return instrumented(OpenTheBrowserOnVirtualShop.class);
    }
}
