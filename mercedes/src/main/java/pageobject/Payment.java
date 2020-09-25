package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.Config;

public class Payment extends Config {

	@FindBy(xpath = "//label[contains(.,'Credit Card')]")
	
	private WebElement selectTypeOfPayment;
	
	@FindBy(xpath = "//label[contains(.,'VISA')]")
	
	private WebElement selectPaymentModel;
	
	@FindBy(css = ".dcp-co-func-footer__cta-primary")
	
	private WebElement continueToVerification;

	
	public Payment(WebDriver driver) {

		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 15, 50);

	}

	public void selectPayment() {

		wait.until(ExpectedConditions.elementToBeClickable(selectTypeOfPayment));
		selectTypeOfPayment.click();
	}
	
	public void selectPaymentModel() {

		wait.until(ExpectedConditions.elementToBeClickable(selectPaymentModel));
		selectPaymentModel.click();
	}
	
	public void continueToVerification() {

		continueToVerification.click();
	}
	
}
