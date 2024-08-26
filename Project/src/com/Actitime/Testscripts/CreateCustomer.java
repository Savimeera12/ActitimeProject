package com.Actitime.Testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Actitime.GenericLibrary.Baseclass;
import com.Actitime.GenericLibrary.Filelibrary;
import com.Actitime.pom.TaskPage;
import com.Actitime.pom.TimeTrackPage;

public class CreateCustomer  extends Baseclass{
	
	@Test
	public void addCustomer() throws EncryptedDocumentException, IOException {
		TimeTrackPage tt=new TimeTrackPage(driver);
		tt.getTasklink().click();
		TaskPage tp=new TaskPage(driver);
		tp.getAddnewbtn().click();
		tp.getNewcustomerbtn().click();
		Filelibrary f=new Filelibrary();
		String name = f.readDataFromExcel("Sheet1", 4, 1);
		tp.getCustomername().sendKeys(name);
		String desp = f.readDataFromExcel("Sheet1", 4, 2);
		tp.getCustomerdesp().sendKeys(desp);
		tp.getCreatecustomerbtn().click();
		String expectedresult = name;
		String actualresult = driver.findElement(By.xpath("(//div[.='"+name+"'])[2]")).getText();
		SoftAssert s=new SoftAssert();
		s.assertEquals(expectedresult, actualresult);
		Reporter.log("verification successful",true);
		s.assertAll();
	}
	
	

}
