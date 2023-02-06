package stepDefinations.base;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.sql.Timestamp;

import static driver.DriverFactory.*;

public class Hooks {
    public WebDriver driver;
    @Before()
    public void setup()
    {
        getDriver();
//        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/java/drivers/chromedriver");
//        //        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "/src/main/java/drivers/chromedriver");
//
//        ChromeOptions chromeOptions= new ChromeOptions();
//        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
//        driver= new ChromeDriver(chromeOptions);
//        driver.manage().window().maximize();

    }
    @AfterStep
    public void captureExceptionImage(Scenario scenario){
        if (scenario.isFailed()){
            Timestamp timestamp= new Timestamp(System.currentTimeMillis());
            String time= String.valueOf(timestamp.getTime());

            byte[] screenshot= ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png",time);

        }
    }
    @After
    public void teardown()
    {
        tearDownBrowser();
        //driver.quit();
    }

}
