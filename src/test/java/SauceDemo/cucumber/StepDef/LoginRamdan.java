package SauceDemo.cucumber.StepDef;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginRamdan {
    WebDriver driver;
    String baseUrl = "https://saucedemo.com/";

    @Given("I am on the Saucedemo login page")
    public void i_am_on_the_saucedemo_login_page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        //WebDriver.Timeouts implicitlyWait = driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    @When("I input username")
    public void i_input_username() {
        driver.findElement(By.name("user-name")).sendKeys("standard_user");
    }

    @And("I input password")
    public void i_input_password() {
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
    }

    @And("Click login button")
    public void click_login_button() {

        driver.findElement(By.name("login-button")).click();
    }

    @Then("I in on homepage saucedemo")
    public void i_in_on_homepage_saucedemo() {
        driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).isDisplayed();
    }

    @And("I add a product to the cart")
    public void i_add_a_product_to_the_cart() {
        driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
    }

    @And("I Click to chart")
    public void i_click_to_chart() {
        driver.findElement(By.cssSelector("#shopping_cart_container a.shopping_cart_link")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
    }

    @And("I input Invalid password")
    public void i_input_invalid_password() {
        driver.findElement(By.name("password")).sendKeys("secret_lada");
    }

    @Then("I get an error massage {string}")
    public void i_get_an_error_massage(String errorMessage) throws AssertionError {
        WebElement errorElement = driver.findElement(By.cssSelector(".error-message-container.error"));
        if (!errorElement.getText().contains(errorMessage)) {
            throw new AssertionError();
        }
        driver.close();
        driver.quit();
    }

    @Then("I Click checkout button")
    public void i_click_checkout_button() {
        driver.findElement(By.cssSelector(".checkout_button")).click();
    }

    @When("I insert firstname")
    public void i_insert_firstname() {
        WebElement firstnameInput = driver.findElement(By.id("first-name")); // Adjust the locator based on your HTML structure
        firstnameInput.sendKeys("John"); // Replace "John" with the firstname you want to input
    }

    @And("I insert lastname")
    public void i_insert_lastname() {
        WebElement lastNameInput = driver.findElement(By.id("last-name")); // Adjust the locator based on your HTML structure
        lastNameInput.sendKeys("Doe"); // Replace "Doe" with the last name you want to input
    }

    @And("I insert Postalcode")
    public void i_insert_postalcode() {
        WebElement postalCodeInput = driver.findElement(By.id("postal-code")); // Adjust the locator based on your HTML structure
        postalCodeInput.sendKeys("12345"); // Replace "12345" with the postal code you want to input
    }

    @Then("I Click continue button")
    public void i_click_continue_button() {
        driver.findElement(By.id("continue")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
    }

    @And("I directed to overview page")
    public void i_directed_to_overview_page() {
    }

    @Then("I Click continue finish")
    public void i_click_continue_finish() {
        driver.findElement(By.name("finish")).click();
    }

    @And("I directed to back to homepage")
    public void i_directed_to_back_to_homepage() {
        driver.findElement(By.name("back-to-products")).click();
        driver.close();
        driver.quit();
    }

}
