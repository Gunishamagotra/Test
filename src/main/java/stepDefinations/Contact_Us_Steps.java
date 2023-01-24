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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import java.util.logging.Logger;

public class Contact_Us_Steps {
    private WebDriver driver;

//    @Before
//    public void setUp()
//    {
//        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "/src/main/java/drivers/chromedriver");
//        ChromeOptions chromeOptions= new ChromeOptions();
//        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
//        //chromeOptions.addArguments("--headless");
//        driver= new ChromeDriver(chromeOptions);
//        driver.manage().window().maximize();
//    }
//    @After
//    public void tearDown()
//    {
//        driver.quit();
//    }
    @Given("I access the webdriver university contact us page")
    public void i_access_the_webdriver_university_contact_us_page() throws InterruptedException {
            //throws InterruptedException {
        driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
        Thread.sleep(5000);

       // driver.navigate().to("http://www.shein.com");
        //driver.wait(10000);
    }

    @When("I enter a first name")
    public void i_enter_a_first_name() {
        driver.findElement(By.name("first_name")).sendKeys("Farzi");



    }

    @And("I enter a last name")
    public void i_enter_a_last_name()  {
        driver.findElement(By.name("last_name")).sendKeys("Sv");

    }

    @And("I enter an email address")
    public void i_enter_an_email_address() {
        driver.findElement(By.name("email")).sendKeys("sv.farzi@gmail.com");

    }

    @And("I enter a comment")
    public void i_enter_a_comment() {
        driver.findElement(By.name("message")).sendKeys("Thanks");

    }

    @And("I click on the submit button")
    public void i_click_on_the_submit_button() {
      //  driver.findElement(By.className("contact_button")).click();
        driver.findElement(By.cssSelector("[value=\"SUBMIT\"]")).click();

    }

    @Then("I should be presented with a successful contact us submission message")
    public void i_should_be_presented_with_a_successful_contact_us_submission_message() throws InterruptedException {
       Thread.sleep(5000);
        String new1 = "Thank You for your Message!";
       WebElement Test = driver.findElement(By.xpath("//div[@id='contact_reply']/h1"));
       Assert.assertEquals(Test.getText(),new1);

        //*[@id="contact_reply"]/h1
        //WebElement contactUs_Submission_Message = driver.findElement(By.xpath("//div[@id='contact_reply']/h1"));
        //Assert.assertEquals(contactUs_Submission_Message.getText(), "Thank You for your Message!");
    }
}
