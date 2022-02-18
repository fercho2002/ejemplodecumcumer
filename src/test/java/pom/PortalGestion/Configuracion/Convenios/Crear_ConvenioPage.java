package pom.PortalGestion.Configuracion.Convenios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pom.BasePage;

public class Crear_ConvenioPage extends BasePage {
    public Crear_ConvenioPage(WebDriver driver) {
        super(driver);
    }

    //--------------------------------------------------------------------------Crear Convenio---------------------------------------------------------------------------------------

    private By crearConvenioTitulo = By.xpath("//strong[contains(.,'Crear Convenio')]");
    private By datosPrincipalesTitulo = By.xpath("//strong[contains(.,'Datos Principales')]");
    private By nombreConvenioTitulo = By.xpath("//label[contains(.,'Nombre Convenio')]");
    private By nombreConvenioInput = By.id("_SoatConfigurationAgreementsPortlet_agreementName");
    private By nombreConvenioObligatorio = By.xpath("//div[@id='_SoatConfigurationAgreementsPortlet_agreementNameHelper']/div[@class='required']");
    private By canalDistribuidorTitulo = By.xpath("//label[contains(.,'Canal distribuidor Comercial')]");
    private By canalDistribuidorSelect = By.id("_SoatConfigurationAgreementsPortlet_channelId");
    private By canalDistribuidorObligatorio = By.xpath("//div[@id='_SoatConfigurationAgreementsPortlet_channelIdHelper']/div[@class='required']");
    private By claveConvenioTitulo = By.xpath("//label[contains(.,'Clave convenio')]");
    private By claveConvenioInput = By.id("_SoatConfigurationAgreementsPortlet_agreementKey");
    private By claveConvenioObligatorio = By.xpath("//div[@id='_SoatConfigurationAgreementsPortlet_agreementKeyHelper']/div[@class='required']");
    private By direccionTitulo = By.xpath("//label[contains(.,'Dirección')]");
    private By direccionInput = By.id("_SoatConfigurationAgreementsPortlet_address");
    private By direccionObligatorio = By.id("//div[@id='_SoatConfigurationAgreementsPortlet_addressHelper']/div[@class='required']");
    private By telefonoTitulo = By.xpath("//label[contains(.,'Teléfono')]");
    private By telefonoInput = By.id("_SoatConfigurationAgreementsPortlet_telephone");
    private By telefonoObligatorio = By.xpath("//div[@id='_SoatConfigurationAgreementsPortlet_telephoneHelper']/div[@class='required']");
    private By celularTitulo = By.xpath("//label[contains(.,'Celular')]");
    private By celularInput = By.id("_SoatConfigurationAgreementsPortlet_cellPhoneNumber");
    private By correoTitulo = By.xpath("//label[contains(.,'Correo')]");
    private By correoInput = By.id("_SoatConfigurationAgreementsPortlet_emailAddress");
    private By correoObligatorio = By.xpath("//div[@id='_SoatConfigurationAgreementsPortlet_emailAddressHelper']/div[@class='required']");
    private By descripcionInput = By.id("_SoatConfigurationAgreementsPortlet_description");
    private By notasInput = By.id("_SoatConfigurationAgreementsPortlet_notes");
    private By tipoIdentificacionSelect = By.id("_SoatConfigurationAgreementsPortlet_identificationTypeId");
    private By numeroIdentificacionInput = By.id("_SoatConfigurationAgreementsPortlet_identificationNumber");
    private By nombreComercialInput = By.id("_SoatConfigurationAgreementsPortlet_commercialName");
    private By departamentoResidenciaSelect = By.xpath("//select[@id='_SoatConfigurationAgreementsPortlet_departmentId']");
    private By ciudadResidenciaSelect = By.xpath("//select[@id='_SoatConfigurationAgreementsPortlet_residentCityId']");
    private By departamentoTributarioSelect = By.id("_SoatConfigurationAgreementsPortlet_taxDepartmentId");
    private By ciudadTributarioSelect = By.xpath("//select[@id='_SoatConfigurationAgreementsPortlet_taxCityId']");
    private By claseSelect = By.id("_SoatConfigurationAgreementsPortlet_agreementClass");
    private By sucursalSelect = By.id("_SoatConfigurationAgreementsPortlet_branchOfficeId");
    private By principalCheck = By.id("_SoatConfigurationAgreementsPortlet_isMain");
    private By restringidoCheck = By.id("_SoatConfigurationAgreementsPortlet_restricted");
    private By manejaRedCheck = By.id("_SoatConfigurationAgreementsPortlet_usesNetwork");
    private By restringirNovedadCheck = By.id("_SoatConfigurationAgreementsPortlet_nolveltyReplace");
    private By informacionAdministrativaTitulo = By.xpath("//strong[contains(.,'Información Administrativa')]");
    private By modoDescuentoComisionSelect = By.xpath("//select[@id='_SoatConfigurationAgreementsPortlet_commissionDiscountId']");
    private By tipoRegimenSelect = By.xpath("//select[@id='_SoatConfigurationAgreementsPortlet_regimeTypeId']");
    private By tipoConvenioSelect = By.xpath("//select[@id='_SoatConfigurationAgreementsPortlet_agreementTypeId']");
    private By estadoSelect = By.xpath("//select[@id='_SoatConfigurationAgreementsPortlet_stateId']");
    private By causalSelect = By.xpath("//select[@id='_SoatConfigurationAgreementsPortlet_causalId']");
    private By administradoPorInput = By.xpath("//input[@id='_SoatConfigurationAgreementsPortlet_administratorBy']");
    private By numeroSerieDatafonoInput = By.xpath("//input[@id='_SoatConfigurationAgreementsPortlet_dataphoneSerialNumber']");
    private By volverBoton = By.xpath("//a[contains(.,'Volver')]");
    private By nuevoBoton = By.xpath("//a[contains(.,'Nuevo')]");
    private By guardarBoton = By.xpath("//span[@class='lfr-btn-label']");
    private By alertExitoso = By.xpath("//div[@id='ToastAlertContainer']");

