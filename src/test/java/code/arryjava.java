package code;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arryjava {
    WebDriver wd;

    @Before
    public void setup() {
        System.setProperty("webdriver.crome.driver","chromedriver.exe");
        WebDriver wd = new ChromeDriver();
        wd.get("https://www.w3schools.com/html/html_tables.asp");
        wd.manage().window().maximize();
    }

    @Test
    public void readRows() {
        List<String> expectedCountries = new ArrayList<String>

        (Arrays.asList("Germany","Mexcio","Austria","UK","Canada", "Italy"));
        List<WebElement> rows = wd.findElements(By.xpath("//*[@id='customer']/tbody/tr"));
        List<String> countries=new ArrayList<>();
       int noRows=rows.size();
        for (int i=2; i<=noRows;i++)
        {
            WebElement name = wd.findElement(By.xpath("//*[@id='customer'] tbody/tr[" + i + "]/td[3]"));
            countries.add(name.getText());
        }
            Assert.assertEquals(countries,expectedCountries);
    }
   @After
    public void exit()
    {
        wd.quit();

    }
}


