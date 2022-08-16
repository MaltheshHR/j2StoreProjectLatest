package com.j2storeProject.actioninterface;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public interface ActionInterface {

	public void scrollByVisibilityOfElement(WebDriver driver, WebElement ele);

	public void click(WebDriver ldriver, WebElement ele);

	public boolean type(WebElement ele, String text);

	public boolean findElement(WebDriver ldriver, WebElement ele);

	public boolean selectByValue(WebElement element, String value);

	public boolean selectByVisibleText(String visibletext, WebElement ele);

	public boolean mouseover(WebDriver driver, WebElement ele);

	public boolean rightclick(WebDriver driver, WebElement ele);

	public boolean switchWindowByTitle(WebDriver driver, String windowTitle, int count);

	public boolean switchToNewWindow(WebDriver driver);

	public boolean switchToOldWindow(WebDriver driver);

	public void fluentWait(WebDriver driver, WebElement element, int timeOut);

	public void implicitWait(WebDriver driver, int timeOut);

	public void explicitWait(WebDriver driver, WebElement element, int timeOut);

	public void pageLoadTimeOut(WebDriver driver, int timeOut);

	public String screenShot(WebDriver driver, String filename);

	public String getCurrentTime();

}
