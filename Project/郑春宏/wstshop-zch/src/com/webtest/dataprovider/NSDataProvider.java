package com.webtest.dataprovider;

import java.io.IOException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NSDataProvider {

	
	@DataProvider(name="zl_shop")
	public  Object[][] getTxtData() throws IOException{
		return new  TxtDataProvider().getTxtUser("data/user.txt");
	}
	@DataProvider(name="movie")
	public  Object[][] getMovieData() throws IOException{
		return new  ExcelDataProvider().getTestDataByExcel("data/movie.xlxs","Sheet1");
	}
	@Test(dataProvider="txt")
	public void getData(String a,String b) {
		System.out.println(a+" "+b);
		
	}

	@DataProvider(name="excel")
	public Object[][] getExcelDada() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data/user.xlsx","Sheet1");
	}
	
	@DataProvider(name="mysql")
	public Object[][] getMysqlDada() throws IOException{
		return new MysqlDataProvider().getTestDataByMysql("SELECT filmname, petname\r\n" + 
				"FROM `mm_movie` ");
	}
	
	@Test(dataProvider="mysql")
	public void testDB(String a,String b) {
		System.out.println(a+" "+b);
	}
	
	@DataProvider(name="zch")
	public Object[][] getExcelData() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data/z-data.xlsx","Sheet1");
	}
	@DataProvider(name="zsm")
	public Object[][] getExcelData2() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data/zsm.xlsx","Sheet1");
	}
	
	@DataProvider(name="lhy")
	public Object[][] getExcelData3() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data/lhy.xlsx","Sheet1");
	}
	
	@DataProvider(name="wq")
	public Object[][]getwstshopData4() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data/wq.xlsx", "Sheet1");	
	}
	
	@DataProvider(name="hzx")
	public Object[][]getwstshopData5() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data/hzx.xlsx", "Sheet1");	
	}
	
}
