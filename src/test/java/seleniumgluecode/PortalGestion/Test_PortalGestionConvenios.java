package seleniumgluecode.PortalGestion;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import seleniumgluecode.TestBase;

public class Test_PortalGestionConvenios extends TestBase {

    @And("^Ingrese nombre_usuario \"([^\"]*)\"$")
    public void ingrese_nombre_usuario(String nombre_usuario) throws Throwable {
        loginPortalGestionPage.validaUsuario(nombre_usuario);
    }

    @And("^Ingresa contraseña \"([^\"]*)\"$")
    public void ingresa_contraseña(String contraseña) throws Throwable {
        loginPortalGestionPage.validarContrasena(contraseña);
    }

    @And("^Realizar click sobre configuracion$")
    public void realizar_click_sobre_configuracion() throws Throwable {
        homePortalGestionPage.menuConfiguracion();
        Thread.sleep(2000);
    }

    @And("^Realizar click sobre submenu convenio$")
    public void realizar_click_sobre_submenu_convenio() throws Throwable {
        config_convenioPage.subMenuConvenio();
    }

    @When("^Realizar click sobre el boton crear convenio$")
    public void realizar_click_sobre_el_boton_crear_convenio() throws Throwable {
        config_convenioPage.crearConvenio();
    }

    @And("^Confirmar la pantalla crear convenio$")
    public void confirmar_la_pantalla_crear_convenio() throws Throwable {
        crear_convenioPage.pantallaConvenio();
    }

    @And("^Confirmar tabla datos principales$")
    public void confirmar_tabla_datos_principales() throws Throwable {
        crear_convenioPage.tablaDatosPrincipales();
    }

    @And("^Ingresar nombre convenio \"([^\"]*)\"$")
    public void ingresar_nombre_convenio(String nombre_convenio) throws Throwable {
        crear_convenioPage.ingresarNombreConvenio(nombre_convenio);
    }

    @And("^Seleccionar canal distribuidor comercial \"([^\"]*)\"$")
    public void seleccionar_canal_distribuidor_comercial(String canal_distribuidor) throws Throwable {
        crear_convenioPage.seleccionarCanalDistribuidor(canal_distribuidor);
    }

    @And("^Ingresar clave convenio \"([^\"]*)\"$")
    public void ingresar_clave_convenio(String clave_convenio) throws Throwable {
        crear_convenioPage.ingresarClaveConvenio(clave_convenio);
    }

    @And("^Ingresar direccion \"([^\"]*)\"$")
    public void ingresar_direccion(String direccion) throws Throwable {
        crear_convenioPage.ingresarDireccion(direccion);
    }

    @And("^Ingresar telefono \"([^\"]*)\"$")
    public void ingresar_telefono(String telefono) throws Throwable {
        crear_convenioPage.ingresarTelefono(telefono);
    }

    @And("^Ingresar celular \"([^\"]*)\"$")
    public void ingresar_celular(String celular) throws Throwable {
        crear_convenioPage.ingresarCelular(celular);
    }

    @And("^Ingresar correo convenio \"([^\"]*)\"$")
    public void ingresar_correo_convenio(String correo) throws Throwable {
        crear_convenioPage.ingresarCorreoConvenio(correo);
    }

    @And("^Ingresar descripcion \"([^\"]*)\"$")
    public void ingresar_descripcion(String descripcion) throws Throwable {
        crear_convenioPage.ingresarDescripcion(descripcion);
    }

    @And("^Ingresar notas \"([^\"]*)\"$")
    public void ingresar_notas(String notas) throws Throwable {
        crear_convenioPage.ingresarNotas(notas);
    }

    @And("^Seleccionar tipo identificacion \"([^\"]*)\"$")
    public void seleccionar_tipo_identificacion(String tipo_identificacion) throws Throwable {
        crear_convenioPage.SeleccionarTipoIdentificacion(tipo_identificacion);
    }

    @And("^Ingresar numero identificacion \"([^\"]*)\"$")
    public void ingresar_numero_identificacion(String numero_identificacion) throws Throwable {
        crear_convenioPage.ingresarNumeroIdentificacion(numero_identificacion);
    }

    @And("^Ingresar nombre comercial \"([^\"]*)\"$")
    public void ingresar_nombre_comercial(String nombre_comercial) throws Throwable {
        crear_convenioPage.ingresarNombreComercial(nombre_comercial);
    }

    @And("^Seleccionar departamento residencia \"([^\"]*)\"$")
    public void seleccionar_departamento_residencia(String departamento_residencia) throws Throwable {
        crear_convenioPage.seleccionarDepartamentoResidencia(departamento_residencia);
    }

    @And("^Seleccionar ciudad residencia \"([^\"]*)\"$")
    public void seleccionar_ciudad_residencia(String ciudad_residencia) throws Throwable {
        crear_convenioPage.seleccionarCiudadResidencia(ciudad_residencia);
    }

    @And("^Seleccionar departamento tributario \"([^\"]*)\"$")
    public void seleccionar_departamento_tributario(String departamento_tributario) throws Throwable {
        crear_convenioPage.seleccionarDepartamentoTributario(departamento_tributario);
    }

