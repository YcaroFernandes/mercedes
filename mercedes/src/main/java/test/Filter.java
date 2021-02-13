package main.java.test;

import org.junit.Before;
import org.junit.Test;

import main.java.pageobject.CarFilterPO;
import main.java.utils.Config;

public class Filter extends Config {

	CarFilterPO collectionpageobject;

	@Before
	public void setup() {
		collectionpageobject = new CarFilterPO(driver);

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
