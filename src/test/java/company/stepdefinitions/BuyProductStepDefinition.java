package company.stepdefinitions;

import company.questions.CheckOrderConfirmation;
import company.tasks.AddProduct;
import company.tasks.DoCheckout;
import company.tasks.DoLogin;
import company.tasks.OpenTheBrowserOnVirtualShop;
import io.cucumber.java.Before;
import io.cucumber.java.es.*;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class BuyProductStepDefinition {
    @Managed(driver = "chrome")

    public WebDriver hisbrowser;
    private Actor User = Actor.named("Usuario");

    @Before
    public void setUP()
    {
        User.can(BrowseTheWeb.with(hisbrowser));
        hisbrowser.manage().window().maximize();
        User.wasAbleTo(OpenTheBrowserOnVirtualShop.on());
    }

    @Dado("^que un usuario inicia sesion")
    public void usuarioIniciaSesion() {
        User.attemptsTo(DoLogin.withCredentials());
    }

    @Cuando("^agrega un producto al carrito")
    public void usuarioAgregaUnProducto() {
        User.attemptsTo(AddProduct.correctly());
    }

    @Y("^realiza el checkout")
        public void usuarioRealizaCheckout() {
        User.attemptsTo(DoCheckout.completeInformation());
    }

    @Entonces("debe visualizar un mensaje confirmando el envio del producto")
    public void visualizaMensaje() {
        User.should(GivenWhenThen.seeThat(CheckOrderConfirmation.isVisible()));
        Assert.assertEquals("Thank you for your order!", hisbrowser.findElement(By.xpath("//*[@class='complete-header']")).getText());
    }
}
