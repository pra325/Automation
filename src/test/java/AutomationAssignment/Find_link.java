package AutomationAssignment;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.util.Strings;

import java.util.List;

public class Find_link {
    WebDriver wd;
    @Before
    public void setup() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        wd = new ChromeDriver();
        wd.get ("https://www.google.com/");
        wd.manage().window().maximize();
        Thread.sleep(5000);
    }

    @Test
    public void verifylink() throws InterruptedException {
        wd.findElement(By.cssSelector(".gLFyf.gsfi")).sendKeys("panda", Keys.ENTER);
        Thread.sleep(5000);
        List<WebElement> links = wd.findElements(By.cssSelector(".LC20lb.DKV0Md"));

        for (WebElement w : links) {
            //System.out.println(w.getText()+"\n");
            if (w.getText().contains("|")) {  //filtersout and adds to arraylist
                String[] s = w.getText().split("\\|"); //ref to | , array create
                System.out.println(s[1]);
            } }

    }
        @After
    public void Exit() {
        wd.quit();

    }
}

