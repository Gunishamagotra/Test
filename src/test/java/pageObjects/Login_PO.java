package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Login_PO extends Base_PO {
    private @FindBy(id = "text")
    WebElement UsernameTextBox;

    private @FindBy(id = "password")
    WebElement PasswordTextBox;

    private @FindBy(id= "login-button")
    WebElement clickLoginButton;


    public Login_PO(){
        super();
    }
    public void navigateToLoginPage(){
        navigateToURL("http://www.webdriveruniversity.com/Login-Portal/index.html?");

    }

    public void setUsername(String text){
        sendKeys(UsernameTextBox, text);
    }
    public void setPassword(String password){
        sendKeys(PasswordTextBox, password);


    }
    public void setClickLoginButton(){
        click(clickLoginButton);
    }


}
