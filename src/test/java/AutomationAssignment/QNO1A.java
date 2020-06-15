package AutomationAssignment;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QNO1A {
    WebDriver driver;
@Before
    public void setup() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("http://automationpractice.com/index.php?");
        driver.manage().window().maximize();
        Thread.sleep(5000);
     }
     @Test
     public void verifyTitle() throws InterruptedException {
     String actualTitle=driver.getTitle();
         //System.out.println(actualTitle);
         String expectedTitle= "My Store";
         Assert.assertEquals(expectedTitle,actualTitle);
        }

        @After
    public void end() {
        driver.quit();
    }
}




