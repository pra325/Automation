package AutomationAssignment;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QNO5A_B {

    WebDriver wd;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        wd = new ChromeDriver();
        wd.get("http://automationpractice.com/index.php");
        wd.manage().window().maximize();
    }

    @Test
    public void News() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver wd = new ChromeDriver();
        wd.get("http://automationpractice.com/index.php?fbclid=IwAR0vcuQuMuo9sfvZ1ZCU9a7EWLsP7hwaUtkyLzwizZHWuSMZhuGP7UOjhEw");
        wd.manage().window().maximize();
        Thread.sleep(2000);


        String invalidEmail = "QALAMSAL8.COM";
        String validEmail = "qalamsal8@gmail.com";
        wd.findElement(By.cssSelector(".newsletter-input")).sendKeys(invalidEmail);
        wd.findElement(By.name("submitNewsletter")).click();
        //verify  error message
        Assert.assertEquals(wd.findElement(By.cssSelector(".alert.alert-danger")).getText(), "Newsletter : Invalid email address.");
        Thread.sleep(4000);
        //input Valid email and verify the result
        wd.findElement(By.cssSelector(".newsletter-input")).sendKeys(validEmail);
        wd.findElement(By.name("submitNewsletter")).click();
        //verify  error message
        boolean alreadyRegistered = true;
        if (alreadyRegistered == false) {
            Assert.assertEquals(wd.findElement(By.cssSelector(".alert.alert-sucess")).getText(), "Newsletter : You have successfully subscribed to this newsletter.");
        } else {
            Assert.assertEquals(wd.findElement(By.cssSelector(".alert.alert-danger")).getText(), "Newsletter : This email address is already registered.");
        }
    }

    @After
    public void end() {
        wd.quit();

    }
}
