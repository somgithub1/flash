package test;



import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


import util.BrowserFactory;
import validationPackage.ToggleAllCheckBoxPage;

public class ToggleAllCheckBoxTest {

@Test
public void userShouldBeAbleToClickCheckBox() {
	WebDriver driver = BrowserFactory.startBrowser();
	ToggleAllCheckBoxPage validationPage= PageFactory.initElements(driver, ToggleAllCheckBoxPage.class);
	validationPage.validateToggleBox();
//driver.close();
//driver.quit();
}



}
