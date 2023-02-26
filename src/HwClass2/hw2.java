package HwClass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
HW2
navigate to fb.com
click on create new account
fill up all the textboxes
click on sign up button
close the pop up
close the browser
 */
public class hw2 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");

        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("firstname")).sendKeys("Mike");
        driver.findElement(By.name("lastname")).sendKeys("Zur");
        driver.findElement(By.name("reg_email__")).sendKeys("abcd@efg.com");
        driver.findElement(By.id("password_step_input")).sendKeys("password");
        driver.findElement(By.id("month")).sendKeys("November");
        driver.findElement(By.id("day")).sendKeys("25");
        driver.findElement(By.id("year")).sendKeys("1989");
        driver.findElement(By.id("u_8_5_kR")).click();
        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(1000);
        driver.quit();
    }
}
