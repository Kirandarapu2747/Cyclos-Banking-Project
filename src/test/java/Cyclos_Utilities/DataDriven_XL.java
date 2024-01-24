package Cyclos_Utilities;

import java.io.*;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.*;
import org.testng.ITestListener;

public class DataDriven_XL implements ITestListener
{
	public static FileInputStream fi;
	public static FileOutputStream fo;
	public static XSSFWorkbook wb;
	public static XSSFSheet sh;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static CellStyle style;
	
	public static int getRowCount(String XLfile,String XLsheet) throws IOException
	{
		fi=new FileInputStream(XLfile);
		wb=new XSSFWorkbook(fi);
		sh=wb.getSheet("Sheet1");	
		int rowcount=sh.getLastRowNum();
		wb.close();
		fi.close();
		return rowcount;
	}
	
	public static int getCellCount(String XLfile,String XLsheet,int rownum) throws IOException
	{
		fi=new FileInputStream(XLfile);
		wb=new XSSFWorkbook(fi);
		sh=wb.getSheet("Sheet1");	
		row=sh.getRow(rownum);
		int cellcount=row.getLastCellNum();
		wb.close();
		fi.close();
		return cellcount;
	}
	
	public static String getCellData(String XLfile,String XLsheet,int rownum,int colnum) throws IOException
	{
		fi=new FileInputStream(XLfile);
		wb=new XSSFWorkbook(fi);
		sh=wb.getSheet("Sheet1");	
		row=sh.getRow(rownum);
		cell=row.getCell(colnum);
		String data;
		try
		{
			DataFormatter formatter=new DataFormatter();
			String celldata=formatter.formatCellValue(cell);
			return celldata;
		}
		catch(Exception e)
		{
			data="";
		}
		wb.close();
		fi.close();
		return data;
	}
	
	public static void setCellData(String XLfile,String XLsheet,int rownum,int colnum,String data) throws IOException
	{
		fi=new FileInputStream(XLfile);
		wb=new XSSFWorkbook(fi);
		sh=wb.getSheet("Sheet1");	
		row=sh.getRow(rownum);
		cell=row.createCell(colnum);
		cell.setCellValue(data);
		fo=new FileOutputStream(XLfile);
		wb.write(fo);
		wb.close();
		fo.close();
		fi.close();
	}
	
	public static void fillGreenColor(String xlfile,String xlsheet, int rownum,int cellnum) throws IOException {
		fi=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fi);
		sh=wb.getSheet(xlsheet);
		row=sh.getRow(rownum);
		cell=row.getCell(cellnum);
		style=wb.createCellStyle();
		style.setFillForegroundColor(IndexedColors.GREEN.getIndex());//fill the color green
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		cell.setCellStyle(style);
		fo=new FileOutputStream(xlfile);
		wb.write(fo);
		wb.close();
		fi.close();
		fo.close();
		
	}
	public static void fillRedColor(String xlfile,String xlsheet, int rownum,int cellnum) throws IOException {
		fi=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fi);
		sh=wb.getSheet(xlsheet);
		row=sh.getRow(rownum);
		cell=row.getCell(cellnum);
		style=wb.createCellStyle();
		style.setFillForegroundColor(IndexedColors.RED.getIndex());//fill the color green
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		cell.setCellStyle(style);
		fo=new FileOutputStream(xlfile);
		wb.write(fo);
		wb.close();
		fi.close();
		fo.close();
		
	}


}
