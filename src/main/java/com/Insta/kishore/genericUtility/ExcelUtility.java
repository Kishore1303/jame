package com.Insta.kishore.genericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	public void getName() throws IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/testSpecificData.xlsx");
		Workbook workbook=WorkbookFactory.create(fis);
		Sheet sheet=workbook.getSheet("Data");
		Row row=sheet.getRow(rowNum);
		Cell cell=row.getCell(colNum);
	}
}
