package Basic_seleniumWebdriverOnline;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class verify_title {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver wd = new ChromeDriver();
        wd.get("http://newtours.demoaut.com");
        wd.manage().window().maximize();
        wd.findElement(By.name("userName")).sendKeys("mercury");
        wd.findElement(By.name("password")).sendKeys("mercury");
        wd.findElement(By.name("login")).click();

        //without validation test case not complite or we don't know is it pass or fail
        // for validation beloow code presented


        // check title- test case

        String exp ="Find a Flight: Mercury Tours:";
        String act = wd.getTitle(); // returns the title of the page
        // if want print the title
        //System.out.println(act);

        if(exp.equals(act)==true) {
            System.out.println("test is passed");
        }
        else
        {
            System.out.println("test is fail");
        }
        wd.close();
    }
}
