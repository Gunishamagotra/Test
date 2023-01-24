package stepDefinations;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class Contact_Us_StepsTest

{
   private WebDriver driver;
        @Before
                public void setup()
        {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/main/java/drivers/chromedriver");
            //        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "/src/main/java/drivers/chromedriver");

            ChromeOptions chromeOptions= new ChromeOptions();
            //   chromeOptions.
           chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
           driver= new ChromeDriver(chromeOptions);
            driver.manage().window().maximize();

        }
        @After
        public void teardown()
        {
            driver.quit();
        }



    @Given("User is on ContactUs Page")
    public void user_is_on_contact_us_page() throws InterruptedException {
            driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
            Thread.sleep(5000);

    }
    @When("User enters unique first name")
    public void user_enters_unique_first_name() {
            driver.findElement(By.xpath("//*[@id=\"contact_form\"]/input[1]")).sendKeys("Farzi");


    }
    @And("User enters unique last name")
    public void user_enters_unique_last_name() {
            driver.findElement(By.xpath("//*[@id=\"contact_form\"]/input[2]")).sendKeys("Sv");
    }
    @And("User enters unique email id")
    public void user_enters_unique_email_id() {
            driver.findElement(By.xpath("//*[@id=\"contact_form\"]/input[3]")).sendKeys("farzisv@gmail.com");
    }
    @And("User enetrs comment")
    public void user_enetrs_comment() {
            driver.findElement(By.xpath("//*[@id=\"contact_form\"]/textarea")).sendKeys("Welcome");
    }
    @And("User clicks on submit button")
    public void user_clicks_on_submit_button() {
            driver.findElement(By.xpath("//*[@id=\"form_buttons\"]/input[2]")).click();
    }
    @Then("Verify that user gets successful submission message")
    public void verify_that_user_gets_successful_submission_message() throws InterruptedException {
            String gun= driver.findElement(By.xpath("//*[@id=\"contact_reply\"]/h1")).getText();
            String mag= "Thank You for your Message!";
        Assert.assertEquals(gun,mag);
        Thread.sleep(5000);

    }


}
