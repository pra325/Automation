package AutomationAssignment;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QNO5A {
    WebDriver wd;

    @Before
    public void setup() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        wd = new ChromeDriver();
        wd.get("http://automationpractice.com/index.php?");
        wd.manage().window().maximize();
        Thread.sleep(5000);
    }

    @Test
    public void verify_newsletter() throws InterruptedException {
        wd.findElement(By.xpath("//*[@id=\"newsletter-input\"]")).sendKeys("pratiksha@gmail");
        wd.findElement(By.xpath("//*[@id=\"newsletter_block_left\"]/div/form/div/button")).click();
        String res =wd.findElement(By.xpath("//*[@id=\"columns\"]/p")).getText();
        Thread.sleep(5000);
        wd.findElement(By.xpath("//*[@id=\"newsletter-input\"]")).sendKeys("sumit@gmail.com");
        String res1=wd.findElement(By.xpath("//*[@id=\"columns\"]/p")).getText();

        String invalid ="Newsletter : Invalid email address.";
        String valid =" Newsletter : You have successfully subscribed to this newsletter.";

        if(res.equals(valid)){
            Assert.assertEquals(wd.findElement(By.xpath("//*[@id=\"columns\"]/p")).getText(),"Newsletter : You have successfully subscribed to this newsletter.");
        }
        else

            {
                Assert.assertEquals(wd.findElement(By.xpath("//*[@id=\"columns\"]/p")).getText(),"Newsletter : Invalid email address.");

        }
    }

    @After
            public void exit (){
        wd.quit();
    }

    }