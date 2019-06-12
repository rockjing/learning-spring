package cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class Search   {

    WebDriver driver = new ChromeDriver();
    @Given("^Go to Baidu ")
    public void setp1() throws Throwable {

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://www.baidu.com/");
        assertEquals(driver.getTitle(), "百度一下，你就知道");
    }

    @When("^I find baidu logo")
    public WebElement i_find_baidu_logo() {

        WebDriverWait wait = new WebDriverWait(driver,10);
        WebElement element = wait.until(ExpectedConditions.visibilityOf
                (driver.findElement(By.xpath("//div[@id='lg']/img"))));

        return element;
    }


//    @When("^输入 \"(.*?)\"$")
//    public void setp2(String text) throws Throwable {
//
//        driver.in("//*[@id='kw']", text);
//    }
//
//    @Then("^点击搜索按钮$")
//    public void setp3() throws Throwable {
//        driver.click("//*[@id='su']");
//    }
//
//    @Then("^清除搜索框$")
//    public void setp4() throws Throwable {
//        String[] ss = {"//*[@id='kw']"};
//        driver.clearText(ss);
//    }

}
