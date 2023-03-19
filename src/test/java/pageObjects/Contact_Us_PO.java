package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class Contact_Us_PO extends Base_PO{
    public Contact_Us_PO(){
        super();
    }
    public void navigateToContactUsPage(){
        navigateToURL("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
    }
    private @FindBy(how = How.NAME, using = "first_name")
    WebElement firstNameTextBox;

    public void setFirstName(){
        sendKeys(firstNameTextBox,"Farzi");
    }
    private @FindBy(how = How.NAME, using = "last_name")
    WebElement lastNameTextBox;
    public void setLastName(){
        sendKeys(lastNameTextBox, "Sv");
    }

    private @FindBy(how = How.NAME, using = "email")
    WebElement emailTextBox;

    public void setEmail(){
        sendKeys(emailTextBox, "sv.farzi@gmail.com");
    }

    private @FindBy(how = How.NAME, using= "message")
    WebElement commentTextBox;

    public void setComment(){
        sendKeys(commentTextBox, "Thanks");
    }

    private @FindBy(how = How.CSS, using = "[value=\"SUBMIT\"]")
    WebElement clickSubmitButton;

    public void clickSubmit(){
        click(clickSubmitButton);
    }

//    private @FindBy(xpath = "/div[@id='contact_reply']/h1")
//    WebElement successfulSubmissionMessage;

//    private @FindBy(how = How.XPATH, using = "//div[@id='contact_reply']/h1")
//    WebElement successfulSubmissionMessage;

    public void validateSuccesfulMessage(String message){
        WebElement Test = getDriver().findElement(By.xpath("//div[@id='contact_reply']/h1"));
        Assert.assertEquals(Test.getText(),message);
       // getDriver().switchTo().
    }


}
