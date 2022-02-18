package pom.PortalGestion.Configuracion.Redes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pom.BasePage;

public class Crear_RedPage extends BasePage {
    public Crear_RedPage(WebDriver driver) {
        super(driver);
    }

    //--------------------------------------------------------------------------Crear Convenio---------------------------------------------------------------------------------------

    private By crearRedTitulo = By.xpath("//strong[contains(.,'Crear Red')]");
    private By nombreRedInput = By.id("_SoatConfigurationNetworksPortlet_networkName");
    private By convenioSelect = By.xpath("//select[@id='_SoatConfigurationNetworksPortlet_agreementId']");
    private By estadoSelect = By.xpath("//select[@id='_SoatConfigurationNetworksPortlet_stateId']");
    private By causalSelect = By.xpath("//select[@id='_SoatConfigurationNetworksPortlet_causalId']");
    private By departamentoDistribucionSelect = By.xpath("//select[@id='_SoatConfigurationNetworksPortlet_departmentId']");
    private By ciudadDistribucionSelect = By.xpath("//select[@id='_SoatConfigurationNetworksPortlet_residentCityId']");
    private By informacionAdministrativaTitulo = By.xpath("//form[@id='_SoatConfigurationNetworksPortlet_frmNetworkSave']/strong[1]//strong[contains(.,'Información Administrativa')]");
    private By diasCarteraInput = By.id("_SoatConfigurationNetworksPortlet_portfolioDays");

    public void crearRedTitulo() throws Exception {
        Thread.sleep(2000);
        textEquals("Crear Red",crearRedTitulo);
        Thread.sleep(1000);
    }

    public void ingresarNombreRed(String nombre_red) throws Exception {
        input(nombre_red,nombreRedInput);
        Thread.sleep(1000);
    }

    public void seleccionarConvenio(String convenio) throws Exception {
        selectElement(convenio,convenioSelect);
        Thread.sleep(1000);
    }

    public void seleccionarEstadoRed(String estado) throws InterruptedException {
        selectElement(estado,estadoSelect);
        Thread.sleep(1000);
    }

    public void seleccionarCausal(String causal) throws InterruptedException {
        selectElement(causal,causalSelect);
        Thread.sleep(1000);
    }

    public void seleccionarDepartamentoDistribucion(String departamento_distribucion) throws InterruptedException {
        selectElement(departamento_distribucion,departamentoDistribucionSelect);
        Thread.sleep(1000);
    }

    public void seleccionarCiudadDistribucion(String ciudad_distribucion) throws InterruptedException {
        selectElement(ciudad_distribucion,ciudadDistribucionSelect);
        Thread.sleep(1000);
    }

    public void ingresarDiasCartera(String dias_carteras) throws Exception {
        input(dias_carteras,diasCarteraInput);
        Thread.sleep(1000);
    }
}
