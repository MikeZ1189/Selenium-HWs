package HwClass7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

/*
For homework
You have to do all explicit wait examples from.the link I used in class .
For the alert example

 */
public class hw1 {
    public static void main(String[] args) {

        // first step in automation is to tell your project where the webdriver is located.
        // create an instance of webdriver
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        // max the window
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        //go to website
        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");

        //  click on the 5 second alert button
        driver.findElement(By.xpath("//button[@id='alert']")).click();
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();

        // click on the change text button
        driver.findElement(By.xpath("//button[@id='populate-text']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Selenium Webdriver']")));
        String text = driver.findElement(By.xpath(" //h2[text()='Selenium Webdriver']")).getText();
        System.out.println(text);

        //click on display button after 10 seconds
        driver.findElement(By.xpath("//button[@id='display-other-button']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='hidden']")));
        System.out.println(driver.findElement(By.xpath("//button[@id='hidden']")).isDisplayed());

        //click on enable button
        driver.findElement(By.xpath("//button[@id='enable-button']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='disable']")));

        //click on the check Checkbox button
        driver.findElement(By.xpath("//button[@id='checkbox']")).click();
        wait.until(ExpectedConditions.elementToBeSelected(By.xpath("//input[@id='ch']")));

        //close webpage
        driver.quit();
    }
}
