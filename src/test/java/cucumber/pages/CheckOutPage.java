package cucumber.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static cucumber.stepdef.Hooks.driver;

public class CheckOutPage {
   public static WebElement  addtocart(){
        return driver.findElement(By.id("add-to-cart-button-18"));
    }
    public static WebElement shoppingcart(){
        return driver.findElement(By.className("cart-label"));
    }
    public static WebElement Termsofservice(){
        return driver.findElement(By.id("termsofservice"));
    }
    public static WebElement checkoutbtn(){
        return driver.findElement(By.id("checkout"));
    }
    public static WebElement chekoutasguest (){
        return driver.findElement(By.className("checkout-as-guest-button"));
}
    public static WebElement enterfirstname () {
        return driver.findElement(By.id("BillingNewAddress_FirstName"));
    }
    public static WebElement enterlastname () {
        return driver.findElement(By.id("BillingNewAddress_LastName"));
    }
    public static WebElement enteremail () {
        return driver.findElement(By.id("BillingNewAddress_Email"));
    }
    public static WebElement entercompanyname () {
        return driver.findElement(By.id("BillingNewAddress_Company"));
    }
    public static WebElement countryselect () {
        return driver.findElement(By.id("BillingNewAddress_CountryId"));
    }
    public static WebElement enrercity () {
        return driver.findElement(By.id("BillingNewAddress_City"));

    }
    public static WebElement enrerAddress1 () {
        return driver.findElement(By.id("BillingNewAddress_Address1"));

    }
    public static WebElement enrerzipcode () {
        return driver.findElement(By.id("BillingNewAddress_ZipPostalCode"));

    }
    public static WebElement EnrerPhoneNumber () {
        return driver.findElement(By.id("BillingNewAddress_PhoneNumber"));


    }
    public static WebElement EnrerFaxNumber () {
        return driver.findElement(By.id("BillingNewAddress_FaxNumber"));

    }
    public static WebElement ClickOnCountinue () {
        return driver.findElement(By.name("save"));

    }
    public static WebElement ClickOnshippingmethod () {
        return driver.findElement(By.linkText("Shipping method"));}
    public static WebElement ClickOnshippingmethodcontinue () {
        return driver.findElement(By.className("shipping-method-next-step-button"));

    }
    public static WebElement ClickOnpaymentmethod () {
        return driver.findElement(By.linkText("Payment method"));}

    public static WebElement ClickOnpaymentmethodcontinue () {
        return driver.findElement(By.className("payment-method-next-step-button"));


    }
    public static WebElement ClickOnpaymentinformation () {
        return driver.findElement(By.linkText("Payment information"));
    }
    public static WebElement ClickOnpaymentinformationcontinue () {
        return driver.findElement(By.className("payment-info-next-step-button"));}

    public static WebElement ClickOnConfirm() {
        return driver.findElement(By.className("confirm-order-next-step-button"));}


    public static WebElement ClickOnorderdetail () {
        return driver.findElement(By.linkText("Click here for order details."));}
    public static WebElement ClickOncridetcard () {
        return driver.findElement(By.id("paymentmethod_1"));}
    public static WebElement selectcridetcard () {
        return driver.findElement(By.id("CreditCardType"));}
    public static WebElement cardholdername() {
        return driver.findElement(By.id("CardholderName"));}
    public static WebElement cardnumber() {
        return driver.findElement(By.id("CardNumber"));}
    public static WebElement  ExpireMonth() {
        return driver.findElement(By.id("ExpireMonth"));}
    public static WebElement  ExpireYear() {
        return driver.findElement(By.id("ExpireYear"));}

    public static WebElement  cardcode() {
        return driver.findElement(By.id("CardCode"));}

    public static WebElement ClickOnpaymentinformationcontinue2 () {
        return driver.findElement(By.className("payment-info-next-step-button"));}

    public static WebElement ClickOnConfirm2() {
        return driver.findElement(By.className("confirm-order-next-step-button"));}

    public static WebElement ClickOnorderdetail2 () {
        return driver.findElement(By.linkText("Click here for order details."));}

}
