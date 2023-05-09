package AnhTester.common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {
  //khởi tạo brower
  public static WebDriver driver;
  public static void createDriver() {

    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }
  public static void closeDriver(){
    //Đóng brower
    sleep(2);
    driver.quit();
  }
  public static void sleep(double seconds) {
    try {
      Thread.sleep((long) (1000*seconds));
    }catch (InterruptedException e){
      throw new RuntimeException(e);
    }

  }

}
