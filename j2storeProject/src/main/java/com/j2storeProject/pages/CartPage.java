package com.j2storeProject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.j2storeProject.base.BaseClass;

public class CartPage extends BaseClass{
	
	private static final String CART_PAGE_PROCEED_TO_CHECKOUT = "//div[@class = 'buttons-right']/span/a";
	
	public CartPage(){
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(xpath = CART_PAGE_PROCEED_TO_CHECKOUT)
	private WebElement cartpageProceedToCheckOut;
	

}
