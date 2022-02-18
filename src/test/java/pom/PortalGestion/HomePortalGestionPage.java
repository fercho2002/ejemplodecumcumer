package pom.PortalGestion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pom.BasePage;

public class HomePortalGestionPage extends BasePage {
    public HomePortalGestionPage(WebDriver driver) {
        super(driver);
    }

    private By inicio = By.xpath("//div[@class='float-none float-md-right']//span[contains(.,'Inicio')]");
    private By reportes = By.xpath("//div[@class='float-none float-md-right']//a[@href='javascript:']/span[contains(.,'Reportes')]");
    private By transaccionesPendientes = By.xpath("//div[@class='float-none float-md-right']//span[contains(.,'Transacciones pendientes')]");
    private By configuración = By.xpath("//div[@class='float-none float-md-right']//a[@href='javascript:']/span[contains(.,'Configuración')]");
    private By novedades = By.xpath("//div[@class='float-none float-md-right']//span[contains(.,'Novedades')]");
    private By gestionUsuario = By.xpath("//div[@class='float-none float-md-right']//span[contains(.,'Gestión de usuarios SOAT')]");
    private By carteraSoat = By.xpath("//div[@class='float-none float-md-right']//a[@href='javascript:']/span[contains(.,'Cartera SOAT')]");

    public void menuInicio() throws Exception {
        textEquals(getText(inicio),inicio);
        clic(inicio);
    }
    public void menuReportes() throws Exception {
        textEquals(getText(reportes),reportes);
        clic(reportes);
    }
    public void menuTransacciones() throws Exception {
        textEquals(getText(transaccionesPendientes),transaccionesPendientes);
        clic(transaccionesPendientes);
    }
    public void menuConfiguracion() throws Exception {
        textEquals(getText(configuración),configuración);
        mouseHoverMenu(configuración);
    }
    public void menuNovedades() throws Exception {
        textEquals(getText(novedades),novedades);
        clic(novedades);
    }
    public void menuGestionUsuario() throws Exception {
        textEquals(getText(gestionUsuario),gestionUsuario);
        clic(gestionUsuario);
    }
    public void menuCartera() throws Exception {
        textEquals(getText(carteraSoat),carteraSoat);
        clic(carteraSoat);
    }
}
