package com.j2storeProject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.j2store.actiondriver.Action;
import com.j2storeProject.base.BaseClass;

public class BlogPage extends BaseClass {

	Action action = new Action();
	private static final String BLOG_PAGE_FIRST_BLOG = "//a[@title='Homepage using SiteOrigin Page Builder']";
	private static final String BLOG_PAGE_SECOND_BLOG = "//a[@title='Ecommerce Analytics with Segment']";
	private static final String BLOG_PAGE_THIRD_BLOG = "//a[@title='Picking the Perfect Product']";

	public BlogPage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(xpath = BLOG_PAGE_FIRST_BLOG)
	private WebElement blogPageFirstBlog;

	@FindBy(xpath = BLOG_PAGE_SECOND_BLOG)
	private WebElement blogPageSecondBlog;

	@FindBy(xpath = BLOG_PAGE_THIRD_BLOG)
	private WebElement blogPageThirdBlog;

	public void clickFirstBlog() {
		action.click(getDriver(), blogPageFirstBlog);

	}

	public void clickSecondBlog() {
		action.click(getDriver(), blogPageSecondBlog);
	}

	public void clickThirdBlog() {
		action.click(getDriver(), blogPageThirdBlog);
	}

	public String getBlogHeading() {
		return blogPageFirstBlog.getText();
	}

	public String getBlogPageTitle() {
		String title = getDriver().getTitle();
		return title;
	}

}
