package AnhTester.KhoiDongWeb;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginCMS {
  public static void main(String[] args) throws InterruptedException {

    // khoi tao browser
    WebDriver driver;
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    // Login
    driver.get("https://crm.anhtester.com/admin/authentication");

    // Bắt web element

    WebElement inputEmail = driver.findElement(By.xpath("//input[@id='email']"));
    inputEmail.sendKeys("admin@example.com");

    WebElement inputPassword = driver.findElement(By.xpath("//input[@id='password']"));
    inputPassword.sendKeys("123456");

    WebElement btnLogin = driver.findElement(By.xpath("//button[@type='submit']"));
    btnLogin.click();

    //Click button
    Thread.sleep(3000);
    // close browser
    driver.quit();
  }
}
