package main.java.pageobject;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import main.java.utils.Config;

public class CarFilterPO extends Config {

	@FindBy(css = "button.vmos_CwgJh.vmos_1nenx.vmos_Kn8Xv")

	private WebElement allModels;

	@FindBy(className = "vmos_1nZ_z")

	private WebElement hachbacks;

	@FindBy(className = "vmos_3Uy4Y")

	public WebElement mouseOverClassA;

	@FindBy(name = "car-config")

	private WebElement buildCar;

	@FindBy(css = ".cc-motorization-filter:nth-child(1) .cc-motorization-filter__option-item:nth-child(2) .wb-checkbox-control__checkmark-icon")

	public WebElement selectDiesel;

	@FindBy(css = "fieldset.cc-motorization-filter:nth-child(1)")

	public WebElement box;

	@FindBy(css = "cc-slave-slider.cc-slider--use-grid")

	public WebElement cars;

	@FindBy(css = "cc-slave-slide.ng-star-inserted:nth-child(1) > div:nth-child(1) > cc-motorization-header:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")

	public WebElement carNameOne;

	@FindBy(css = "cc-slave-slide.ng-star-inserted:nth-child(1) > div:nth-child(1) > cc-motorization-header:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2)")

	public WebElement carValue;

	@FindBy(xpath = "/html/body/main/div/div/div/owcc/cc-app-root/div/cc-app-container/div/div[2]/div[2]/div[1]/cc-motorization/cc-motorization-comparison/div/div/cc-slider/div/cc-slider-ui-container/cc-slider-buttons/div/button[2]")

	public WebElement nextSlideButton;

	private JavascriptExecutor executor;

	public CarFilterPO(WebDriver driver) {

		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 15, 50);
		actions = new Actions(driver);
		executor = (JavascriptExecutor) driver;
	}

	public void allModels() {

		wait.until(ExpectedConditions.elementToBeClickable(allModels));
		allModels.click();
	}

	public void hachbacks() {

		wait.until(ExpectedConditions.elementToBeClickable(hachbacks));
		hachbacks.click();
	}

	public void mouseOverClassA(WebDriver driver) {

		executor.executeScript("arguments[0].scrollIntoView();", mouseOverClassA);
		actions.moveToElement(mouseOverClassA).click().build().perform();
	}

	public void buildCar() throws InterruptedException {

		wait.until(ExpectedConditions.elementToBeClickable(buildCar));
		buildCar.click();
		wait.until(ExpectedConditions.elementToBeClickable(box));

	}

	public void selectDiesel(WebDriver driver) throws InterruptedException {

		executor.executeScript("scroll(0, 600)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(selectDiesel));
		selectDiesel.click();

	}

	public void takeScreenshot(WebDriver driver) throws InterruptedException {

		executor.executeScript("arguments[0].scrollIntoView();", nextSlideButton);

		List<String> all_elements_text = new ArrayList<>();

		int myList = driver.findElements(By.cssSelector(".cc-slider__slides .cc-slide:not(.cc-navigation__slide)"))
				.size();

		for (int i = 1; i <= myList; i++) {

			all_elements_text.add(driver.findElement(By.cssSelector("cc-slave-slide.ng-star-inserted:nth-child(" + i
					+ ") > div:nth-child(1) > cc-motorization-header:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2)"))
					.getText());

			try {
				File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

				FileUtils.copyFile(screenshot, new File("PrintCar" + i));
			} catch (IOException e) {
				e.printStackTrace();
			}

			wait.until(ExpectedConditions.elementToBeClickable(nextSlideButton));
			nextSlideButton.click();

		}
	
		System.out.println(all_elements_text);
		
		System.out.println("O carro com maior valor e:" + Collections.max(all_elements_text));

	}
}
