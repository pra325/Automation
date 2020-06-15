package AutomationAssignment;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class QNO6A {
    WebDriver wd;

    @Before

    public void setup() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        wd = new ChromeDriver();
        wd.get("http://automationpractice.com/index.php");
        wd.manage().window().maximize();
        Thread.sleep(5000);
    }

    @Test
    public void verifybslider() throws InterruptedException {
        wd.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a")).click();
        JavascriptExecutor js= (JavascriptExecutor) wd;
        js.executeScript("window.scrollBy(0,1500)");

        Thread.sleep(4000);
        WebElement silder= wd.findElement(By.xpath("//*[@id=\"layered_price_slider\"]/a[1]"));
        Actions act = new Actions(wd);
            act.dragAndDropBy(silder,245,0).release().build().perform();

    }

    @After
    public void Exit() {
        wd.quit();
    }



}