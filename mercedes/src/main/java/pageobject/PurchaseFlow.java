package main.java.pageobject;

import org.junit.Before;
import org.junit.Test;

import main.java.utils.Config;

public class PurchaseFlow extends Config {

	Filter collectionpageobject;

	@Before
	public void setup() {
		collectionpageobject = new Filter(driver);

	}

	@Test
	public void validateFilter() throws Exception {

		collectionpageobject.allModels();
		collectionpageobject.hachbacks();

		collectionpageobject.mouseOverClassA(driver);
		collectionpageobject.buildCar();
		
		collectionpageobject.selectDiesel(driver);
		collectionpageobject.takeScreenshot(driver);
		

	}
}
