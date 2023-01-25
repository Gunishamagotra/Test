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


import java.util.Random;

public class Contact_Us_StepsTest

{
   private WebDriver driver;

     int generateRandomNumber(int min, int max){
       Random random= new Random();
       return random.nextInt(max-min) +min;
   }
        @Before
                public void setup()
        {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/java/drivers/chromedriver");
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
            driver.findElement(By.xpath("//*[@id=\"contact_form\"]/input[1]"))
                    .sendKeys("Farzi" + generateRandomNumber(1,10));


    }
    @And("User enters unique last name")
    public void user_enters_unique_last_name() {
            driver.findElement(By.xpath("//*[@id=\"contact_form\"]/input[2]"))
                    .sendKeys("Sv" + generateRandomNumber(1,1000));
    }
    @And("User enters unique email id")
    public void user_enters_unique_email_id() {
            driver.findElement(By.xpath("//*[@id=\"contact_form\"]/input[3]")).sendKeys("farzisv" + generateRandomNumber(1,100) + "@gmail.com");
    }
    @And("User enters comment")
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


//    @When("User enters specific {string} Farzi")
//    public void userEntersSpecificFarzi(DataTable dataTable) {
//
//    }

    @When("User enters specific first name {string}")
    public void userEntersSpecific(String firstName) {
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/input[1]"))
                .sendKeys(firstName + generateRandomNumber(1,10));

    }

    @And("User enters specific last name {string}")
    public void userEntersSpecificLastName(String lastName) {
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/input[2]"))
                .sendKeys(lastName + generateRandomNumber(1,1000));
    }

    @And("User enters specific email id {string}")
    public void userEntersSpecificEmailId(String email) {
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/input[3]")).
                sendKeys(email);

    }

    @And("User enters specific comment {string}")
    public void userEntersSpecificComment(String comment) {
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/textarea")).sendKeys(comment);

    }
}
