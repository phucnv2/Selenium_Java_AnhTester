package AnhTester.WebDriver;

import AnhTester.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HandleMultipleCheckBox extends BaseTest {
  public static void main(String[] args) {
    createDriver();
    driver.get("http://demo.seleniumeasy.com/basic-checkbox-demo.html");
    List<WebElement> listMultipleCheckBoxes = driver.findElements(By.xpath("//div[normalize-space()='Multiple Checkbox Demo']/following-sibling::div//input[@type='checkbox']"));
    System.out.println(listMultipleCheckBoxes.size());
    for (int i = 1; i <= listMultipleCheckBoxes.size(); i++){
      sleep(1);
      driver.findElement(By.xpath("//label[normalize-space()='Option "+i+"']")).click();
    }
    for (int i = 1; i <= listMultipleCheckBoxes.size(); i++){
      sleep(1);
//      boolean isSelcted = driver.findElement(By.xpath("//label[normalize-space()='Option "+i+"']"));
      boolean isSelcted = driver.findElement(By.xpath("//label[normalize-space()='Option "+i+"']//input[@class='cb1-element']")).isSelected();
      System.out.println(isSelcted);

    }
    closeDriver();
  }
}
