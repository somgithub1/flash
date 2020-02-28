package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import util.BrowserFactory;
import validationPackage.AllListItemsCheckBoxPage;

public class AllListItemsCheckBoxTest {

	
	@SuppressWarnings({ })
	@Test
	public void validateAllListItemsCheckBox() {
		
		WebDriver driver = BrowserFactory.startBrowser();
		PageFactory.initElements(driver, AllListItemsCheckBoxPage.class);
		
	}
}
