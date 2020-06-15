package code;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openbrowser {
    @Test
    public void openchromebrowser()throws InterruptedException{
        //set chrome browser Driver
        System.setProperty("webdriver.crome.driver" ,"chromedriver.exe");
        //create chromeDriver instance
        WebDriver wd =new ChromeDriver();
        //open Browser
        wd.get("http://www.gmail.com");
        //Maximize Browser
        wd.manage().window().maximize();
        //wait for 5 sec
        Thread.sleep(5000);
        //close Browser
        wd.quit();
    }

}
