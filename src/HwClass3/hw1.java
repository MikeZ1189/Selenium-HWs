package HwClass3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
use xpath to complete this

goto http://practice.syntaxtechs.net/basic-first-form-demo.php
enter the message in the text box
click on show message
Enter value of a
Enter value of B
click on the button get total
also please print the value of the attribute type of the button GET TOTAL

 */
public class hw1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();

        driver.get("http://practice.syntaxtechs.net/basic-first-form-demo.php");
        WebElement message =driver.findElement(By.xpath("//input[contains(@id,'message')]"));
        message.sendKeys("Hello World");
        driver.findElement(By.xpath("//button[text()='Show Message']")).click();

        WebElement a = driver.findElement(By.xpath("//input[@id= 'sum1']"));
        a.sendKeys("3");
        WebElement b = driver.findElement(By.xpath("//input[@id= 'sum2']"));
        b.sendKeys("4");
        WebElement getTotal = driver.findElement(By.xpath("//button[contains(@onclick, 'return')]"));
        getTotal.click();
        WebElement valueTotal = driver.findElement(By.xpath("//span[@id='displayvalue']"));
        System.out.println("Total = "+valueTotal.getText());

        driver.quit();
    }
}
