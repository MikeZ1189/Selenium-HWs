package HwClass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
HW1:
navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
fill out the form
click on register
close the browser
 */
public class hw1 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();

        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");

        driver.findElement(By.id("customer.firstName")).sendKeys("Michael");
        driver.findElement(By.id("customer.lastName")).sendKeys("Zurita");
        driver.findElement(By.name("customer.address.street")).sendKeys("123 North Rosser St");
        driver.findElement(By.name("customer.address.city")).sendKeys("Alexandria");
        driver.findElement(By.id("customer.address.state")).sendKeys("VA");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("22311");
        driver.findElement(By.name("customer.phoneNumber")).sendKeys("7031234567");
        driver.findElement(By.name("customer.ssn")).sendKeys("123456789");
        driver.findElement(By.id("customer.username")).sendKeys("Mikez");
        driver.findElement(By.id("customer.password")).sendKeys("password");
        driver.findElement(By.name("repeatedPassword")).sendKeys("password");
        Thread.sleep(3000);
        driver.findElement(By.className("button")).click();
        Thread.sleep(3000);
        driver.quit();
    }
}
