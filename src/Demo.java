import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gopin\\Downloads\\Libraries\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://google.com");
		System.out.println("Successully executed");
		
		driver.get("http://Facebook.com");
		System.out.println("Successully executed");
		
		driver.get("http://Amazon.com");
		System.out.println("Successully executed");
			
	}
	
	
	
}
