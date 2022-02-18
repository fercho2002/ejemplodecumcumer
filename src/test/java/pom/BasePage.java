package pom;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import sun.awt.SunHints;

import javax.swing.*;
import java.io.File;
import java.util.List;

public class BasePage {

    public WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    protected WebElement findElement(By locator) {
        return driver.findElement(locator);
    }

    public void clic(By element) throws Exception {
        try {
            driver.findElement(element).click();
        } catch (Exception e) {
            throw new Exception("No se pudo realizar clic sobre el elemento " + element);
        }
    }

    public boolean isDisplayed(By element) throws Exception {
        try {
            return driver.findElement(element).isDisplayed();

        } catch (Exception e) {
            throw new Exception("No se pudo encontrar el elemento " + element);
        }
    }

    public String getText(By element) throws Exception {
        try {
            return driver.findElement(element).getText();
        } catch (Exception e) {
            throw new Exception("No se pudo encontrar el texto " + element);
        }
    }

    public String getTittle() throws Exception {
        try {
            return driver.getTitle();

        } catch (Exception e) {
            throw new Exception("No se pudo encontrar el titulo de la pagina ");
        }

    }

    protected void input_Enter(String inputText, By locator) throws Exception {
        try {
            driver.findElement(locator).sendKeys(inputText, Keys.ENTER);
        } catch (Exception e) {
            throw new Exception("No se pudo hacer click en el elemento y dar enter " + locator);
        }
    }

    protected void input(String inputText, By locator) throws Exception {
        try {
            if (inputText != null){
                driver.findElement(locator).clear();
                driver.findElement(locator).sendKeys(inputText);
            } else {

                driver.findElement(locator).sendKeys(inputText);
            }
        } catch (Exception e) {
            throw new Exception("No se pudo hacer click en el elemento " + locator);
        }
    }

    protected String textEquals(String textExpected, By locator){
        String getText = findElement(locator).getText();
        Assert.assertEquals(textExpected,getText);
        System.out.println("El texto esperado es: " + textExpected);
        System.out.println("El texto actual es: " + getText);
        return null;
    }

    protected void clear(By locator) {
        driver.findElement(locator).clear();
    }

    protected void scrollDown(By locator) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("window.scrollBy(0,1000)");
    }

    protected void scrollUp(By locator) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("window.scrollBy(0,-1000)");
    }

    protected void visit(String url) {
        driver.get(url);
    }

    protected void waitImplicit(By locator) {
        try {
            WebDriverWait myWaitVar = new WebDriverWait(driver, 20);
            myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(locator));
        } catch (Exception e) {
            System.out.print("No se encontro el localizador: " + locator);
            driver.quit();
        }
    }

    protected void selectElement(String texto,By locator){
        try {
            Select select = new Select(driver.findElement(locator));
            select.selectByVisibleText(texto);
        } catch(Exception e) {
            System.out.print("No se encontro el localizador: " + locator);
            driver.quit();
        }
    }

    protected void mouseHoverMenu(By locator){
        try {
            Actions actions = new Actions(driver);
            WebElement menuOption = driver.findElement(locator);
            actions.moveToElement(menuOption).perform();
            System.out.println("Movio el Mouse al localizador: " + locator);
        }catch(Exception e) {
            System.out.print("No se encontro el localizador: " + locator);
            driver.quit();
        }
    }

    protected void mouseHoverSubMenu(By locator){
        try {
            Actions actions = new Actions(driver);
            WebElement menuOption = driver.findElement(locator);
            actions.moveToElement(menuOption).click().perform();
            System.out.println("Movio el Mouse al localizador: " + locator);
        }catch(Exception e) {
            System.out.print("No se encontro el localizador: " + locator);
            driver.quit();
        }
    }

    protected void takeScreenShot(String nombre) throws Exception {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String imageFileDir = System.getProperty("user.dir") + "\\imagenes\\test";
        if (imageFileDir == null)
            imageFileDir = System.getProperty("user.dir") + "\\imagenes\\test";
        FileUtils.copyFile(scrFile, new File(imageFileDir, nombre));
    }


    }
