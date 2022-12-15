package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpDemoObject {
	public WebDriver driver;
	By FirstName = By.xpath("//input[@name='UserFirstName']");
	By LastName = By.xpath("//input[@name='UserLastName']");
	By WorkEmail = By.xpath("//input[@name='UserEmail']");
	By Company = By.xpath("//input[@name='CompanyName']");
	By Phone = By.xpath("//input[@name='UserPhone']");
	
	By JobTitle=By.xpath("//select[@name='UserTitle']");
	By Employee=By.xpath("//select[@name='CompanyEmployees']");
	By Country=By.xpath("//select[@name='CompanyCountry']");
	By State=By.xpath("//select[@name='CompanyState']");
	By Chechbox=By.xpath("//div[@class='checkbox-ui']");
	By StartMyTrial=By.xpath("//button[@name='start my free trial']");

	public SignUpDemoObject(WebDriver driver2) {
		this.driver=driver2;
		
	}

	public WebElement EnterFirstName() {
		return driver.findElement(FirstName);
	}

	public WebElement EnterLastname() {
		return driver.findElement(LastName);
	}

	public WebElement EnterWorkEmail() {
		return driver.findElement(WorkEmail);
	}

	public WebElement EnterCompany() {
		return driver.findElement(Company);
	}

	public WebElement EnterPhone() {
		return driver.findElement(Phone);
	}
public WebElement EnterJobTitle() {
	return driver.findElement(JobTitle);
}
public WebElement EnterEmployee() {
	return driver.findElement(Employee);
}
public WebElement EnterCountry() {
	return driver.findElement(Country);
}
public WebElement EnterState() {
	return driver.findElement(State);
}
public WebElement EnterCheckbox() {
	return driver.findElement(Chechbox);
}
public WebElement EnterStartMyTrial() {
	return driver.findElement(StartMyTrial);
}
}
