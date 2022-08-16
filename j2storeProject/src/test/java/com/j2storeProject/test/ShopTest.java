package com.j2storeProject.test;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.j2store.actiondriver.Action;
import com.j2storeProject.base.BaseClass;
import com.j2storeProject.dataprovider.DataProviders;
import com.j2storeProject.pages.HomePage;
import com.j2storeProject.pages.MyAccountPage;
import com.j2storeProject.pages.ShopPage;
import com.j2storeProject.pages.CheckOutPage;
import com.j2storeProject.pages.SimplePage;

public class ShopTest extends BaseClass {
	
	
	HomePage homepage;
	ShopPage shopPage;
	SimplePage simplepage;
	CheckOutPage CheckOutPage;
	MyAccountPage myAccountPage;
	Action action;

	@BeforeMethod
	public void setUp(String browserName) {
		launchApp(browserName);
	}

	@AfterMethod
	public void tearDown() {
		getDriver().quit();
	}

	@Test(dataProvider = "customerInformation", dataProviderClass = DataProviders.class)
	public void validateshopTest(HashMap<String, String> hashMapValue) throws Throwable {
		homepage = new HomePage();
		homepage.clickOnGoShoppingButton();
		shopPage = new ShopPage();
		String preOrderItemName = shopPage.getSimpleItemName();
		shopPage.clickOnItemSimpleViewDdetailsButton();
		simplepage = new SimplePage();
		simplepage.selectThecolor(hashMapValue.get("color"));
		simplepage.selectLarge();
		simplepage.selectDate(DeliveryDate());
		simplepage.clickDoneOnDate();
		simplepage.enterAdditionalInformation(hashMapValue.get("additionInfo"));
		simplepage.addTocart();
		Assert.assertEquals(simplepage.verifyTheItemAddedTotheCart(), hashMapValue.get("completedMessage"));
		CheckOutPage = simplepage.itemsCheckOut();
		CheckOutPage.clickAccountResiterContinue();
		CheckOutPage.enterFirstName(hashMapValue.get(getRandomeString()));
		CheckOutPage.enterlastName(hashMapValue.get(getRandomeString().substring(2)));
		CheckOutPage.enterEmail(getRandomeString() + "@gmail.com");
		CheckOutPage.enterMobile(hashMapValue.get("mobile"));
		CheckOutPage.enterPassWord(createRandomNumber(9, 1) + "");
		CheckOutPage.enterConfirmPassWord(createRandomNumber(9, 1) + "");
		CheckOutPage.enterAddressLine1(hashMapValue.get("address"));
		CheckOutPage.enterCity(hashMapValue.get("city"));
		CheckOutPage.enterZipCode(hashMapValue.get("ZipCode"));
		CheckOutPage.enterCountry(hashMapValue.get("country"));
		action.implicitWait(getDriver(), 5);
		CheckOutPage.enterZone(hashMapValue.get("zone"));
		CheckOutPage.clickOnContinue();
		CheckOutPage.clickOnCOD();
		CheckOutPage.clickOnContinueCusotmerNote();
		CheckOutPage.clickPalceOrder();
		myAccountPage = CheckOutPage.clickOnGotoHistory();
		String postOrderItemName = myAccountPage.getTheProductFromActionForm();
		Assert.assertTrue(preOrderItemName.equalsIgnoreCase(postOrderItemName), "Order Palced");
	}

}
