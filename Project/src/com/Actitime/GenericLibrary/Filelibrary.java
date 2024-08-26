package com.Actitime.GenericLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * @author QSpiders
 * this class is a generic class which contains generic methods used to read data from property and excel file
 */
public class Filelibrary {
	/**
	 * this method is a generic method used to read data from property file
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String readDataFromPropertyFile(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./Testdata/Acti.property");
		Properties p=new Properties();
		p.load(fis);
		String value = p.getProperty(key);
		return value;
	}
	/**
	 * this method is a generic method used to read data from excel
	 * @param sheet
	 * @param row
	 * @param cell
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String readDataFromExcel(String sheet,int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./Testdata/Customer.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String value = wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return value;
	}

}
