package AutomationAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalComanns {

    public static void main(String[] args) {
        // conditional commands
        //isDisplayed() it checks elements displed  present or not.
        //isEnabled() use it for text boxes sometimes text boxes are disabled states we can not enter values until it is eabled
        //isSlected() used for radio button or check boxes if it is seleted it reults true if not selected then false

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        WebElement email=driver.findElement(By.xpath("//*[@id=\"email\"]")); // identified the elements
        WebElement pass=driver.findElement(By.xpath("//*[@id=\"pass\"]"));
        if(email.isDisplayed()&& email.isEnabled()) {
            email.sendKeys("tamannatamanna964@gmail.com");
        }

            if(pass.isDisplayed() &&pass.isEnabled())
            {
                pass.sendKeys("hurtheart@143");
                // female
                System.out.println(driver.findElement(By.xpath("//*[@id=\"u_0_6\"]")).isSelected()); // both not selected
                //male
                System.out.println(driver.findElement(By.xpath("//*[@id=\"u_0_7\"]")).isSelected()); // not selected
// select female radio button
if(driver.findElement(By.xpath("//*[@id=\"u_0_6\"]")).isSelected()==false) // if not selected
{
    driver.findElement(By.xpath("//*[@id=\"u_0_6\"]")).click(); // selected
    driver.close();
}

        }





    }
}
