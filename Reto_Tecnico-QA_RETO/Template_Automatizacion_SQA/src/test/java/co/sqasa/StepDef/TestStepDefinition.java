package co.sqasa.StepDef;


import co.sqasa.pageobject.PageObject;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestStepDefinition {
    @Given("^Client wants two articles$")
    public void client_wants_two_articles_account(){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        PageObject signUpPageObject = new PageObject(driver);
        signUpPageObject.go("https://demo.automationtesting.in/Register.html");
        signUpPageObject.ClickProducto();
        signUpPageObject.ClickCarrito();
        signUpPageObject.ClickProductoDos();
        signUpPageObject.ClickCarritoDos();
        driver.quit();



    }

    @When("^Add to the shopping cart$")
    public void add_to_the_shopping_cart() {
    }
    @Then("^Client should be told that the buys was succesfully$")
    public void client_should_be_told_that_the_buys_was_succesfully(){
    }

}
