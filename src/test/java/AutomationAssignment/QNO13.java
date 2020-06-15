package AutomationAssignment;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.util.Random;

public class QNO13 {
    WebDriver driver;


    @Before
    public void setup() throws Exception {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.gmail.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }

    @Test
    public void gmailHappyPathScreenshots() throws Exception {
        String email = "qatesting00567@gmail.com";
        String pass = "Test@123";
        WebElement emailElement = driver.findElement(By.name("identifier"));
        emailElement.sendKeys(email);
        Thread.sleep(2000);
    }


    @Test
    public void captureScreenshotPasswordInvalid() throws Exception {
        //Read user , password form application.properties file
        String email = "qalamsal8@gmail.com";
        String pass = "Test@12";
        WebElement elementEmail = driver.findElement(By.name("identifier"));
        elementEmail.sendKeys(email);
        WebElement btnNext = driver.findElement(By.id("identifierNext"));
        btnNext.click();
        Thread.sleep(5000);
       // WebDriverWait wait = new WebDriverWait(driver, 30);
       // WebElement txtPwd = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
       WebElement txtPwd=driver.findElement(By.name("password"));
        txtPwd.sendKeys(pass);
        WebElement btnSubmit = driver.findElement(By.id("passwordNext"));
        btnSubmit.click();
        Thread.sleep(2000);
        takeSnapShot(driver);
        Thread.sleep(3000);
    }

    public static void takeSnapShot(WebDriver wd) throws Exception {
        //Convert web driver object to TakeScreenshot
        TakesScreenshot scrShot = ((TakesScreenshot) wd);
        //Call getScreenshotAs method to create image file
        File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
        //Move image file to new destination
        Random r = new Random();
        // Generate random integers in range 0 to 999
        int rand = r.nextInt(1000);
        //create a folder Screens on your project as root folder, where all images will be saved
        String filePath = System.getProperty("user.dir") + "\\Screens";
        // File DestFile=new File(rand+"_shot.jpeg");
        File file = new File(filePath + "\\" + rand + "_shot.jpeg");
        //Copy file at destination
        FileUtils.copyFile(SrcFile, file); //creates the file.
    }

    @After
    public void end() {
        driver.quit();
    }
}