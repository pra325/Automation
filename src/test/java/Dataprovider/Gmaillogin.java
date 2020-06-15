package Dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;


public  class Gmaillogin  {
    WebDriver wd;
    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        wd = new ChromeDriver();
        wd.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        wd.manage().deleteAllCookies();
        wd.manage().window().maximize();
        wd.get("https://scgi.half.ebay.com/ws/eBayISAPI.dll?RegisterEnterInfo&usage=2943&ru=");
    }
        @DataProvider
   public Iterator<Object[]>getdata(){
        ArrayList<Object[]>testdata=Util.getdatafromexcel();
        return testdata.iterator();

   }



    @Test(dataProvider ="getdata")
    public void logintest(String firstname, String lastname, String address1, String address2,
                          String city, String state, String zipcode, String emailaddress){
        // enter data
        wd.findElement(By.xpath("//*[@id=\"firstname\"]"));
        wd.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys(firstname);

        wd.findElement(By.xpath("//*[@id=\"lastname\"]"));
        wd.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys(lastname);

        wd.findElement(By.xpath("//*[@id=\"address1\"]"));
        wd.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys(address1);

        wd.findElement(By.xpath("//*[@id=\"address2\"]"));
        wd.findElement(By.xpath("//*[@id=\"address2\"]")).sendKeys(address2);

        wd.findElement(By.xpath("//*[@id=\"city\"]"));
        wd.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys(city);

        Select select = new Select(wd.findElement(By.xpath("//*[@id=\"state\"]")));
        select.selectByVisibleText(state);

        wd.findElement(By.xpath("//*[@id=\"zip\"]"));
        wd.findElement(By.xpath("//*[@id=\"zip\"]")).sendKeys(zipcode);

        wd.findElement(By.xpath("//*[@id=\"email\"]"));
        wd.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(emailaddress);

        wd.findElement(By.xpath("//*[@id=\"retype_email\"]"));
        wd.findElement(By.xpath("//*[@id=\"retype_email\"]")).sendKeys(emailaddress);







    }

    @AfterMethod
    public void teardown(){
        wd.quit();
    }







}
