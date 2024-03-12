package selenium;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;

public class Excel_Application {
	public static void main(String args[]) throws Exception {
		FileInputStream obj=new FileInputStream("F:\\software testing course\\Username_Passwords.xls");
		Workbook wb=Workbook.getWorkbook(obj);
		Sheet st=wb.getSheet(0);
		String un=st.getCell(0,5).getContents();
		String up=st.getCell(2,5).getContents();
		System.out.println(un+"  "+up);
		WebDriver driver=new ChromeDriver();
		driver.get("http://183.82.103.245/nareshit/login.php");
		Thread.sleep(3000);
		driver.findElement(By.name("txtUserName")).sendKeys(un);
		Thread.sleep(3000);
		driver.findElement(By.name("txtPassword")).sendKeys(up);
		Thread.sleep(2000);
		driver.findElement(By.name("Submit")).click();
		driver.findElement(By.linkText("Logout")).click();
		driver.quit();
	}
}
