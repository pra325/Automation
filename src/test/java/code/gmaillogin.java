package code;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmaillogin {
    WebDriver wd;

    @Before
    public void Setup()throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        wd = new ChromeDriver();
        wd.get("https://www.gmail.com");
        wd.manage().window().maximize();
        Thread.sleep(5000);
    }

    @Test
    public void login() throws InterruptedException {


        //locate elemement
        //webelement emailelement=wd.findelement(by.id("identifier"));
        WebElement emailelement = wd.findElement(By.name("identifier"));
        emailelement.sendKeys("qatesting00567@gmail.com");
        WebElement nextButtonElement = wd.findElement(By.xpath("//*[@id=\"identifierNext\"]/span"));
        nextButtonElement.click();
        Thread.sleep(5000);
        //password
        WebElement txtpwd = wd.findElement(By.name("password"));
        txtpwd.sendKeys("Test@123");
        WebElement btNext = wd.findElement(By.id("passwordNext"));
        btNext.click();
        Thread.sleep(5000);
    }


    @After
    public void end() {
        wd.quit();
    }
}