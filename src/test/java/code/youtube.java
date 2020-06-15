package code;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtube {

        @Test
        public void youtube()throws InterruptedException{
            //set chrome browser Driver
            System.setProperty("webdriver.crome.driver" ,"chromedriver.exe");
            //create chromeDriver instance
         WebDriver ps=new ChromeDriver();
            ps.get("https://www.youtube.com/");
            ps.manage().window().maximize();
            ps.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys("mai ramri");
            ps.findElement(By.xpath("//*[@id=\"search-icon-legacy\"]/yt-icon")).click();
            ;
            Thread.sleep(5000);
            ps.findElement(By.xpath("//*[@id=\"video-title\"]/yt-formatted-string")).click();
}
}
