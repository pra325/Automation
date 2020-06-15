package AutomationAssignment;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Broken_links {
    WebDriver wd;
    String urlAddress="";
    @Before
    public void Setup()throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        wd = new ChromeDriver();
        wd.get ("https://automationpractice.itsutra.com/");
        wd.manage().window().maximize();
        Thread.sleep(5000);
    }
        @Test
    public void verifycartFuncitinality(){
        List<WebElement> links=wd.findElements(By.tagName("a")); //tag name
            for (WebElement link:links) {
                urlAddress = link.getAttribute("href"); //property, href
                System.out.println(urlAddress);
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(urlAddress).openConnection(); //need to cast
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode<400) {
                        System.out.println("Working Link:: " + urlAddress);
                    }
                    else {
                        System.out.println("Broken Link:: " + urlAddress);
                    }
                } catch (MalformedURLException e) {  //for misplaced url eg:  htt://123.com, htt inplace of http or https
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


        }

        @After
    public void end() {
        wd.quit();
    }
}

