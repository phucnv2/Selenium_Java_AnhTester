package AnhTester.thuchanh;

import AnhTester.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
  public static void addButtonClient(String clientName){
    driver.findElement(By.xpath("//a[normalize-space()='Add client']")).click();
    sleep(2);
    driver.findElement(By.xpath("//input[@id='company_name']")).sendKeys(clientName);
    driver.findElement(By.xpath("//div[@id='s2id_created_by']//a")).click();
    driver.findElement(By.xpath("//div[@id='select2-drop']//input")).sendKeys("Michael Wood", Keys.ENTER);
    driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("Phúc test");
    driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Phúc test");
    driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Phúc test");
    driver.findElement(By.xpath("//input[@id='zip']")).sendKeys("Phúc test");
    driver.findElement(By.xpath("//input[@id='country']")).sendKeys("Phúc test");
    driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("0965330909");
    driver.findElement(By.xpath("//input[@id='website']")).sendKeys("phuc.com");
    driver.findElement(By.xpath("//input[@id='vat_number']")).sendKeys("Phúc test");
    driver.findElement(By.xpath("//input[@id='gst_number']")).sendKeys("Phúc test");
    driver.findElement(By.xpath("//li[@class='select2-search-field']//input")).click();
    driver.findElement(By.xpath("//li[@class='select2-search-field']//input")).sendKeys("VIP",Keys.ENTER);

    // scroll xuống dưới
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].scrollIntoView(false);",driver.findElement(By.xpath("//label[normalize-space()='Disable online payment']")));


    driver.findElement(By.xpath("//div[@id='s2id_currency']")).click();
    driver.findElement(By.xpath("//div[@id='select2-drop']//div[@class='select2-search']//input")).sendKeys("XTS",Keys.ENTER);

    driver.findElement(By.xpath("//button[@type='submit']")).click();
  }
  public static void checkClientAffterAdd(String clientNameSearch){
    sleep(2);
    driver.findElement(By.xpath("//div[@id='client-table_filter']//input")).sendKeys(clientNameSearch);
    sleep(2);
    String checkClientName = driver.findElement(By.xpath("//table[@id='client-table']//tr//td[2]")).getText();
    sleep(2);
    System.out.printf(clientNameSearch);
  }

  public static void main(String[] args) {
    createDriver();
    loginCRM();
    openClientPage();
    addButtonClient("Kuro Phuc");
    checkClientAffterAdd("Kuro Phuc");
    closeDriver();
  }
}
