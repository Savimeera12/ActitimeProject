package com.Actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TimeTrackPage {
	@FindBy(xpath = "//div[.='Tasks']")
	private WebElement tasklink;
	
	@FindBy(xpath = "//div[.='Reports']")
	private WebElement reporterlink;
	
	@FindBy(xpath = "//div[.='Users']")
	private WebElement userlink;
	
	@FindBy(id = "logoutLink")
	private WebElement lgoutlnk;
	
	//initilization
	public TimeTrackPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getTasklink() {
		return tasklink;
	}

	public WebElement getReporterlink() {
		return reporterlink;
	}

	public WebElement getUserlink() {
		return userlink;
	}

	public WebElement getLgoutlnk() {
		return lgoutlnk;
	}
	
	

}
