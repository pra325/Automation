package AutomationAssignment;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QNO2A {
    WebDriver wd;
    @Before
    public void setpup() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        wd=new ChromeDriver();
        wd.get("http://automationpractice.com/index.php?");
        wd.manage().window().maximize();
        Thread.sleep(5000);
    }
    @Test
    public void verifysari() throws InterruptedException {
        wd.findElement(By.xpath("//*[@id=\"search_query_top\"]")).sendKeys("saree");
        wd.findElement(By.xpath("//*[@id=\"searchbox\"]/button")).click();
        wd.findElement(By.xpath("//*[@id=\"center_column\"]/h1/span"));
        String expected="0 results have been found.";
        String actual =wd.findElement(By.xpath("//*[@id=\"center_column\"]/h1/span")).getText();
        Assert.assertEquals(expected,actual);
        Thread.sleep(5000);
    }
    @After
    public void close(){
        wd.quit();
    }
}
