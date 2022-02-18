package pom.PortalGestion.Configuracion.Redes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pom.BasePage;

public class Config_RedesPage extends BasePage {
    public Config_RedesPage(WebDriver driver) {
        super(driver);
    }

    private By redes = By.linkText("Redes");
    private By configurarRedesTitulo = By.xpath("//strong[contains(.,'Configurar Redes')]");
    private By canalDistribuidorComercialSelect = By.id("_SoatConfigurationNetworksPortlet_channelId");
    private By zonaSelect = By.id("_SoatConfigurationNetworksPortlet_zoneCode");
    private By claveConvenioInput = By.id("_SoatConfigurationNetworksPortlet_agreementKey");
    private By claveRedInput = By.id("_SoatConfigurationNetworksPortlet_networkKey");
    private By nombreRedInput = By.id("_SoatConfigurationNetworksPortlet_networkName");
    private By crearRedBoton = By.xpath("//a[contains(.,'Crear Red')]");
    private By buscarBoton = By.xpath("//span[@class='lfr-btn-label']");
    private By editarBoton = By.xpath("//em[@class='icon-axa-fu042']");
    private By tablaResultado = By.xpath("//tr[@class='odd']");
    private By nombreCanalResultado = By.xpath("//*[@id=\"data-table-soat\"]/tbody/tr[1]/td[2]");
    private By nombreZonaResultado = By.xpath("//*[@id=\"data-table-soat\"]/tbody/tr[1]/td[4]");
    private By claveConvenioResultado = By.xpath("//*[@id=\"data-table-soat\"]/tbody/tr[1]/td[5]");
    private By nombreConvenioResultado = By.xpath("//*[@id=\"data-table-soat\"]/tbody/tr[1]/td[6]");


    public void subMenuRedes() throws Exception {
        waitImplicit(redes);
        mouseHoverSubMenu(redes);
    }

    public void crearRed() throws Exception {
        waitImplicit(crearRedBoton);
        clic(crearRedBoton);
        Thread.sleep(1000);
    }

    public void seleccionarCanalDistribuidor(String canal_distribuidor) throws InterruptedException {
        waitImplicit(canalDistribuidorComercialSelect);
        selectElement(canal_distribuidor,canalDistribuidorComercialSelect);
        Thread.sleep(1000);
    }

    public void seleccionarZona(String zona) throws InterruptedException {
        waitImplicit(zonaSelect);
        selectElement(zona,zonaSelect);
        Thread.sleep(1000);
    }

    public void ingresarClaveConvenio(String clave_convenio) throws Exception {
        waitImplicit(claveConvenioInput);
        input(clave_convenio,claveConvenioInput);
        Thread.sleep(1000);
    }

    public void buscarRed() throws Exception {
        clic(buscarBoton);
    }

    public void nombreCanal(String nombre_canal) throws InterruptedException {
        waitImplicit(tablaResultado);
        scrollDown(nombreConvenioResultado);
        textEquals(nombre_canal,nombreCanalResultado);
        Thread.sleep(1000);
    }

    public void nombreZona(String nombre_zona) throws InterruptedException {
        scrollDown(nombreZonaResultado);
        textEquals(nombre_zona,nombreZonaResultado);
        Thread.sleep(1000);
    }

    public void claveConvenio(String clave_convenio) throws InterruptedException {
        scrollDown(claveConvenioResultado);
        textEquals(clave_convenio,claveConvenioResultado);
        Thread.sleep(1000);
    }

    public void nombreConvenio(String nombre_convenio) throws InterruptedException {
        scrollDown(nombreConvenioResultado);
        textEquals(nombre_convenio,nombreConvenioResultado);
        Thread.sleep(1000);
    }

    public void editarRed() throws Exception {
        scrollDown(editarBoton);
        clic(editarBoton);
    }

}
