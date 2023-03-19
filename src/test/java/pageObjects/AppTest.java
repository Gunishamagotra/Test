package pageObjects;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
public class AppTest {
	
	protected WebDriver driver;
	public void guru99tutorials() throws InterruptedException
	{
	System.setProperty ("webdriver.chrome.driver",System.getProperty("user.dir")+ "/src/test/java/driver/drivers/chromedriver");
	driver = new ChromeDriver(); 
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	String eTitle = "Demo Guru99 Page";
	String aTitle = "" ;
	// launch Chrome and redirect it to the Base URL
	driver.get("http://demo.guru99.com/test/guru99home/" );
	//Maximizes the browser window
	driver.manage().window().maximize() ;
	//get the actual value of the title
	aTitle = driver.getTitle();
	//compare the actual title with the expected title
	if (aTitle.equals(eTitle))
	{
	System.out.println( "Test Passed") ;
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView();", );
		if (driver.findElement(By.id("awf_field-91977689")).isDisplayed()){
			Select select = new Select(driver.findElement(By.id("awf_field-91977689")));
			select.selectByIndex(6);

			driver.findElement(By.partialLinkText("Facebook")).click();


			Thread.sleep(10000);
	}



	}
	else {
	System.out.println( "Test Failed" );
	}
	//close browser

	driver.close();
}
}