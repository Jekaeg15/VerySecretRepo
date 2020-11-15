package page;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.lang.reflect.AccessibleObject;

public class TaskOne extends BasePage{
    public TaskOne(WebDriver driver) {
        super(driver);
    }

    public void checkPageIsCorrect(){
        isElementDisplyed(By.xpath("//li[text()='Zadanie 1']"));
    }
    public void scrollToElement(String element){
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,250)","");

    }
}
