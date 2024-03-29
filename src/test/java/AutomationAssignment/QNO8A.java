package AutomationAssignment;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QNO8A {

    WebDriver wd;
    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        wd = new ChromeDriver();
        wd.get("http://automationpractice.com/index.php");
        wd.manage().window().maximize();
    }
    @Test
    public void verifyAddToCart()
            throws InterruptedException{

        wd.findElements(By.className("product-image-container")).get(3).click();
        Thread.sleep(3000);
        wd.switchTo().frame(1);
        Thread.sleep(3000);
        //wd.switchTo().defaultContent();
        wd.findElement(By.cssSelector(".buttons_bottom_block.no-print")).click();
        Thread.sleep(3000);
        //verify the product..
        wd.findElement(By.cssSelector(".btn.btn-default.button.button-medium")).click();
        Thread.sleep(3000);
        int no=Integer.parseInt(wd.findElement(By.cssSelector(".shopping_cart .ajax_cart_quantity")).getText());
        Assert.assertEquals(1,no);
    }
    @After
    public void end(){
        wd.quit();
    }
}
