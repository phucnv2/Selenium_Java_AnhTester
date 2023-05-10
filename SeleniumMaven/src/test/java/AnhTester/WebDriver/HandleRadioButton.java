package AnhTester.WebDriver;

import AnhTester.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandleRadioButton extends BaseTest {
  public static void main(String[] args) {
    createDriver();

    driver.get("http://demo.seleniumeasy.com/basic-radiobutton-demo.html");
    WebElement radioButton = driver.findElement(By.xpath("//div[normalize-space()='Radio Button Demo']/following-sibling::div//label[normalize-space()='Male']//input[@name='optradio']"));
    System.out.println(radioButton.isSelected());
    sleep(1);
    if (radioButton.isSelected() == false) {
      sleep(1);
      radioButton.click();
    }
    System.out.println(radioButton.isSelected());
    closeDriver();
  }
}
