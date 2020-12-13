package helloworld;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hello2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//chromedriver.exe
	//	C:\Users\Aiswa\Downloads\chromedriver_win32
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Aiswa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		

	}

}
