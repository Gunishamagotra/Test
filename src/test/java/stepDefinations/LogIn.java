package stepDefinations;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObjects.Base_PO;
import pageObjects.Login_PO;

import static driver.DriverFactory.getDriver;

public class LogIn extends Base_PO {
    private Login_PO login_po;

    public LogIn(Login_PO login_po){
       this.login_po= login_po;

    }
    private WebDriver driver= getDriver();

    //Login_PO login_po = new Login_PO();

    @Given("Navigate to LogIn page")
    public void navigate_to_log_in_page() {
        //navigateToURL("http://www.webdriveruniversity.com/Login-Portal/index.html?");
       login_po.navigateToLoginPage();

    }
    @When("User enters Username {string}")
    public void user_enters_username(String Username) {
        driver.findElement(By.id("text")).sendKeys(Username);
    }
   // @When("I enters the Username {string}")
    //public void i_enters_the_username(String Username) {
      //  driver.findElement(By.id("text")).sendKeys(Username);
    //}
   @When("I enter the Username {string}")
   public void i_enter_the_username(String Username) {
       //driver.findElement(By.id("text")).sendKeys(Username);
       //sendKeys(By.id("text"),Username);
       login_po.setUsername(Username);

   }
        @And("User enters Password {string}")
    public void user_enters_password(String Password) {
        driver.findElement(By.id("password")).sendKeys(Password);
    }

    //@And("User enters the Password {string}")
    //public void user_enters_the_password(String Password) {
      //driver.findElement(By.id("password")).sendKeys(Password);}

    @And("I enter the Password {string}")
    public void iEnterThePassword(String Password) {
        //driver.findElement(By.id("password")).sendKeys(Password);
        //sendKeys(By.id("password"),Password);
        login_po.setPassword(Password);
    }
    @And("User clicks on Login Button")
    public void user_clicks_on_login_button() {

        //driver.findElement(By.id("login-button")).click();
        //click(By.id("login-button"));
        login_po.setClickLoginButton();

    }
    @Then("User gets successful message {string}")
    public void user_gets_successful_message_validation_succeeded(String message)  {
        //String xyz=driver.switchTo().alert().getText();
        //Assert.assertEquals(xyz,message);
        verifyAlertMessage(message);
    }
    @Then("User gets unsuccessful message {string}")
    public void user_gets_unsuccessful_message_validation_failed(String message)  {
        //String xyz=driver.switchTo().alert().getText();
        //Assert.assertEquals(xyz,message);
        verifyAlertMessage(message);
    }

    @Then("User gets validation message {string}")
    public void user_gets_validation_message(String message)  {
        //String validation_message=driver.switchTo().alert().getText();
        //Assert.assertEquals(validation_message,message);
        verifyAlertMessage(message);
    }

}