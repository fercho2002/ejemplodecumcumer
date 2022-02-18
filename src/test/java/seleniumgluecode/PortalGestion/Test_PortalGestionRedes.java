package seleniumgluecode.PortalGestion;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import seleniumgluecode.TestBase;

public class Test_PortalGestionRedes extends TestBase {

    @And("^Realizar click sobre submenu redes$")
    public void realizar_click_sobre_submenu_redes() throws Throwable {
        config_redesPage.subMenuRedes();
    }

    @And("^Realizar click sobre el boton crear red$")
    public void realizar_click_sobre_el_boton_crear_red() throws Throwable {
        config_redesPage.crearRed();
    }

    @And("^Confirmar la pantalla crear red$")
    public void confirmar_la_pantalla_crear_red() throws Throwable {
        crear_redPage.crearRedTitulo();
    }

    @And("^Ingresar nombre de red \"([^\"]*)\"$")
    public void ingresar_nombre_de_red(String nombre_red) throws Throwable {
        crear_redPage.ingresarNombreRed(nombre_red);
    }

    @And("^Seleccionar convenio \"([^\"]*)\"$")
    public void seleccionar_convenio(String convenio) throws Throwable {
        crear_redPage.seleccionarConvenio(convenio);
    }

    @And("^Seleccionar estado red \"([^\"]*)\"$")
    public void seleccionar_estado_red(String estado) throws Throwable {
        crear_redPage.seleccionarEstadoRed(estado);
    }

    @And("^Seleccionar causal \"([^\"]*)\"$")
    public void seleccionar_causal(String causal) throws Throwable {
        crear_redPage.seleccionarCausal(causal);
    }

    @And("^Seleccionar departamento distribucion \"([^\"]*)\"$")
    public void seleccionar_departamento_distribucion(String departamento_distribucion) throws Throwable {
        crear_redPage.seleccionarDepartamentoDistribucion(departamento_distribucion);
    }

    @And("^Seleccionar ciudad distribucion \"([^\"]*)\"$")
    public void seleccionar_ciudad_distribucion(String ciudad_distribucion) throws Throwable {
        crear_redPage.seleccionarCiudadDistribucion(ciudad_distribucion);
    }

    @And("^Ingresar dias cartera \"([^\"]*)\"$")
    public void ingresar_dias_cartera(String dias_carteras) throws Throwable {
        crear_redPage.ingresarDiasCartera(dias_carteras);
    }

}
