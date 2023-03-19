package java_prep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] arg) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/java/driver/drivers/chromedriver");

//Creating an object of ChromeDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

//Deleting all the cookies
        driver.manage().deleteAllCookies();

//Specifiying pageLoadTimeout and Implicit wait
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

//launching the specified URL
        driver.get("https://www.gadgetinsurance.com/");

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       // driver.findElement(By.id("cookie_action_close_header")).click();


        driver.findElement(By.xpath("//button[contains(text(), 'Accept All Cookies')]")).click();



//Locating the elements using name locator for the text box
        //   driver.findElement(By.name("q")).sendKeys("YouTube");

//name locator for google search button
        //      WebElement searchIcon = driver.findElement(By.name("btnK"));
        //     searchIcon.click();
    }


}


