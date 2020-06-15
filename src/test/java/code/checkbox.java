package code;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class checkbox {
    WebDriver wd;
    @Before
    public void strat() throws InterruptedException {
        wd=new ChromeDriver();
        wd.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        wd.manage().window().maximize();
        Thread.sleep(5000);


    }
    @Test
    public void selectAllCheckBox() throws InterruptedException{
        WebElement chk1= wd.findElement(By.id("isAgeSelected"));
        chk1.click();
        String msg="Success - Check box is checked";
        String eMsg=wd.findElement(By.xpath("//*[@id=\"txtAge\"]")).getText();
        System.out.println(eMsg);
        Assert.assertEquals(msg,eMsg);
        Thread.sleep(5000);

        JavascriptExecutor js=(JavascriptExecutor)wd;
        js.executeScript("window.scrollBy(0,400)");



    }
    @Test
    public void selectallcheckbox1() throws InterruptedException{
        List<WebElement>chk=wd.findElements(By.cssSelector(".cb1-element"));
        for(WebElement c:chk ) {
            c.click();

            Thread.sleep(5000);
        }

    }

    @After
    public void end(){
        wd.quit();
    }
}


