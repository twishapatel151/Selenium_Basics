package selenium.prac;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First_Selenium {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\JAVA_DATA\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String BaseUrl=  "http://demo.guru99.com/test/newtours/";
		String Expectedtitle="Welcome: Mercury Tours";
		String actualTitle = "";
		driver.get(BaseUrl);
		actualTitle=driver.getTitle();
		if(actualTitle.contentEquals(Expectedtitle))
		{
			System.out.println("test passed!");
		}
		else
		{
			System.out.println("test failed!");
		}

		driver.close();
	}

}
