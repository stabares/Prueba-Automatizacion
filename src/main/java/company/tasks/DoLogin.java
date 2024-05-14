package company.tasks;

import company.userinterfaces.LoginPage;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.logging.Logger;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoLogin implements Task {

    private final String username;
    private final String password;

    public DoLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static Performable withCredentials () {
        String username = "standard_user";
        String password = "secret_sauce";
        return instrumented(DoLogin.class, username , password);
    }

    @Override
    @Step("Inicia sesion con las credenciales dadas")
    public <T extends Actor> void performAs(T actor) {
        Logger.getAnonymousLogger().info("Inicia sesion con las credenciales dadas");
        actor.attemptsTo(
                Enter.theValue(username).into(LoginPage.USERNAME_BOX),
                Enter.theValue(password).into(LoginPage.PASSWORD_BOX),
                Click.on(LoginPage.LOGIN_BUTTON)
        );
    }
}
