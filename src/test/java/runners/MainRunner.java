package runners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(features = {"classpath:features"}, glue = {"stepDefinations"},
        tags = "", plugin = {"pretty" ,"html:target/cucumber", "json:target/cucumber.json"}, monochrome = true, dryRun = false)
public class MainRunner extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}

//*[@id="city"]/table/tbody/tr/td
///html/body/div[1]/div/div[6]/div[2]/table/tbody/tr/td/p[20]