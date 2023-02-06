package stepDefinations;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pageObjects.Base_PO;
import pageObjects.Contact_Us_PO;

public class Contact_Us_Steps extends Base_PO {
   private Contact_Us_PO contact_us_po;
  public Contact_Us_Steps(Contact_Us_PO contact_us_po){
      this.contact_us_po = contact_us_po;
  }


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
        //navigateToURL("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
        //Thread.sleep(5000);
        contact_us_po.navigateToContactUsPage();

       // driver.navigate().to("http://www.shein.com");
        //driver.wait(10000);
    }

    @When("I enter a first name")
    public void i_enter_a_first_name() {
        //driver.findElement(By.name("first_name")).sendKeys("Farzi");
        contact_us_po.setFirstName();
    }

    @And("I enter a last name")
    public void i_enter_a_last_name()  {
        //driver.findElement(By.name("last_name")).sendKeys("Sv");
        contact_us_po.setLastName();
    }

    @And("I enter an email address")
    public void i_enter_an_email_address() {
        //driver.findElement(By.name("email")).sendKeys("sv.farzi@gmail.com");
        contact_us_po.setEmail();
    }

    @And("I enter a comment")
    public void i_enter_a_comment() {
        //driver.findElement(By.name("message")).sendKeys("Thanks");
        contact_us_po.setComment();
    }

    @And("I click on the submit button")
    public void i_click_on_the_submit_button() {
      //  driver.findElement(By.className("contact_button")).click();
        //driver.findElement(By.cssSelector("[value=\"SUBMIT\"]")).click();
        contact_us_po.clickSubmit();

    }

    @Then("I should be presented with a successful contact us submission message {string}")
    public void i_should_be_presented_with_a_successful_contact_us_submission_message(String message)  {
        //String new1 = "Thank You for your Message!";
       //WebElement Test = driver.findElement(By.xpath("//div[@id='contact_reply']/h1"));
       //Assert.assertEquals(Test.getText(),new1);

        contact_us_po.validateSuccesfulMessage(message);
        //*[@id="contact_reply"]/h1
        //WebElement contactUs_Submission_Message = driver.findElement(By.xpath("//div[@id='contact_reply']/h1"));
        //Assert.assertEquals(contactUs_Submission_Message.getText(), "Thank You for your Message!");
    }
}
