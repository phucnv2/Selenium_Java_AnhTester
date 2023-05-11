package AnhTester.WebDriver;

import AnhTester.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HandleDropdown extends BaseTest {
  public static void main(String[] args) {
    createDriver();
    driver.get("https://techydevs.com/demos/themes/html/listhub-demo/listhub/index.html");
    sleep(4);
    driver.findElement(By.xpath("//span[normalize-space()='Select a Category']")).click();
    sleep(1);
    driver.findElement(By.xpath("//div[@class='chosen-container chosen-container-single chosen-with-drop chosen-container-active']//input[@type='text']")).sendKeys("Hotels");
    sleep(1);
    driver.findElement(By.xpath("//li[@class='active-result highlighted']")).click();
//    driver.findElement(By.xpath("//button[normalize-space()='Search Now']")).click();
    driver.findElement(By.xpath("//button[normalize-space()='Search Now']")).sendKeys(Keys.ENTER);

    Actions action = new Actions(driver);
    action.sendKeys(Keys.ENTER).perform();
    closeDriver();
  }
}
