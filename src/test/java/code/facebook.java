package code;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class facebook {
    @Test
    public void facebook()throws InterruptedException{

            System.setProperty("webdriver.crome.driver","chromedriver.");
            // System.setProperty("webdriver.crome.driver" ,"chromedriver.exe");
            WebDriver wd =new ChromeDriver();
            wd.get("https://www.facebook.com/");
            wd.manage().window().maximize();
            wd.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(" tamannatamanna64@gmail.com");
            wd.findElement(By.xpath(" //*[@id=\"pass\"]")).sendKeys("Hurtheart@143");
            wd.findElement(By.xpath("//*[@id=\"u_0_4\"]")).click();
       // ChromeOptions options = new ChromeOptions();
       // options.addArguments("--disable-notifications");
    }}














