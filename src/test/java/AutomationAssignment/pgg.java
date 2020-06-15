package AutomationAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pgg {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver wd = new ChromeDriver();
        wd.get ("http://automationpractice.com/index.php?");
    }
}
