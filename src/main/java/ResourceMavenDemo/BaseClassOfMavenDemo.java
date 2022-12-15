package ResourceMavenDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClassOfMavenDemo {
	public  WebDriver driver;

	public void BI() throws Exception {

		String path = "C:\\Users\\HP\\eclipse-workspace\\MavenDemo\\src\\main\\java\\ResourceMavenDemo\\MavenDemoProject.properties";
		FileInputStream f = new FileInputStream(path);

		Properties prop = new Properties();

		prop.load(f);

		String browserName = prop.getProperty("browser");

		if (browserName.equalsIgnoreCase("chrome")) {
		 driver = new ChromeDriver();
		 //driver.get("https://login.salesforce.com/?locale=in");
		}

		else if (browserName.equalsIgnoreCase("firefox")) {
		}

		else {
			System.out.println("please enter valid browser name");

}

}

}
