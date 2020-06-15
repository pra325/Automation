package AutomationAssignment;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QNO3A {
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
    public void verifycart() throws InterruptedException {
        wd.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a")).click();
        String expmsg="Your shopping cart is empty.";
      String actmsg=wd.findElement(By.xpath("//*[@id=\"center_column\"]/p")).getText();

        Assert.assertEquals(expmsg,actmsg);
        Thread.sleep(5000);
    }

    @After
    public void close(){
        wd.quit();

    }
}

