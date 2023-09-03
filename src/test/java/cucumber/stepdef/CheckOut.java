package cucumber.stepdef;

import com.github.javafaker.Faker;
import cucumber.pages.CheckOutPage;
import cucumber.pages.HomePage;
import cucumber.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static cucumber.stepdef.Hooks.driver;

public class CheckOut {
    Faker faker=new Faker();

    @Given("the user select product and click on add to cart")
    public void navigatetoorder(){
        HomePage.clicktheproduct().click();
        CheckOutPage.addtocart().click();
    }


    @And("The guest user navigate to the shopping cart")
    public void theGuestUserNavigateToTheShoppingCart() {
        CheckOutPage.shoppingcart().click();
    }

    @And("The guest user agrees to the terms and conditions and click on the Check out button")
    public void theGuestUserAgreesToTheTermsAndConditionsAndClickOnTheCheckOutButton() {
        CheckOutPage.Termsofservice().click();
        CheckOutPage.checkoutbtn().click();
        CheckOutPage.chekoutasguest().click();
    }

    @And("user  enter First and Last name, Email, Company")
    public void userEnterFirstAndLastNameEmailCompany() {
        CheckOutPage.enterfirstname().sendKeys(faker.name().firstName());
        CheckOutPage.enterlastname().sendKeys(faker.name().lastName());
        CheckOutPage.enteremail().sendKeys("asm@gmail.com");
        CheckOutPage.entercompanyname().sendKeys(faker.company().name());
    }

    @And("The guest user select the country and state")
    public void theGuestUserSelectTheCountryAndState() {
        Select selectcountry = new Select(CheckOutPage.countryselect());
        selectcountry.selectByIndex(2);

    }

    @And("The guest user add city and address details")
    public void theGuestUserAddCityAndAddressDetails() {
        CheckOutPage.enrercity().sendKeys(faker.address().cityName());
        CheckOutPage.enrerAddress1().sendKeys(faker.address().fullAddress());
    }

    @And("The user adds Phone number and Fax and zip code")
    public void theUserAddsPhoneNumberAndFax() {
        CheckOutPage.EnrerPhoneNumber().sendKeys(faker.phoneNumber().cellPhone());
        CheckOutPage.enrerzipcode().sendKeys(faker.address().countryCode());
    }

    @And("The user clicks on Continue")
    public void theUserClicksOnContinue() {
        CheckOutPage.ClickOnCountinue().click();
    }

    @And("The user selects the shipping method and clicks on Continue")
    public void theUserSelectsTheShippingMethodAndClicksOnContinue() {
       // CheckOutPage.ClickOnshippingmethod().click();
        CheckOutPage.ClickOnshippingmethodcontinue().click();
    }

    @And("The user selects the payment method and clicks on Continue")
    public void theUserSelectsThePaymentMethodAndClicksOnContinue() {
       // CheckOutPage.ClickOnpaymentmethod().click();
        CheckOutPage.ClickOnpaymentmethodcontinue().click();


    }

    @And("The user add the payment method details")
    public void theUserAddThePaymentMethodDetails() {
       // CheckOutPage.ClickOnpaymentinformation().click();
        CheckOutPage.ClickOnpaymentinformationcontinue().click();
    }

    @And("The guest user clicks on Confirm")
    public void theGuestUserClicksOnConfirm() {
        CheckOutPage.ClickOnConfirm().click();
    }

    @Then("The order is confirmed and the user can navigate to order details")
    public void theOrderIsConfirmedAndTheUserCanNavigateToOrderDetails() {
        CheckOutPage.ClickOnorderdetail().click();
    }

    @And("The user selects the payment method USING CREDIT CARd and clicks on Continue")
    public void theUserSelectsThePaymentMethodUSINGCREDITCARdAndClicksOnContinue() {
        CheckOutPage.ClickOncridetcard().click();
        CheckOutPage.ClickOnpaymentmethodcontinue().click();

    }
    @And("The user add the payment method  using criedet card details")
    public void theUserAddThePaymentMethodUsingCriedetCardDetails() {
        Select selectmethod = new Select(CheckOutPage.selectcridetcard());
        selectmethod.selectByIndex(2);
        CheckOutPage.cardholdername().sendKeys(faker.name().fullName());
        CheckOutPage.cardnumber().sendKeys("5555555555554444");
        Select selectmonth=new Select(CheckOutPage.ExpireMonth());
        selectmonth.selectByIndex(3);

        Select selectyear=new Select(CheckOutPage.ExpireYear());
        selectyear.selectByIndex(4);

        CheckOutPage.cardcode().sendKeys("123456");


    }

    @And("The guest user clicks on Confirm{int}")
    public void theGuestUserClicksOnConfirm(int arg0) {
        CheckOutPage.ClickOnpaymentinformationcontinue2().click();
        CheckOutPage.ClickOnConfirm2().click();

    }

    @Then("The order is confirmed and the user can navigate to order{int} details")
    public void theOrderIsConfirmedAndTheUserCanNavigateToOrderDetails(int arg0) {
        CheckOutPage.ClickOnorderdetail2().click();
    }
}
