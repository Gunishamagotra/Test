package pageObjects;

import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.Random;

public class Base_PO {

    //WebDriverWait wait= new WebDriverWait(getDriver(), Duration.ofSeconds(10));

    public Base_PO(){
        PageFactory.initElements(getDriver(), this);

    }

    public int generateRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }
    public WebDriver getDriver(){
        return DriverFactory.getDriver();

    }
    public void navigateToURL(String url){
        getDriver().get(url);
    }

    public void sendKeys(By by, String textToType){
        WebDriverWait wait= new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(by)).sendKeys(textToType);
    }

    public void sendKeys(WebElement element, String textToType){
        WebDriverWait wait= new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(element)).sendKeys(textToType);

    }
    public void click(By by)
    {
        WebDriverWait wait= new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(by)).click();
    }
    public void click(WebElement element)
    {
       WebDriverWait wait= new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    public void verifyAlertMessage(String message){
        WebDriverWait wait= new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
        String alertMessage= getDriver().switchTo().alert().getText();
        Assert.assertEquals(alertMessage, message);

    }

}
