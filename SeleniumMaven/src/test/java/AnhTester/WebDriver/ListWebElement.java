package AnhTester.WebDriver;

import AnhTester.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;

import java.util.List;

public class ListWebElement extends BaseTest {
  public static void main(String[] args) throws InterruptedException {
    createDriver();

    driver.get("https://crm.anhtester.com/admin/authentication");

    // Bắt web element

    WebElement inputEmail = driver.findElement(By.xpath("//input[@id='email']"));
    inputEmail.sendKeys("admin@example.com");

    WebElement inputPassword = driver.findElement(By.xpath("//input[@id='password']"));
    inputPassword.sendKeys("123456");

    WebElement btnLogin = driver.findElement(By.xpath("//button[@type='submit']"));
    btnLogin.click();
    List<WebElement> list = driver.findElements(By.xpath("//ul[@id='side-menu']//li"));
    sleep(2);
    list.get(3).click();
    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i).getText());
    }
//    Get the title of the page
    String title = driver.getTitle();
//    Get the current URL
    String url = driver.getCurrentUrl();
//    Get the current page HTML source
    String html = driver.getPageSource();
    driver.get("https://anhtester.com");

    driver.switchTo().newWindow(WindowType.TAB);

    driver.get("https://google.com");
    driver.get("https://anhtester.com");

    driver.switchTo().newWindow(WindowType.WINDOW);

    driver.get("https://google.com");
    closeDriver();
  }
}