    @And("^Seleccionar ciudad tributario \"([^\"]*)\"$")
    public void seleccionar_ciudad_tributario(String ciudad_tributario) throws Throwable {
        crear_convenioPage.seleccionarCiudadTributario(ciudad_tributario);
    }

    @And("^Seleccionar clase \"([^\"]*)\"$")
    public void seleccionar_clase(String clase) throws Throwable {
        crear_convenioPage.seleccionarClase(clase);
    }

    @And("^Seleccionar sucursal \"([^\"]*)\"$")
    public void seleccionar_sucursal(String sucursal) throws Throwable {
        crear_convenioPage.seleccionarSucursal(sucursal);
    }

    @And("^Confirmar tabla informacion administrativa$")
    public void confirmar_tabla_informacion_administrativa() throws Throwable {
        crear_convenioPage.tablaInformacionAdministrativa();
    }

    @And("^Seleccionar modo descuento comision \"([^\"]*)\"$")
    public void seleccionar_modo_descuento_comision(String modo_descuento_comision) throws Throwable {
        crear_convenioPage.seleccionarModoDescuentoComision(modo_descuento_comision);
    }

    @And("^Seleccionar tipo regimen \"([^\"]*)\"$")
    public void seleccionar_tipo_regimen(String tipo_regimen) throws Throwable {
        crear_convenioPage.seleccionarTipoRegimen(tipo_regimen);
    }

    @And("^Seleccionar tipo convenio \"([^\"]*)\"$")
    public void seleccionar_tipo_convenio(String tipo_convenio) throws Throwable {
        crear_convenioPage.seleccionarTipoConvenio(tipo_convenio);
    }

    @And("^Seleccionar estado \"([^\"]*)\"$")
    public void seleccionar_estado(String estado) throws Throwable {
        crear_convenioPage.seleccionarEstado(estado);
    }

    @And("^Seleccionar casual \"([^\"]*)\"$")
    public void seleccionar_casual(String casual) throws Throwable {
        crear_convenioPage.seleccionarCausal(casual);
    }

    @And("^Ingresar administrado por \"([^\"]*)\"$")
    public void ingresar_administrador_por(String administrador_por) throws Throwable {
        crear_convenioPage.ingresarAdministradorPor(administrador_por);
    }

    @And("^Ingresar numero serie datafono \"([^\"]*)\"$")
    public void ingresar_numero_serie_datafono(String numero_serie_datafono) throws Throwable {
        crear_convenioPage.ingresarnumeroSerieDatafono(numero_serie_datafono);
    }

    @Then("^Click en el boton guardar$")
    public void click_en_el_boton_guardar() throws Throwable {
        crear_convenioPage.clickGuardar();
    }

    @Then("^Se guarda el convenio \"([^\"]*)\"$")
    public void se_guarda_el_convenio(String alertMessage) throws Throwable {
        crear_convenioPage.confirmarConvenioGuardado(alertMessage);
        Assert.assertEquals("Operación ejecutada exitosamente. - 0",alertMessage);
    }

    @And("^Seleccionar canal distribuidor \"([^\"]*)\"$")
    public void seleccionar_canal_distribuidor(String canal_distribuidor) throws Throwable {
        config_convenioPage.seleccionarCanalDistribuidor(canal_distribuidor);
    }

    @And("^Seleccionar zona \"([^\"]*)\"$")
    public void seleccionar_zona(String zona) throws Throwable {
        config_convenioPage.seleccionarZona(zona);
    }

    @When("^Click en buscar$")
    public void click_en_buscar() throws Throwable {
        config_convenioPage.buscarConvenio();
    }

    @And("^Confirmar el nombre del canal \"([^\"]*)\"$")
    public void confirmar_el_nombre_del_canal(String nombre_canal) throws Throwable {
        config_convenioPage.nombreCanal(nombre_canal);
    }

    @And("^Confirmar el nombre de la zona \"([^\"]*)\"$")
    public void confirmar_el_nombre_de_la_zona(String nombre_zona) throws Throwable {
        config_convenioPage.nombreZona(nombre_zona);
    }

    @And("^Confirmar la clave de convenio \"([^\"]*)\"$")
    public void confirmar_la_clave_de_convenio(String clave_convenio) throws Throwable {
        config_convenioPage.claveConvenio(clave_convenio);
    }

    @Then("^Se debe confirmar que tenga nombre de convenio \"([^\"]*)\"$")
    public void se_debe_confirmar_que_tenga_nombre_de_convenio(String nombre_convenio) throws Throwable {
        config_convenioPage.nombreConvenio(nombre_convenio);
    }

    @And("^Click sobre el boton editar$")
    public void click_sobre_el_boton_editar() throws Throwable {
        config_convenioPage.editarConvenio();
    }

    @Then("^Click en el boton actualizar$")
    public void click_en_el_boton_actualizar() throws Throwable {
        crear_convenioPage.actualizarConvenio();
    }
}
