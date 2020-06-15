package javaScriptDemo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class javaScriptUtil {
    // creating few methods  (flsah method)
    public static void flash(WebElement element, WebDriver driver) { // passing the parameter
        // JavascriptExecutor js = ((JavascriptExecutor)driver); // driver object used as a javascriptexcuter (casting driver to jvextur)
        String bgcolor = element.getCssValue("backgroundColor"); // pass the element to bkground color captering the value of background color
        for (int i = 0; i < 200; i++) {
            changeColor("#000000", element, driver); // using the background color multipl times. change color will excute when we make method like down there
            changeColor(bgcolor, element, driver);
        }
    }

    // (changing color method)
    public static void changeColor(String color, WebElement element, WebDriver driver) { // user define method to change color and passinng element and drive
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].style.backgroundColor = ' " + color + "'", element); // js command and passing parameter

        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {

        }
    }

    public static void drawBroder(WebElement element, WebDriver driver) {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].style.border='3px solid red '", element); // color and 3px we can change
    }

        public static String getTitleByJs (WebDriver driver) {
            JavascriptExecutor js = ((JavascriptExecutor) driver);
            String title = js.executeScript("return document.title;").toString();
            return title;

    }

}

