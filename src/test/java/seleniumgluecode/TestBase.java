package seleniumgluecode;


import org.openqa.selenium.WebDriver;
import pom.*;
import pom.PortalGestion.*;
import pom.PortalGestion.Configuracion.Convenios.Config_ConvenioPage;
import pom.PortalGestion.Configuracion.Convenios.Crear_ConvenioPage;
import pom.PortalGestion.Configuracion.Redes.Config_RedesPage;
import pom.PortalGestion.Configuracion.Redes.Crear_RedPage;

public class TestBase {

    protected WebDriver driver = Hooks.getDriver();
    protected LoginPortalGestionPage loginPortalGestionPage = new LoginPortalGestionPage(driver);
    protected Config_ConvenioPage config_convenioPage = new Config_ConvenioPage(driver);
    protected Crear_ConvenioPage crear_convenioPage = new Crear_ConvenioPage(driver);
    protected HomePortalGestionPage homePortalGestionPage = new HomePortalGestionPage(driver);
    protected Config_RedesPage config_redesPage = new Config_RedesPage(driver);
    protected Crear_RedPage crear_redPage = new Crear_RedPage(driver);
}