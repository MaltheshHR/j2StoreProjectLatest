package com.j2storeProject.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.j2storeProject.base.BaseClass;
import com.j2storeProject.pages.BlogPage;
import com.j2storeProject.pages.HomePage;
import com.j2storeProject.dataprovider.DataProviders;


public class BlogTest extends BaseClass {
	private String blogPageTitle;
	HomePage homepage;
	BlogPage blogPage;

	@BeforeMethod
	public void setUp(String browserName) {
		launchApp(browserName);
	}

	@AfterMethod
	public void tearDown() {
		getDriver().quit();
	}

	@Test(dataProvider = "blogs", dataProviderClass = DataProviders.class)
	public void openBlogFromHomePage(String blog1, String blog2, String blog3) {
		homepage = new HomePage();
		String HomepageTitle = homepage.getj2StoreTitle();
		Assert.assertEquals(HomepageTitle, "Home");
		homepage.clickOnBlog();
		blogPageTitle = blogPage.getBlogPageTitle();
		Assert.assertEquals(blogPageTitle, "Blog");
		blogPage.clickFirstBlog();
		blogPageTitle = blogPage.getBlogPageTitle();
		Assert.assertEquals(blogPageTitle, blog1);
		homepage.clickOnBlog();
		blogPage.clickSecondBlog();
		blogPageTitle = blogPage.getBlogPageTitle();
		Assert.assertEquals(blogPageTitle, blog2);
		homepage.clickOnBlog();
		blogPage.clickThirdBlog();
		blogPageTitle = blogPage.getBlogPageTitle();
		Assert.assertEquals(blogPageTitle, blog3);
	}

}
