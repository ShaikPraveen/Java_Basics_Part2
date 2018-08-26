package com.readingexcelfiles;

public class TestExcel 
{
	public static void main(String[] args) {
		
		
		ExcelReader excel=new ExcelReader("D:\\Praveen_Automation\\sampleexcel.xlsx");
		String sheetName="Details";
		System.out.println(excel.getRowCount(sheetName));
		System.out.println(excel.getColumnCount(sheetName));
		System.out.println(excel.getCellData(sheetName, "UserName", 2));
		System.out.println(excel.setCellData(sheetName, "UserName", 8, "charn"));
	}

}
