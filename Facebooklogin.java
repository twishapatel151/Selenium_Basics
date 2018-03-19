package selenium.prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooklogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\JAVA_DATA\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String baseURL="https://www.facebook.com/";
		driver.get(baseURL);
		WebElement uname=driver.findElement(By.id("email"));
		uname.sendKeys("Trupti.patel01");
		driver.findElement(By.id("u_0_a")).click();
	}
}
