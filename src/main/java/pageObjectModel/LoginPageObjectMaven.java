package pageObjectModel;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjectMaven {
	public WebDriver driver;

	By username = By.xpath("//input[@id='username']");
	By password = By.xpath("//input[@id='password']");
	By login = By.xpath("//input[@id='Login']");
	By TryForFree = By.xpath("//a[@id='signup_link']");
	By Actual=By.xpath("//div[@id='error']");

	public LoginPageObjectMaven(WebDriver driver2) {
		this.driver = driver2;
	}

	public WebElement EnterUsername() {

		return driver.findElement(username);
	}

	public WebElement EnterPasswors() {
		return driver.findElement(password);
	}

	public WebElement EnterLogin() {
		return driver.findElement(login);
	}

	public WebElement EnterTryForFree() {
		return driver.findElement(TryForFree);
	}
	public WebElement EnterActual() {
		return driver.findElement(Actual);
	}
}
