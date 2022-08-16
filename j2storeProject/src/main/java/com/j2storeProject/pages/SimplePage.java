package com.j2storeProject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.j2store.actiondriver.Action;
import com.j2storeProject.base.BaseClass;

public class SimplePage extends BaseClass {

	Action action = new Action();

	private static final String SIMPLE_PAGE_COLOR = "//*[@id='option-5'/select";
	private static final String SIMPLE_PAGE_SIZE_LARGE = "//*[@id='option-6']/input[1]";
	private static final String SIMPLE_PAGE_SIZE_MEDIUM = "//*[@id='option-6']/input[2]";
	private static final String SIMPLE_PAGE_SIZE_SMALL = "//*[@id='option-6']/input[3]";
	private static final String SIMPLE_PAGE_EXPECTED_DELIVERY_DATE = "//*[@id='dp1660493716842']";
	private static final String SIMPLE_PAGE_ADDITIONAL_INFORMATION = "//textarea[@name='product_option[8]']";
	private static final String SIMPLE_PAGE_ADD_TO_CART = "//div[@id='add-to-cart-67']/input[2]";
	private static final String SIMPLE_PAGE_CART_BUTTON = "//div[@class = 'pull-right head-myaccount ']/ul/li[2]/a";
	private static final String SIMPLE_PAGE_DONE = "//*[@id='ui-datepicker-div']/div[3]/button[2]";
	private static final String SIMPLE_PAGE_ITEMS = "//div[@class='j2store-cart-info-link']";
	private static final String SIMPLE_PAGE_ITEM_CHECKOUT = "//*[@id='j2store_cart_item_123']/div[2]/a[1]";
	private static final String SIMPLE_PAGE_ITEM_ADDED_TO_THE_CART = "//*[@id='j2store-addtocart-form-67']/div[2]/p";
	private static final String SIMPLE_PAGE_ITEM_CHECK_OUT = "//*[@id='j2store-addtocart-form-67']/div[2]/p/a";
	public SimplePage() {
		PageFactory.initElements(getDriver(), this);
	}
	@FindBy(xpath = SIMPLE_PAGE_ITEM_CHECK_OUT)
	private WebElement simplePageItemACheckOut;
	
	@FindBy(xpath = SIMPLE_PAGE_ITEM_ADDED_TO_THE_CART)
	private WebElement simplePageItemAddedToTheCart;
	
	@FindBy(xpath = SIMPLE_PAGE_ITEM_CHECKOUT)
	private WebElement simplePageItemCheckOut;
	
	@FindBy(xpath = SIMPLE_PAGE_ITEMS)
	private WebElement simplePageItems;
	
	@FindBy(xpath = SIMPLE_PAGE_DONE)
	private WebElement simplePageDone;

	@FindBy(xpath = SIMPLE_PAGE_COLOR)
	private WebElement simplePageColor;

	@FindBy(xpath = SIMPLE_PAGE_CART_BUTTON)
	private WebElement simplePagecartButton;

	@FindBy(xpath = SIMPLE_PAGE_SIZE_LARGE)
	private WebElement simplePageSizeLarge;

	@FindBy(xpath = SIMPLE_PAGE_SIZE_MEDIUM)
	private WebElement simplePageSizeMedium;

	@FindBy(xpath = SIMPLE_PAGE_SIZE_SMALL)
	private WebElement simplePageSizeSmall;

	@FindBy(xpath = SIMPLE_PAGE_EXPECTED_DELIVERY_DATE)
	private WebElement simplePageExpectedDeliveryDate;

	@FindBy(xpath = SIMPLE_PAGE_ADDITIONAL_INFORMATION)
	private WebElement simplePageAdditionalInformation;

	@FindBy(xpath = SIMPLE_PAGE_ADD_TO_CART)
	private WebElement simplePageAddToCart;
	
	public CheckOutPage checkOutItem(){
		action.click(getDriver(), simplePageItemACheckOut);
		return new CheckOutPage();
	}
	public String verifyTheItemAddedTotheCart(){
		return simplePageItemAddedToTheCart.getText();
	}
	public CheckOutPage itemsCheckOut(){
		action.mouseover(getDriver(), simplePageItems);
		action.click(getDriver(), simplePageItemCheckOut);
		return new CheckOutPage();
	}
	
	public void clickDoneOnDate(){
		action.click(getDriver(), simplePageDone);
	}

	public void selectThecolor(String color) {
		action.selectByVisibleText(color, simplePageColor);
	}

	public void selectLarge() {
		action.click(getDriver(), simplePageSizeLarge);

	}

	public void selectMedium() {
		action.click(getDriver(), simplePageSizeMedium);
	}

	public void selectSmall() {
		action.click(getDriver(), simplePageSizeSmall);
	}

	public void selectDate(String date) throws Throwable {
		action.type(simplePageExpectedDeliveryDate, date);
	}

	public void addTocart() {
		action.click(getDriver(), simplePageAddToCart);
	}

	public void enterAdditionalInformation(String additionalInformation) {
		action.type(simplePageAdditionalInformation, additionalInformation);
	}

	public CartPage clickCartButton() {
		action.click(getDriver(), simplePagecartButton);
		return new CartPage();
	}
}
