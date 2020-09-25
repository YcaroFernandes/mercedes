package purchasetest;

import org.junit.Before;
import org.junit.Test;

import pageobject.Cart;
import pageobject.CollectionHomePage;
import pageobject.Payment;
import utils.Config;

public class PurchaseFlow extends Config {

	CollectionHomePage collectionpageobject;
	Cart cartpageobject;
	Payment paymentpageobject;

	@Before
	public void setup() {
		collectionpageobject = new CollectionHomePage(driver);
		cartpageobject = new Cart(driver);
		paymentpageobject = new Payment(driver);

	}

	@Test
	public void validateInsertItemOnCart() throws Exception {
		
		collectionpageobject.clickDiscoverNow();
		collectionpageobject.selectItem();
		collectionpageobject.addOnCart();
		collectionpageobject.seeTheCart();
		
		cartpageobject.continueToAddressAndDelivery();
		cartpageobject.setEmailGuess("ycarofernandes@gmail.com");
		cartpageobject.submitLogin();
		
		cartpageobject.salutationMrRadioButton();
		cartpageobject.setFirstName("Ycaro");
		cartpageobject.setLastName("Fernandes");
		cartpageobject.setStreet("Teresa Borges");
		cartpageobject.setNumber("3");
		cartpageobject.setPostalcode("SP2 0FL");
		cartpageobject.setCityOrTown("Barreiro");
		cartpageobject.setDateOfBirth("10");
		cartpageobject.setMonthOfBirth("05");
		cartpageobject.setYearOfBirth("1989");
		cartpageobject.selectCountryBox();
		cartpageobject.selectCountry();
		cartpageobject.setPhone("+351969955095");
		
		cartpageobject.setFirstNameDelivery("Ycaro");
		cartpageobject.setLastNameDelivery("Fernandes");
		cartpageobject.salutationMrRadioButton2();
		cartpageobject.setStreetDelivery("Teresa Borges");
		cartpageobject.setNumberDelivery("3");
		cartpageobject.setPostalcodeDelivery("SP2 0FL");
		cartpageobject.setCityOrTownDelivery("Barreiro");
		cartpageobject.selectCountryBoxDelivery();
		cartpageobject.selectCountryDelivery();
		
		cartpageobject.continueToPayment();
		
		paymentpageobject.selectPayment();	
		paymentpageobject.selectPaymentModel();
		paymentpageobject.continueToVerification();
		
	}
}

