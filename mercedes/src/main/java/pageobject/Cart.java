package main.java.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import main.java.utils.Config;


public class Cart extends Config {

	@FindBy(id = "dcp-login-guest-user-email")
	
	private WebElement emailGuess;
	
	@FindBy(css = ".dcp-order-process-login-panel__cta:nth-child(2)")
	
	private WebElement loginGuess;
	
	@FindBy(css = ".dcp-co-func-footer__cta-primary")
	
	private WebElement continueToAddressAndDelivery;

	@FindBy(css = ".ng-scope:nth-child(2) > .dcp-form-radio-group__label")
	
	private WebElement salutationMrRadioButton;

	@FindBy(id = "co_payment_address-firstName")
	
	private WebElement firstName;

	@FindBy(id = "co_payment_address-lastName")
	
	private WebElement lastName;

	@FindBy(id = "co_payment_address-line1")
	
	private WebElement street;

	@FindBy(id = "co_payment_address-line2")
	
	private WebElement number;

	@FindBy(id = "co_payment_address-postalCode")
	
	private WebElement postalCode;

	@FindBy(id = "co_payment_address-town")
	
	private WebElement cityOrTown;

	@FindBy(id = "co_payment_address-dateOfBirth")
	
	private WebElement dateOfBirth;

	@FindBy(css = ".wb-e-inp-1__label:nth-child(2) > .wb-e-inp-1__input")
	
	private WebElement birthdayMonth;

	@FindBy(css = ".dcp-form-date-group__year")
	
	private WebElement birthdayYear;

	@FindBy(css = ".dropdown-toggle")
	
	private WebElement selectBox;

	@FindBy(css = ".ng-scope:nth-child(25) > .ng-binding")
	
	private WebElement selectPortugal;

	@FindBy(id = "co_payment_address-phone")
	
	private WebElement phoneField;

	@FindBy(id = "co_payment_address-email")
	
	private WebElement emailField;

	
	//DELIVERY DATA
	
	@FindBy(css = "wb-e-radio-1__wrapper:nth-child(2) > .wb-e-radio-1__label")
	
	private WebElement deliveryChoice;
	
	@FindBy(css = ".dcp-co-delivery-address-edit__form .ng-scope:nth-child(2) > .dcp-form-radio-group__label")
	
	private WebElement salutationMrRadioButtonDelivery;

	@FindBy(id = "co_delivery_address-firstName")
	
	private WebElement firstNameDelivery;

	@FindBy(id = "co_delivery_address-lastName")
	
	private WebElement lastNameDelivery;

	@FindBy(id = "co_delivery_address-line1")
	
	private WebElement streetDelivery;

	@FindBy(id = "co_delivery_address-line2")
	
	private WebElement numberDelivery;

	@FindBy(id = "co_delivery_address-postalCode")
	
	private WebElement postalCodeDelivery;

	@FindBy(id = "co_delivery_address-town")
	
	private WebElement cityOrTownDelivery;

	@FindBy(css = ".dcp-co-delivery-address-edit__form .dcp-sr3")
	
	private WebElement selectBoxDelivery;

	@FindBy(css = ".open .ng-scope:nth-child(2) > .ng-binding")
	
	private WebElement selectGermanyDelivery;

	@FindBy(css = ".dcp-co-func-footer__cta-primary")
	
	private WebElement continueToPayment;

	public Cart(WebDriver driver) {

		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 15, 50);

	}

	public void continueToAddressAndDelivery() {

		continueToAddressAndDelivery.click();
	}
	

	public void salutationMrRadioButton() {

		salutationMrRadioButton.click();
	}

	public void submitLogin() throws InterruptedException {
		
		Thread.sleep(2000);
		loginGuess.click();
	}
	
	public void setEmailGuess(String emailguess) {

		emailGuess.sendKeys(emailguess);
	}
	
	public void setFirstName(String firstname) {

		firstName.sendKeys(firstname);
	}

	public void setLastName(String lastname) {

		lastName.sendKeys(lastname);
	}

	public void setStreet(String streetname) {

		street.sendKeys(streetname);
	}

	public void setNumber(String housenumber) {

		number.sendKeys(housenumber);
	}

	public void setPostalcode(String zipcode) {

		postalCode.sendKeys(zipcode);
	}

	public void setCityOrTown(String cityTown) {

		cityOrTown.sendKeys(cityTown);
	}

	public void setDateOfBirth(String date) {

		dateOfBirth.sendKeys(date);
	}

	public void setMonthOfBirth(String month) {

		birthdayMonth.sendKeys(month);
	}

	public void setYearOfBirth(String year) {

		birthdayYear.sendKeys(year);
	}
	
	public void selectCountryBox() {

		selectBox.click();
	}

	public void selectCountry() {

		selectPortugal.click();
	}

	public void setPhone(String phone) {

		phoneField.sendKeys(phone);
	}

	//DELIVERY FUNCTIONS
	
	public void salutationMrRadioButton2() throws InterruptedException {

		Thread.sleep(2000);
		salutationMrRadioButtonDelivery.click();
	}

	public void setFirstNameDelivery(String firstnamedelivery) {

		firstNameDelivery.sendKeys(firstnamedelivery);
	}

	public void setLastNameDelivery(String lastnamedelivery) {

		lastNameDelivery.sendKeys(lastnamedelivery);
	}

	public void setStreetDelivery(String streetnamedelivery) {

		streetDelivery.sendKeys(streetnamedelivery);
	}

	public void setNumberDelivery(String housenumberdelivery) {

		numberDelivery.sendKeys(housenumberdelivery);
	}

	public void setPostalcodeDelivery(String zipcodedelivery) {

		postalCodeDelivery.sendKeys(zipcodedelivery);
	}

	public void setCityOrTownDelivery(String cityTowndelivery) {

		cityOrTownDelivery.sendKeys(cityTowndelivery);
	}
	
	public void selectCountryBoxDelivery() {

		selectBoxDelivery.click();
	}

	public void selectCountryDelivery() {

		selectGermanyDelivery.click();
	}

	public void continueToPayment() throws InterruptedException {
		Thread.sleep(2000);
		continueToPayment.click();
	}
	
}
