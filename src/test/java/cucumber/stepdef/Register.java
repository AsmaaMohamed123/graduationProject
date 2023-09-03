package cucumber.stepdef;

import com.github.javafaker.Faker;
import cucumber.pages.HomePage;
import cucumber.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import static cucumber.stepdef.Hooks.driver;

public class Register {
    Faker faker = new Faker();

    @Given("The user clicks on Register")
    public void NavigattoRegister() {
        HomePage.Registernowbtn().click();
    }

    @When("user selects gender")
    public void userSelectsGender() {
        RegisterPage.Femalgenger().click();
    }

    @And("user enter first and last name and select date of birth")
    public void userEnterFirstAndLastNameAndSelectDateOfBirth() {
        RegisterPage.Firstname().sendKeys(faker.name().firstName());
        RegisterPage.lastname().sendKeys(faker.name().lastName());


        Select selectDay = new Select(RegisterPage.Dayselect());
        Select selectMonth = new Select(RegisterPage.monthselect());
        Select selectYear = new Select(RegisterPage.Yearselect());

//
//
//
        selectDay.selectByIndex(2);
        selectMonth.selectByValue("2");
        selectYear.selectByValue("2021");


    }

    @And("user enter {string}")
    public void userEnter(String arg0) {
        RegisterPage.Emailfield().sendKeys(arg0);
    }

    @And("User enters company name")
    public void userEntersCompanyName() {
        RegisterPage.CompanyName().sendKeys(faker.company().name());
    }

    @And("Newsletter is selected")
    public void newsletterIsselected() {
        RegisterPage.Newsletter().click();
    }

    //    @And("User enter passwords and confirms it")
//    public void userEnterPasswordsAndConfirmsIt() {
//    String temp=faker.internet().password();
//    RegisterPage.PasswordField().sendKeys(faker.internet().password());
//    RegisterPage.ConfirmPassword().sendKeys(temp);
//    }
    @And("User enter passwords and confirms it")
    public void userEnterPasswordsAndConfirmsIt() {

        String tempPassword = faker.internet().password();
        RegisterPage.PasswordField().sendKeys(tempPassword);
        RegisterPage.ConfirmPassword().sendKeys(tempPassword);
    }


    @And("user click the register button")
    public void userClickTheRegisterButton() {
    RegisterPage.Registerbtn().click();
    }

    @Then("New account is created")
    public void newAccountIsCreated() {
Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/registerresult/1?returnUrl=/");
    }


}
