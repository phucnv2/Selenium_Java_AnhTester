package AnhTester.ThucHanh;

import AnhTester.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class ClientCRM extends BaseTest {
  public static void loginCRM() {
    driver.get("https://rise.fairsketch.com/");
    WebElement inputEmail = driver.findElement(By.xpath("//input[@id='email']"));
    inputEmail.clear();
    inputEmail.click();
    inputEmail.sendKeys("admin@demo.com");
    WebElement inputPassword = driver.findElement(By.xpath("//input[@id='password']"));
    inputPassword.clear();
    inputPassword.click();
    inputPassword.sendKeys("riseDemo");
    sleep(2);
    driver.findElement(By.xpath("//button[@type='submit']")).click();
  }
  public static void openClientPage() {
    driver.findElement(By.xpath("//span[normalize-space()='Clients']")).click();
    sleep(1);
    driver.findElement(By.xpath("//a[contains(text(),'Clients')]")).click();
  }
  public static void addButtonClient(){
    driver.findElement(By.xpath("//a[normalize-space()='Add client']")).click();
    sleep(2);
    driver.findElement(By.xpath("//input[@id='company_name']")).sendKeys("Chunn_order");
    driver.findElement(By.xpath("//div[@id='s2id_created_by']//a")).click();
    driver.findElement(By.xpath("//div[@id='select2-drop']//input")).sendKeys("Michael Wood", Keys.ENTER);


  }

  public static void main(String[] args) {
    createDriver();
    loginCRM();
    openClientPage();
    addButtonClient();
    closeDriver();
  }
}
