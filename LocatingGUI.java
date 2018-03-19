package selenium.prac;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
public class LocatingGUI {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\JAVA_DATA\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String baseUrl="http://www.facebook.com";
		String tagName="";
		driver.get(baseUrl);
		tagName=driver.findElement(By.id("email")).getTagName();
		System.out.println(tagName);
		driver.close();
		System.exit(0);
	}
	

}
