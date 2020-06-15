package AutomationAssignment;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QNO1 {
    WebDriver wd;

    @Before
    public void Setup()throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        wd = new ChromeDriver();
        wd.get ("http://automationpractice.com/index.php?");
        wd.manage().window().maximize();
        Thread.sleep(5000);
    }

    @Test
    public void VerifyTitle() throws InterruptedException {
        String ActualTitle=wd.getTitle();
        String expectedTitle="My Store";
        Assert.assertEquals(expectedTitle, ActualTitle);
    }

    @After
    public void end() {
        wd.quit();
    }
}





