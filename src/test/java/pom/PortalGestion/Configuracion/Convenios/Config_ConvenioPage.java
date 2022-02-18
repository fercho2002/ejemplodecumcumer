package pom.PortalGestion.Configuracion.Convenios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pom.BasePage;

public class Config_ConvenioPage extends BasePage {
    public Config_ConvenioPage(WebDriver driver) {
        super(driver);
    }

    private By convenios = By.linkText("Convenios");
    private By canalDistribuidorComercialSelect = By.id("_SoatConfigurationAgreementsPortlet_channelId");
    private By zonaSelect = By.id("_SoatConfigurationAgreementsPortlet_zoneCode");
    private By claveConvenioInput = By.id("_SoatConfigurationAgreementsPortlet_agreementKey");
    private By crearConvenioBoton = By.xpath("//a[contains(.,'Crear Convenio')]");
    private By buscarBoton = By.xpath("//span[@class='lfr-btn-label']");
    private By editarBoton = By.xpath("//em[@class='icon-axa-fu042']");
    private By tablaResultado = By.xpath("//tr[@class='odd']");
    private By nombreCanalResultado = By.xpath("//*[@id=\"data-table-soat\"]/tbody/tr[1]/td[2]");
    private By nombreZonaResultado = By.xpath("//*[@id=\"data-table-soat\"]/tbody/tr[1]/td[4]");
    private By claveConvenioResultado = By.xpath("//*[@id=\"data-table-soat\"]/tbody/tr[1]/td[5]");
    private By nombreConvenioResultado = By.xpath("//*[@id=\"data-table-soat\"]/tbody/tr[1]/td[6]");


    public void subMenuConvenio() throws Exception {
        waitImplicit(convenios);
        mouseHoverSubMenu(convenios);
    }

    public void crearConvenio() throws Exception {
        waitImplicit(crearConvenioBoton);
        clic(crearConvenioBoton);
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

    public void buscarConvenio() throws Exception {
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

    public void editarConvenio() throws Exception {
        scrollDown(editarBoton);
        clic(editarBoton);
    }

}
