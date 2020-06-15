package Basic_seleniumWebdriverOnline;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_command {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver wd = new ChromeDriver();
        wd.get("http://newtours.demoaut.com"); // first go this page
        System.out.println(wd.getTitle());

        wd.navigate().to("https://www.facebook.com/"); // second go to this page
        System.out.println(wd.getTitle());

        wd.navigate().back(); // go back to first page we dont need to give it is already in buffer or first page link
        System.out.println(wd.getTitle());

        wd.navigate().forward(); // this is for forward.
        System.out.println(wd.getTitle());

        wd.navigate().refresh();
        wd.close();

    }
}
