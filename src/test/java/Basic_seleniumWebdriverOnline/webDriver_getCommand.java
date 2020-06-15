package Basic_seleniumWebdriverOnline;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webDriver_getCommand {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver wd = new ChromeDriver();
        wd.get("http://newtours.demoaut.com");// opens url
        wd.manage().window().maximize();
        System.out.println(wd.getTitle());//returns the title of the page
        System.out.println(wd.getCurrentUrl()); // returns the url of the page
       String text =  wd.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[1]/td/font/b"))
                .getText();
        System.out.println(text);
        wd.close(); // close current window
        //wd.quit();// close multiple window






    }

}
