package AnhTester.WebDriver;

import AnhTester.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandleMultipleRadioButton extends BaseTest {
  public static void main(String[] args) {
    createDriver();
    driver.get("http://demo.seleniumeasy.com/basic-radiobutton-demo.html");
    WebElement radioButton = driver.findElement(By.xpath("//label[normalize-space()='0 to 5']"));
    System.out.println(radioButton.isSelected());
    sleep(1);
    if (radioButton.isSelected()==false) {
      radioButton.click();
    }
    WebElement radioButtonAfter = driver.findElement(By.xpath("//input[@value='0 - 5']"));
    System.out.println(radioButtonAfter.isSelected());
    closeDriver();
  }
}
