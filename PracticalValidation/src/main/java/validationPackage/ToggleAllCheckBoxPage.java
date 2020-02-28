package validationPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class ToggleAllCheckBoxPage {

	WebDriver driver;
	
	
	
	public ToggleAllCheckBoxPage(WebDriver driver) {
		 this.driver = driver;}
		 
		 @FindBy (how=How.NAME, using = ("allbox"))
		 WebElement TOGGLE_ALL_CHECKBOX;
public void validateToggleBox() {
	
	boolean isEnabled = TOGGLE_ALL_CHECKBOX.isEnabled();
	if (isEnabled) {
		System.out.println("pass");
	}
	else {
		System.out.println("fail");
	}

}
		 
	}
	

