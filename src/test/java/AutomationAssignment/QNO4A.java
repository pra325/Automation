package AutomationAssignment;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QNO4A {
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
    public void AccountFooterSection(){
        List<String> expfooter = new ArrayList<String>
                (Arrays.asList("My orders", "My credit slips", "My addresses", "My personal info"));
        List<WebElement> links = wd.findElements(By.xpath("//*[@id=\"footer\"]/div/section[5]/h4/a"));
        int linkCount=links.size();
        for(int i=0;i<links.size();i++)
            System.out.println(links.get(i).getText());

        for(int i=0;i<links.size();i++){
            links.get(i).click();
            wd.navigate().back();


        }
    }


    @After
    public void close() {
        wd.quit();


    }
}