package com.j2storeProject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.j2store.actiondriver.Action;
import com.j2storeProject.base.BaseClass;

public class HomePage extends BaseClass {

	Action action = new Action();

	private static final String HOME_PAGE_BLOG = "//div[@class='t3-megamenu']/ul/li[3]/a";
	private static final String HOME_PAGE_GO_SHOPPING_BUTTON = "//div[@class='banner-content']/a";

	public HomePage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(xpath = HOME_PAGE_BLOG)
	private WebElement homePageBlog;

	@FindBy(xpath = HOME_PAGE_GO_SHOPPING_BUTTON)
	private WebElement homePageGoShopingButton;

	public BlogPage clickOnBlog() {
		action.click(getDriver(), homePageBlog);
		return new BlogPage();
	}

	public ShopPage clickOnGoShoppingButton() {
		action.click(getDriver(), homePageGoShopingButton);
		return new ShopPage();
	}

	public String getj2StoreTitle() {
		String title = getDriver().getTitle();
		return title;
	}

}
