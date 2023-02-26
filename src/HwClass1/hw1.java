package HwClass1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hw1 {
    public static void main(String[] args) throws InterruptedException {
        /*
         * 1. launch the browser
         * 2. navigate to amazon website
         * 3. print out the title and the url in the console
         * 4. close the browser
         */
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");

        String title=driver.getTitle();
        System.out.println("The title of the page is "+title);

        String URL=driver.getCurrentUrl();
        System.out.println(URL);

        driver.close();
    }
}
