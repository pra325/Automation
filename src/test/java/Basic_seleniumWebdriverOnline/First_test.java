package Basic_seleniumWebdriverOnline;

/* test cases
----------------
open a browser
open url(http://newtours.demoaut.com)
enter user name
enter password
click on ok
check the page tietle
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class First_test {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        // ChromeDriver driver = new ChromeDriver(); // either this one or next one down here
        WebDriver driver1 = new ChromeDriver(); // web driver is a interface here and chromedriver is a class name
        driver1.get("http://newtours.demoaut.com");
        // driver1.findElement(By.name("userName")).sendKeys("mercury");
        //or
        WebElement username = driver1.findElement(By.name("userName"));
        username.sendKeys("mercury");
        driver1.findElement(By.name("password")).sendKeys("mercury");
        driver1.findElement(By.name("login")).click();
        String exptitle = "Find a Flight: Mercury Tours:";
        String Acttitle = driver1.getTitle(); // returns the title  of the page

        // validation

        if (exptitle.equals(Acttitle)) {
            System.out.println("test is passed");
        }
        else
            {
            System.out.println("test is failed");
        }

        driver1.close();
    }
}


