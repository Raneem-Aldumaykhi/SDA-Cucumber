package stepdefinitions;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HwDay01Task03 {
    WebDriver driver;
    @Given("user goes to form url")
    public void user_goes_to_form_url() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(" https://testpages.eviltester.com/styled/validation/input-validation.html");
    }
    @When("fill the form")
    public void fill_the_form() {
        driver.findElement(By.id("firstname")).sendKeys("Raneem");
        driver.findElement(By.id("surname")).sendKeys("khalid");
        driver.findElement(By.id("age")).sendKeys("22");

    }
    @Then("click on submit")
    public void click_on_submit() {
        driver.findElement(By.xpath("/html/body/div/div[3]/form/input[4]")).click();
    }

}
