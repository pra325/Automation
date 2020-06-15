package AutomationAssignment;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class QNO6A_B {

        WebDriver wd;
        @Before
        public void setup() {
            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
            wd = new ChromeDriver();
            wd.get("http://automationpractice.com/index.php");
            wd.manage().window().maximize();
        }
        @Test
        public void Scroll() throws InterruptedException {
            WebDriver wd = new ChromeDriver();
            wd.get("http://automationpractice.com/index.php");
            wd.manage().window().maximize();
            Thread.sleep(5000);
            WebElement women = wd.findElement(By.linkText("Women"));
            women.click();
            Thread.sleep(5000);
            WebElement slider = wd.findElement(By.xpath("//*[@id=\"layered_price_slider\"]/a[1]"));


            Actions action = new Actions(wd);
            action.click(slider).build().perform();
            Thread.sleep(1000);
            for (int i = 0; i<100; i++)
            {
                action.sendKeys(Keys.ARROW_RIGHT).build().perform();
                Thread.sleep(1000);
            }

            Assert.assertEquals(wd.findElement(By.id("layered_price_range")).getText(),"$53.00 - $53.00");
        }
        @After
        public void end() {
            wd.quit();

        }
    }

