package AutomationAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationComands {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://newtours.demoaut.com");
        System.out.println(driver.getTitle()); // if we need to print the title.

        driver.navigate().to("https://www.facebook.com/");
        System.out.println(driver.getTitle());
        driver.navigate().back();
        System.out.println(driver.getTitle());
        driver.navigate().forward();
        System.out.println(driver.getTitle());
        driver.navigate().refresh();
        driver.close();



    }
}
