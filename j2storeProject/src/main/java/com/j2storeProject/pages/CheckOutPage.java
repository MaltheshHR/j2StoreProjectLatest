package com.j2storeProject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.j2store.actiondriver.Action;
import com.j2storeProject.base.BaseClass;

public class CheckOutPage extends BaseClass {

	Action action = new Action();

	private static final String CHECK_OUT_PAGE_ACCOUNT_REGISTER_CONTINUE = "//button[@id='button-account']";
	private static final String CHECK_OUT_PAGE_FIRST_NAME = "//input[@id='first_name']";
	private static final String CHECK_OUT_PAGE_LAST_NAME = "//input[@id='last_name']";
	private static final String CHECK_OUT_PAGE_EMAIL = "//input[@id='email']";
	private static final String CHECK_OUT_PAGE_PHONE = "//input[@id='phone_1']";
	private static final String CHECK_OUT_PAGE_MOBILE = "//input[@id='phone_2']";
	private static final String CHECK_OUT_PAGE_INPUT_PASSWORD = "//*[@id='akeeba-renderjoomla']/div/div[1]/div[1]/input[6]";
	private static final String CHECK_OUT_PAGE_CONFIRM_PASSWORD = "//*[@id='akeeba-renderjoomla']/div/div[1]/div[1]/input[7]";
	private static final String CHECK_OUT_PAGE_COMPANY = "//input[@id='company']";
	private static final String CHECK_OUT_PAGE_TAX_NUMBER = "//input[@id='tax_number']";
	private static final String CHECK_OUT_PAGE_ADDRESS_1 = "//input[@id='address_1']";
	private static final String CHECK_OUT_PAGE_ADDRESS_2 = "//input[@id='address_2']";
	private static final String CHECK_OUT_PAGE_CITY = "//input[@id='city']";
	private static final String CHECK_OUT_PAGE_ZIP_CODE = "//input[@id='zip']";
	private static final String CHECK_OUT_PAGE_COUNTRY = "//select[@id='country_id']";
	private static final String CHECK_OUT_PAGE_ZONE = "//select[@id='zone_id']";
	private static final String CHECK_OUT_PAGE_CONTINUE = "//*[@id='button-register']";
	private static final String CHECK_OUT_PAGE_CASH_ON_DELIVERY = "//*[@id='onCheckoutPayment_wrapper']/label[1]/input";
	private static final String CHECK_OUT_PAGE_PLACE_ORDER = "//*[@id='cash-submit-button']";
	private static final String CHECK_OUT_PAGE_CONTINUE_CUSTOMER_NOTE = "//*[@id='button-payment-method']";
	private static final String CHECK_OUT_PAGE_GOTO_HISTORY ="//*[@id='akeeba-renderjoomla']/div/div/div[2]/a";
	public CheckOutPage() {
		PageFactory.initElements(getDriver(), this);

	}
	@FindBy(xpath = CHECK_OUT_PAGE_CONTINUE_CUSTOMER_NOTE)
	private WebElement checkOutPageclickOnContinueCusomerNote;
	
	@FindBy(xpath = CHECK_OUT_PAGE_GOTO_HISTORY)
	private WebElement checkOutPageclickOnGotoHistory;

	@FindBy(xpath = CHECK_OUT_PAGE_PLACE_ORDER)
	private WebElement checkOutPageClickPaceOrder;

	@FindBy(xpath = CHECK_OUT_PAGE_CASH_ON_DELIVERY)
	private WebElement checkOutPageClickCOD;

	@FindBy(xpath = CHECK_OUT_PAGE_COUNTRY)
	private WebElement checkOutPageEnteCountry;

	@FindBy(xpath = CHECK_OUT_PAGE_CONTINUE)
	private WebElement checkOutPageClickContinue;

	@FindBy(xpath = CHECK_OUT_PAGE_ZONE)
	private WebElement checkOutPageEnteZone;

	@FindBy(xpath = CHECK_OUT_PAGE_ZIP_CODE)
	private WebElement checkOutPageEnteZipCode;

