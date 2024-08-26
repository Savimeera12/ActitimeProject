package com.Actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {
	
	@FindBy(xpath = "//div[.='Add New']")
    private WebElement addnewbtn;
	
	@FindBy(xpath = "//div[.='+ New Customer']")
	private WebElement newcustomerbtn;
	
	@FindBy(xpath = "(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement customername;
	
	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
	private WebElement customerdesp;
	
	@FindBy(xpath = "//div[.='Create Customer']")
	private WebElement createcustomerbtn;
	
	@FindBy(xpath = "//div[@class='greyButton cancelBtn']")
	private WebElement cancelbtn;
	
	
	public TaskPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}


	public WebElement getAddnewbtn() {
		return addnewbtn;
	}


	public WebElement getNewcustomerbtn() {
		return newcustomerbtn;
	}


	public WebElement getCustomername() {
		return customername;
	}


	public WebElement getCustomerdesp() {
		return customerdesp;
	}


	public WebElement getCreatecustomerbtn() {
		return createcustomerbtn;
	}


	public WebElement getCancelbtn() {
		return cancelbtn;
	}
	
	
}
