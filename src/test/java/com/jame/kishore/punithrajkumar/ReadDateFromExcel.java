package com.jame.kishore.punithrajkumar;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDateFromExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		 FileInputStream fis = new FileInputStream("./src/test/resources/testdata.xlsx");
		 Workbook workBook = WorkbookFactory.create(fis);
		 Sheet sheet = workBook.getSheet("candidateData");
		 Row row = sheet.getRow(1);
		 Cell cell = row.getCell(0);
		 String candidateName = cell.getStringCellValue();
		 //if no data found in cell it will give NullPointerException
		 //if you try to find string value within numeric cell it gives IlllegalStateException
		 System.out.println("candidateName = " + candidateName);
//		 Cell status = sheet.getRow(2).createCell(6);
//		 status.setCellValue("Pass");
		 workBook.close();
	}
}
