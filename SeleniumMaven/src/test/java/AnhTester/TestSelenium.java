package AnhTester;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestSelenium {
  public static void main(String[] args) throws InterruptedException {

    // khoi tao browser
    WebDriver driver;
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    // open website
    driver.get("https://cms.anhtester.com/");

    //Click button
    Thread.sleep(3000);
    // close browser
    driver.quit();

  }
}