    //----------------------------------------------------------------------------Editar Convenio------------------------------------------------------------------------------
    private By actualizarBoton = By.xpath("//span[@class='lfr-btn-label']");


    public void pantallaConvenio() throws Exception {
        textEquals(getText(crearConvenioTitulo),crearConvenioTitulo);
        Thread.sleep(1000);
    }

    public void tablaDatosPrincipales() throws Exception {
        textEquals(getText(datosPrincipalesTitulo),datosPrincipalesTitulo);
        Thread.sleep(1000);
    }

    public void ingresarNombreConvenio(String nombre_convenio) throws Exception {
        textEquals(getText(nombreConvenioTitulo),nombreConvenioTitulo);
        input(nombre_convenio,nombreConvenioInput);
        Thread.sleep(1000);
    }

    public void seleccionarCanalDistribuidor(String canal_distribuidor) throws Exception {
        textEquals(getText(canalDistribuidorTitulo),canalDistribuidorTitulo);
        selectElement(canal_distribuidor,canalDistribuidorSelect);
        Thread.sleep(1000);
    }

    public void ingresarClaveConvenio(String clave_convenio) throws Exception {
        textEquals(getText(claveConvenioTitulo),claveConvenioTitulo);
        input(clave_convenio,claveConvenioInput);
        Thread.sleep(1000);
    }

    public void ingresarDireccion(String direccion) throws Exception {
        //clear(direccionInput);
        textEquals(getText(direccionTitulo),direccionTitulo);
        input(direccion,direccionInput);
        Thread.sleep(1000);
    }

    public void ingresarTelefono(String telefono) throws Exception {
        //clear(telefonoInput);
        textEquals(getText(telefonoTitulo),telefonoTitulo);
        input(telefono,telefonoInput);
        Thread.sleep(1000);
    }

    public void ingresarCelular(String celular) throws Exception {
        //clear(celularInput);
        textEquals(getText(celularTitulo),celularTitulo);
        input(celular,celularInput);
        Thread.sleep(1000);
    }

