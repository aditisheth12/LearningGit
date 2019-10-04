package com.crm.spectrum.genericLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PropertyExcelFileReader {
private String propertyFilePath="./MyTestData/TestDataPropertyFile.properties";
private String excelFilePath="./MyTestData/ExcelScriptData.xlsx";
//getting data from properties file

public String getPropertyFile(String key) throws IOException {

FileInputStream fis = new FileInputStream(propertyFilePath);
Properties pobject= new Properties();
pobject.load(fis);
String data=pobject.getProperty(key);
return data;
}
//getting data from excel
public String getExcelData(String sheetName, int rowNum, int celNum)
		throws EncryptedDocumentException, IOException {

	FileInputStream fis1 = new FileInputStream(excelFilePath);
	Workbook wb = WorkbookFactory.create(fis1);
	Sheet sh = wb.getSheet(sheetName);
	Row row = sh.getRow(rowNum);
	Cell cel = row.getCell(celNum);
	String data = cel.getStringCellValue();
	return data;
}
}
