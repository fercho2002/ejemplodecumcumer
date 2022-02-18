package pom.PortalGestion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pom.BasePage;

public class LoginPortalGestionPage extends BasePage {
    public LoginPortalGestionPage(WebDriver driver) {
        super(driver);
    }
    private By titulo = By.xpath("//h1[@class='title']");
    private By nombreUsuarioTitulo = By.xpath("//label[contains(.,'Nombre de usuario')]");
    private By nombreUsuarioInput = By.xpath("//input[@id='_Authentication_username']");
    private By nombreUsuarioRequerido = By.xpath("//div[@id='_Authentication_usernameHelper']/div[@class='required']");
    private By contrasenaTitulo = By.xpath("//label[contains(.,'Contraseña')]");
    private By contrasenaInput = By.xpath("//input[@id='_Authentication_password']");
    private By contrasenaRequerido = By.xpath("//div[@id='_Authentication_passwordHelper']/div[@class='required']");
    private By iniciarSesion = By.xpath("//span[@class='lfr-btn-label']");
    private By loginError = By.xpath("//div[@class='alert alert-dismissible alert-danger']");
    private By paginaPrincipalInicio = By.xpath("//div[@class='float-none float-md-right']//span[contains(.,'Inicio')]");

    public void loginPage() throws Exception {
        getText(titulo);
        System.out.println(getText(titulo));
        textEquals(getText(titulo),titulo);
    }
    public void validaUsuario(String nombre_usuario) throws Exception {
        getText(nombreUsuarioTitulo);
        textEquals(getText(nombreUsuarioTitulo),nombreUsuarioTitulo);
        input(nombre_usuario,nombreUsuarioInput);
    }
    public void validarContrasena(String contraseña) throws Exception {
        getText(contrasenaTitulo);
        textEquals(getText(contrasenaTitulo),contrasenaTitulo);
        input(contraseña,contrasenaInput);
    }
    public void iniciarSesion() throws Exception {
        clic(iniciarSesion);
    }
    public void pantallaPrincipal() throws Exception {
        getText(paginaPrincipalInicio);
        System.out.println(getText(paginaPrincipalInicio));
        textEquals(getText(paginaPrincipalInicio),paginaPrincipalInicio);
    }
    public void loginError() throws Exception {
        getText(loginError);
        System.out.println(getText(loginError));
        textEquals(getText(loginError),loginError);
    }
    public void loginCampoObligatorio() throws Exception {
        System.out.println("Nombre de Usuario: " + getText(nombreUsuarioRequerido));
        textEquals(getText(nombreUsuarioRequerido),nombreUsuarioRequerido);
        Thread.sleep(2000);
        System.out.println("Contraseña: " + getText(contrasenaRequerido));
        textEquals(getText(contrasenaRequerido),contrasenaRequerido);
    }

}
