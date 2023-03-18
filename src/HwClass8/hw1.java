package HwClass8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

/*
it is needed to be done before class on saturday
I request everyone to Attempt it as this will help u alot in working with tables and calenders.

1.goto http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login

username=Admin
password=Hum@nhrm123

2. click on PIM option
3. from the table select Any  value of id and click the check box associated with it

make sure that ur code is dynamic i.e
changing the id doesnt effect the logic or xpath
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
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        //log in to website
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Hum@nhrm123");
        driver.findElement(By.xpath("//input[@value='LOGIN']")).click();

        //click on PIM
        driver.findElement(By.xpath("//b[text()='PIM']")).click();

        //select Id
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));
        for (int i = 0; i < rows.size(); i++) {
            String id = rows.get(i).getText();
            if (id.equalsIgnoreCase("6253439")) {

        //print i and use logic to click correct checkbox
                System.out.println(i);
                WebElement cbx = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + (i + 1) + "]/td[1]/input"));
                cbx.click();
            }
        }
    }
}
