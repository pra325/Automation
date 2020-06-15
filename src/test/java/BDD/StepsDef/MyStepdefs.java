package BDD.StepsDef;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyStepdefs {
    WebDriver wd;
    @Given("^user is in gmail login page$")
    public void userIsInGmailLoginPage() {
        System.setProperty("WebDriver.Chrome.driver","ChromeDriver");
        wd = new ChromeDriver();;
        wd.get("https://www.gmail.com");
        wd.manage().window().maximize();
    }

    @When("^Enters valid user in User Field$")
    public void entersValidUserInUserField() {
        WebElement email = wd.findElement(By.xpath("//*[@id=\"identifierId\"]"));
        email.sendKeys("qatesting00567@gmail.com");
    }

    @And("^Click next button$")
    public void clickNextButton() throws InterruptedException {
        WebElement nextButtonElement = wd.findElement(By.xpath("//*[@id='identifierNext']"));
        nextButtonElement.click();
        Thread.sleep(5000);
    }

    @And("^Enters in-valid password in password field$")
    public void entersInValidPasswordInPasswordField() {
        WebElement txtPwd = wd.findElement(By.name("password"));
        txtPwd.sendKeys("Test@12");
    }

    @And("^Click on next button to login$")
    public void clickOnNextButtonToLogin() {
        WebElement btnNext= wd.findElement(By.id("passwordNext"));
        btnNext.click();
    }

    @Then("^Verify the error message on login page$")
    public void verifyTheErrorMessageOnLoginPage() throws InterruptedException {

        String expErrorMsg= "Wrong password.Try again or click Forgot password to reset it.";
        WebElement login= wd.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[2]/div[2]/span"));
        System.out.println(login.getText());
        Assert.assertEquals(login.getText(),expErrorMsg);
        Thread.sleep(5000);
        wd.quit();

    }
}