    public void ingresarCorreoConvenio(String correo) throws Exception {
        textEquals(getText(correoTitulo),correoTitulo);
        input(correo,correoInput);
        Thread.sleep(1000);
    }

    public void ingresarDescripcion(String descripcion) throws Exception {
        scrollDown(descripcionInput);
        input(descripcion,descripcionInput);
        Thread.sleep(1000);
    }

    public void ingresarNotas(String notas) throws Exception {
        input(notas,notasInput);
        Thread.sleep(1000);
    }

    public void SeleccionarTipoIdentificacion(String tipo_identificacion) throws Exception {
        selectElement(tipo_identificacion,tipoIdentificacionSelect);
        Thread.sleep(1000);
    }

    public void ingresarNumeroIdentificacion(String numero_identificacion) throws Exception {
        input(numero_identificacion,numeroIdentificacionInput);
        Thread.sleep(1000);
    }

    public void ingresarNombreComercial(String nombre_comercial) throws Exception {
        input(nombre_comercial,nombreComercialInput);
        Thread.sleep(1000);
    }

    public void seleccionarDepartamentoResidencia(String departamento_residencia) throws Exception {
        selectElement(departamento_residencia,departamentoResidenciaSelect);
        Thread.sleep(2000);
    }

    public void seleccionarCiudadResidencia(String ciudad_residencia) throws Exception {
        clic(ciudadResidenciaSelect);
        selectElement(ciudad_residencia,ciudadResidenciaSelect);
        Thread.sleep(2000);
    }

    public void seleccionarDepartamentoTributario(String departamento_tributario) throws InterruptedException {
        selectElement(departamento_tributario,departamentoTributarioSelect);
        Thread.sleep(1000);
    }

    public void seleccionarCiudadTributario(String ciudad_tributario) throws Exception {
        clic(ciudadTributarioSelect);
        selectElement(ciudad_tributario,ciudadTributarioSelect);
        Thread.sleep(1000);
    }

    public void seleccionarClase(String clase) throws InterruptedException {
        selectElement(clase,claseSelect);
        Thread.sleep(1000);
    }

    public void seleccionarSucursal(String sucursal) throws InterruptedException {
        selectElement(sucursal,sucursalSelect);
        Thread.sleep(1000);
    }

    public void tablaInformacionAdministrativa() throws Exception {
        textEquals(getText(informacionAdministrativaTitulo),informacionAdministrativaTitulo);
        Thread.sleep(1000);
    }

    public void seleccionarModoDescuentoComision(String modo_descuento_comision) throws InterruptedException {
        scrollDown(modoDescuentoComisionSelect);
        selectElement(modo_descuento_comision,modoDescuentoComisionSelect);
        Thread.sleep(1000);
    }

    public void seleccionarTipoRegimen(String tipo_regimen) throws InterruptedException {
        selectElement(tipo_regimen,tipoRegimenSelect);
        Thread.sleep(1000);
    }

    public void seleccionarTipoConvenio(String tipo_convenio) throws InterruptedException {
        selectElement(tipo_convenio,tipoConvenioSelect);
        Thread.sleep(1000);
    }

    public void seleccionarEstado(String estado) throws InterruptedException {
        selectElement(estado,estadoSelect);
        Thread.sleep(1000);
    }

    public void seleccionarCausal(String casual) throws InterruptedException {
        selectElement(casual,causalSelect);
        Thread.sleep(1000);
    }

    public void ingresarAdministradorPor(String administrador_por) throws Exception {
        input(administrador_por,administradoPorInput);
        Thread.sleep(1000);
    }

    public void ingresarnumeroSerieDatafono(String numero_serie_datafono) throws Exception {
        input(numero_serie_datafono,numeroSerieDatafonoInput);
        Thread.sleep(1000);
    }

    public void clickGuardar() throws Exception {
        clic(guardarBoton);
    }

    public void confirmarConvenioGuardado(String alertMessage) throws Exception {
        textEquals(alertMessage,alertExitoso);
        System.out.println("El texto al confirmar el convenio es: " + getText(alertExitoso));
    }

    public void actualizarConvenio() throws Exception {
        clic(actualizarBoton);
    }
}
