package com.j2storeProject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.j2store.actiondriver.Action;
import com.j2storeProject.base.BaseClass;

public class ShopPage extends BaseClass {

	Action action = new Action();

	private static final String SHOP_PAGE_ITEM_SIMPLE = "//form[@id='j2store-addtocart-form-67']/a";
	private static final String SHOP_PAGE_ITEM_SIMPLE_NAME = "//*[@id='akeeba-renderjoomla']/div/div/div[1]/div[1]/div[1]/div/h2/a";

	public ShopPage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(xpath = SHOP_PAGE_ITEM_SIMPLE)
	private WebElement shopPaageitemSimple;
	
	@FindBy(xpath = SHOP_PAGE_ITEM_SIMPLE_NAME)
	private WebElement shopPaageitemSimpleName;

	public SimplePage clickOnItemSimpleViewDdetailsButton() {
		action.click(getDriver(), shopPaageitemSimple);
		return new SimplePage();
	}
	
	public String getSimpleItemName(){
		return shopPaageitemSimpleName.getText(); 
	}

}