	@FindBy(xpath = CHECK_OUT_PAGE_CITY)
	private WebElement checkOutPageEnterCity;
	@FindBy(xpath = CHECK_OUT_PAGE_ADDRESS_2)
	private WebElement checkOutPageEnterAddress2;
	@FindBy(xpath = CHECK_OUT_PAGE_ADDRESS_1)
	private WebElement checkOutPageEnterAddress1;
	@FindBy(xpath = CHECK_OUT_PAGE_TAX_NUMBER)
	private WebElement checkOutPageEnterTaxNumber;

	@FindBy(xpath = CHECK_OUT_PAGE_ACCOUNT_REGISTER_CONTINUE)
	private WebElement checkOutAccountResiterContinue;

	@FindBy(xpath = CHECK_OUT_PAGE_LAST_NAME)
	private WebElement checkOutPageEnterLastName;

	@FindBy(xpath = CHECK_OUT_PAGE_FIRST_NAME)
	private WebElement checkOutPageEnterFirstName;

	@FindBy(xpath = CHECK_OUT_PAGE_EMAIL)
	private WebElement checkOutPageEnterEmail;

	@FindBy(xpath = CHECK_OUT_PAGE_PHONE)
	private WebElement checkOutPageEnterPhone;

	@FindBy(xpath = CHECK_OUT_PAGE_MOBILE)
	private WebElement checkOutPageEnterMonile;

	@FindBy(xpath = CHECK_OUT_PAGE_INPUT_PASSWORD)
	private WebElement checkOutPageEnterInputPassWord;

	@FindBy(xpath = CHECK_OUT_PAGE_COMPANY)
	private WebElement checkOutPageEnterCompany;

	@FindBy(xpath = CHECK_OUT_PAGE_CONFIRM_PASSWORD)
	private WebElement checkOutPageEnterConfirmPassWord;
	
	

	public void clickAccountResiterContinue() {
		action.click(getDriver(), checkOutAccountResiterContinue);
	}

	public void enterFirstName(String name) {
		action.type(checkOutPageEnterFirstName, name);
	}

	public void enterlastName(String name) {
		action.type(checkOutPageEnterLastName, name);
	}
	
	
	public void enterEmail(String email) {
		action.type(checkOutPageEnterEmail, email);
	}
	
	public void enterPhone(String phone) {
		action.type(checkOutPageEnterPhone, phone);
	}
	
	public void enterMobile(String MObile) {
		action.type(checkOutPageEnterMonile, MObile);
	}
	
	public void enterPassWord(String pwd) {
		action.type(checkOutPageEnterMonile, pwd);
	}
	
	public void enterConfirmPassWord(String confirmPwd) {
		action.type(checkOutPageEnterMonile, confirmPwd);
	}
	
	public void enterAddressLine1(String address) {
		action.type(checkOutPageEnterAddress1, address);
	}
	
	public void enterAddressLine2(String address) {
		action.type(checkOutPageEnterAddress2, address);
	}
	
	public void enterCity(String city) {
		action.type(checkOutPageEnterCity, city);
	}
	
	public void enterZipCode(String zipCode) {
		action.type(checkOutPageEnteZipCode, zipCode);
	}
	
	public void enterCountry(String coutry) {
		action.selectByValue(checkOutPageEnteCountry, coutry);
	}
	
	public void enterZone(String zone) {
		action.selectByValue(checkOutPageEnteZone, zone);
	}
	
	public void clickOnContinue() {
		action.click(getDriver(), checkOutPageClickContinue);
	}
	
	public void clickOnCOD() {
		action.click(getDriver(), checkOutPageClickCOD);
	}
	public void clickOnContinueCusotmerNote() {
		action.click(getDriver(), checkOutPageclickOnContinueCusomerNote);
	}
	
	public void clickPalceOrder() {
		action.click(getDriver(), checkOutPageClickPaceOrder);
	}
	
	public MyAccountPage clickOnGotoHistory(){
		action.click(getDriver(), checkOutPageclickOnGotoHistory);
		return new MyAccountPage();
	}
}
