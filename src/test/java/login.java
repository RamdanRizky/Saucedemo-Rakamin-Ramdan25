import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class login {
    @Test
    public void open_browser(){
        WebDriver driver;
        String baseUrl = "https://saucedemo.com/";

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
        String title = driver.getTitle();
        System.out.println(title);

        String username_button = "Username";
        //get form
        WebElement ele1 = driver.findElement(By.name("login-button"));
        WebElement ele2 = driver.findElement(By.className("submit-button btn_action"));

        ele1.click();
        ele1.sendKeys("standard_user");
        ele1.getText();

        ele2.isDisplayed();
        ele2.click();

        driver.findElement(By.xpath("/*contains")).isDisplayed();
        driver.findElement(By.cssSelector("button")).isDisplayed();


        driver.close();

    }
}