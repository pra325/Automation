package javaScriptDemo;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class javaScriptExcuterdemo {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.twoplugs.com/");
        driver.manage().window().maximize();
        // flashing
       WebElement joinfree = driver.findElement(By.xpath("/html/body/div/header/div/ul/li[2]/a/span"));
       javaScriptUtil.flash(joinfree,driver);  // call the flash method drectly becuse it is static no need to make object
        // Drawing border and screenshot
        javaScriptUtil.drawBroder(joinfree,driver);

        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       File trg = new File("C://screenshot/twoplugs.png");
       FileUtils.copyFile(src,trg);

       // capturing title of the page
       // System.out.println(driver.getTitle());

        // using javaScriptexcuter method
        String title= javaScriptUtil.getTitleByJs(driver);
        System.out.println(title);

    }
}
