package cucumber.pages;

import jdk.dynalink.beans.StaticClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static cucumber.stepdef.Hooks.driver;

public class HomePage {
    public static WebElement Registernowbtn(){
        return driver.findElement(By.className("ico-register"));

    }
    public static WebElement clicktheproduct(){

        return driver.findElement(By.xpath("//*[contains(text(),'HTC One M8 Android L 5.0 Lollipop')]"));
}}