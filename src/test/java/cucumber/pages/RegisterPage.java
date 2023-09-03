package cucumber.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;

import static cucumber.stepdef.Hooks.driver;

public class RegisterPage {
    public static WebElement Femalgenger(){
        return driver.findElement(By.id("gender-female"));
    }
    public static WebElement Firstname(){
        return driver.findElement(By.id("FirstName"));

}
    public static WebElement lastname(){
        return driver.findElement(By.id("LastName"));
}
    public static WebElement Dayselect() {
        return driver.findElement(By.name("DateOfBirthDay"));

    }
    public static WebElement monthselect() {
        return driver.findElement(By.name("DateOfBirthMonth"));

    }
    public static WebElement Yearselect() {
        return driver.findElement(By.name("DateOfBirthYear"));

    }
    //return the email
    public static WebElement Emailfield() {
        return driver.findElement(By.id("Email"));

    }
    public static WebElement CompanyName() {
        return driver.findElement(By.name("Company"));

    }
    public static WebElement Newsletter() {
        return driver.findElement(By.name("Newsletter"));

    }
    public static WebElement PasswordField() {
        return driver.findElement(By.id("Password"));

    }
    public static WebElement ConfirmPassword() {
        return driver.findElement(By.id("ConfirmPassword"));

    }
    public static WebElement Registerbtn() {
        return driver.findElement(By.id("register-button"));}


    }
