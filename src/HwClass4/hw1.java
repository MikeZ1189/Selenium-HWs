package HwClass4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
HW1:
goto http://practice.syntaxtechs.net/basic-checkbox-demo.php
check if the check box    "click on this check box" is Selected
if no  Select the check box
check gain if the checkbox is Selected or not
 */
public class hw1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();

        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");
        WebElement checkBox = driver.findElement(By.cssSelector("input[id='isAgeSelected']"));
        boolean selected = checkBox.isSelected();
        System.out.println("Is box selected? " + selected);
        if (!selected) {
            checkBox.click();
        }
        selected = checkBox.isSelected();
        System.out.println("Is box selected now?  " + selected);

        Thread.sleep(3000);
        driver.quit();
    }
}
