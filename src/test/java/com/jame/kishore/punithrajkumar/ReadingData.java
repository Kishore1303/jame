package com.jame.kishore.punithrajkumar;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("/Users/kishoremv/Downloads/test/testSpecificData.xlsx");
		Workbook WorkBook = WorkbookFactory.create(fis);
		Sheet sheet = WorkBook.getSheet("Data");
		Row row = sheet.getRow(2);
		Cell cell = row.getCell(1);
		System.out.println(cell.getStringCellValue());
	}
}
