package com.j2storeProject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.j2store.actiondriver.Action;
import com.j2storeProject.base.BaseClass;

public class MyAccountPage extends BaseClass{
	
	Action action = new Action();
	
	private static final String MY_ACCOUNT_PAGE_ACTION_FORM = "//*[@id='adminForm']/table/tbody/tr/td[5]/span/span[1]/a/span";
	private static final String MY_ACCOUNT_PAGE_ITEM_NAME = "//*[@id='akeeba-renderjoomla']/div/div/table/tbody/tr[3]/td/div/table/tbody/tr/td[1]/span[1]";
	
	public MyAccountPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(xpath = MY_ACCOUNT_PAGE_ACTION_FORM)
	private WebElement myAccountPageActionForm;
	
	@FindBy(xpath = MY_ACCOUNT_PAGE_ITEM_NAME)
	private WebElement myAccountPageItemName;
	
	public String getTheProductFromActionForm(){
		action.click(getDriver(), myAccountPageActionForm);
		action.switchToNewWindow(getDriver());
		action.scrollByVisibilityOfElement(getDriver(), myAccountPageItemName);
		return myAccountPageItemName.getText();
	}
	

}
