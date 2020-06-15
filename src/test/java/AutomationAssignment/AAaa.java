package AutomationAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AAaa {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get ("https://www.gmail.com");
        driver.manage().window().maximize();
        Thread.sleep(5000);

        WebElement emailelement = driver.findElement(By.name("identifier"));
        emailelement.sendKeys("parisubedi03@gmail.com");
        WebElement nextButtonElement = driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span"));
        nextButtonElement.click();
        Thread.sleep(5000);
        //password
        WebElement txtpwd = driver.findElement(By.name("password"));
        txtpwd.sendKeys("Landmother1989");
        WebElement btNext = driver.findElement(By.id("passwordNext"));
        btNext.click();

        driver.findElement(By.xpath("//*[@id=\":4l\"]/div/div")).click();
        driver.findElement(By.xpath(""));







    }
}
