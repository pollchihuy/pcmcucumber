package coid.juaracoding.pcmcucumber.connection.driver;

import coid.juaracoding.pcmcucumber.connection.DriverStrategy;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Safari implements DriverStrategy {

	@Override
	public WebDriver setStrategy() {
		WebDriverManager.safaridriver().setup();
		WebDriver driver = new SafariDriver();
		
		return driver;
	}
}
