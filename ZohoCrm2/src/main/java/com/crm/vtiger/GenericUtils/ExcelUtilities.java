package com.crm.vtiger.GenericUtils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtilities 
{
	 
public String getExcelData(String sheetname,int rownum,int cellnum) throws EncryptedDocumentException, IOException 
{
	
	FileInputStream file=new FileInputStream(Ipathconstant.EXCELPATH);
	  Workbook wb = WorkbookFactory.create(file);
	 Sheet sheet = wb.getSheet(sheetname);
	  Row row = sheet.getRow(rownum);
	  Cell cell = row.getCell(cellnum);
	
	return cell.getStringCellValue();
}

}
