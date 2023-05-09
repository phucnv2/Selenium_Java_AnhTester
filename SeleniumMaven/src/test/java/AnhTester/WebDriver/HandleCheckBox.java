package AnhTester.WebDriver;

import AnhTester.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandleCheckBox extends BaseTest {
  public static void main(String[] args) {
    createDriver();
    driver.get("http://demo.seleniumeasy.com/basic-checkbox-demo.html");
    WebElement checkBox = driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
    boolean checkSTTBefore = checkBox.isSelected();
    System.out.println(checkSTTBefore);
    if (checkSTTBefore == false) {
      checkBox.click();
    }
    WebElement checkDis = driver.findElement(By.xpath("//div[@id='txtAge']"));
    System.out.println(checkDis.isDisplayed());
    System.out.println(checkDis.getText());
    closeDriver();
  }
}
