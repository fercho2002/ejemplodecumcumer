package seleniumgluecode.PortalGestion;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import seleniumgluecode.TestBase;

public class Test_LoginPortalGestion extends TestBase {

    @Given("^El usuario debe estar en la página de login$")
    public void el_usuario_debe_estar_en_la_página_de_login() throws Throwable {
        loginPortalGestionPage.loginPage();
    }

    @When("^Ingrese el nombre_usuario \"([^\"]*)\"$")
    public void ingrese_el_nombre_usuario(String nombre_usuario) throws Throwable {
        loginPortalGestionPage.validaUsuario(nombre_usuario);
    }

    @And("^Ingresa la contraseña \"([^\"]*)\"$")
    public void ingresa_la_contraseña(String contraseña) throws Throwable {
        loginPortalGestionPage.validarContrasena(contraseña);
    }

    @And("^Presiona el botón Iniciar sesion$")
    public void presiona_el_botón_Iniciar_sesion() throws Throwable {
        loginPortalGestionPage.iniciarSesion();
    }

    @Then("^Se muestra la pantalla principal del portal gestion$")
    public void se_muestra_la_pantalla_principal_del_portal_gestion() throws Throwable {
        loginPortalGestionPage.pantallaPrincipal();

    }

    @Then("^Se muestra el error de inicio de Sesion$")
    public void se_muestra_el_error_de_inicio_de_Sesion() throws Throwable {
        loginPortalGestionPage.loginError();
    }

    @Then("^Se muestra el error de campo obligatorio$")
    public void se_muestra_el_error_de_campo_obligatorio() throws Throwable {
        loginPortalGestionPage.loginCampoObligatorio();
    }
}
