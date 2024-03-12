package selenium;

import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;

public class Excel_Read {
	public static void main(String[] args) throws Exception {
		FileInputStream file = new FileInputStream("F:\\software testing course\\ReadExcel1.xls");
		Workbook wb = Workbook.getWorkbook(file);
		Sheet st = wb.getSheet("Sheet1");
//	Single Row data
		System.out.println(st.getRows());
		String name = st.getCell(1, 6).getContents();
		String sal = st.getCell(4, 6).getContents();
		String mail = st.getCell(3, 6).getContents();
		System.out.println(name + " " + sal + " " + mail);
		System.out.println("=======================================");
//Whole Excel data
		int rows = st.getRows();
		for (int i = 1; i<rows; i++) {
			String empid=st.getCell(0 /*column*/,i/*row*/).getContents();
			String empname=st.getCell(1,i).getContents();
			String empnum=st.getCell(2,i).getContents();
			String empmail=st.getCell(3,i).getContents();
			String empsalry=st.getCell(4,i).getContents();
			String empAddrs=st.getCell(5,i).getContents();
			System.out.println(empid+" "+empname+" "+empnum+" "+empmail+" "+empsalry+" "+empAddrs);
			Thread.sleep(2000);
		}
	}

}
