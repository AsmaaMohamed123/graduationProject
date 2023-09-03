package cucumber.stepdef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Hooks {
    public static WebDriver driver;
    @Before
    public void openBrowser(){
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
        driver.get("https://demo.nopcommerce.com/");


    }
    @After
    public void aUserCloseTheWebpage() throws InterruptedException {
        Thread.sleep(3000);

        driver.close();

}
}
