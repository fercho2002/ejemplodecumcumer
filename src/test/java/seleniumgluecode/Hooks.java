package seleniumgluecode;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import runner.browser_manager.DriverManager;
import runner.browser_manager.DriverManagerFactory;
import runner.browser_manager.DriverType;

import java.util.concurrent.TimeUnit;

public class Hooks {

    private static WebDriver driver;
    private static int numberOfCase = 0;
    private DriverManager driverManager;

    @Before

    public void SetUp(){

        numberOfCase++;
        System.out.println("Se está ejecutando el escenario #" + numberOfCase);
//        System.setProperty("webdriver.chrome.driver","./src/test/resources/Chromedriver/chromedriver.exe");
        driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
        driver = driverManager.getDriver();
 //       driver.get("http://sucursalenlinea.qa.axacolpatria.co:8081/web/guest/home");
        driver.get("http://gestion.qa.axacolpatria.co/web/admin/login");
        //driver.get("https://www.google.com/?hl=es");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @After

    public void TearDown(Scenario scenario){
        System.out.println("El escenario # "+ numberOfCase +" se ejecutó correctamente");
        byte[] screenshot = ((TakesScreenshot)driverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot, "image/png");
        driverManager.quitDriver();
    }

    public static WebDriver getDriver(){
        return driver;
    }
}

