package HwClass4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/*
Hw2:
goto http://practice.syntaxtechs.net/basic-checkbox-demo.php
1. u need to write down the code that can select  1 check box out of 4 mentioned,
e.g option1 , option2 , option 3, option 4

Note write down the logic in dynamic way i.e one change in if else condition can change ur selection
 */
public class hw2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();

        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");

        List<WebElement> checkBoxes= driver.findElements(By.cssSelector("input[class='cb1-element']"));
        for (WebElement checkBox : checkBoxes) {
            String Box=checkBox.getAttribute("value");
            if(Box.equalsIgnoreCase("Option-3")) {
                checkBox.click();
            }
        }
        Thread.sleep(3000);
        driver.quit();
    }
}
