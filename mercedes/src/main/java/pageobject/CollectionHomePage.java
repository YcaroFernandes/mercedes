package main.java.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import main.java.utils.Config;


public class CollectionHomePage extends Config {

	@FindBy(xpath = "//a[contains(.,'Discover now')]")
	
	private WebElement clickDiscoverNow;

	@FindBy(css = ".col-xs-6:nth-child(1) .responsive-image")
	
	private WebElement selectItem;

	@FindBy(css = ".dcp-pdp-buy-box-add-to-basket__cta--one-variant")
	
	private WebElement addOnCart;

	@FindBy(css = ".dcp-modal__cta--primary")
	
	private WebElement seeTheCart;

	@FindBy(css = "pg-options-view")
	
	private WebElement optionsButton;

	public CollectionHomePage(WebDriver driver) {

		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 15, 50);

	}

	public void selectItem() throws InterruptedException {

		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(optionsButton));
		selectItem.click();
	}

	public void clickDiscoverNow() {

		wait.until(ExpectedConditions.elementToBeClickable(clickDiscoverNow));
		clickDiscoverNow.click();
	}

	public void addOnCart() {

		wait.until(ExpectedConditions.elementToBeClickable(addOnCart));
		addOnCart.click();
	}

	public void seeTheCart() {

		wait.until(ExpectedConditions.elementToBeClickable(seeTheCart));
		seeTheCart.click();
	}

}
