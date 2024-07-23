package coid.juaracoding.pcmcucumber.connection.driver;

import coid.juaracoding.pcmcucumber.connection.DriverStrategy;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

	public class Edge implements DriverStrategy {
		@Override
		public WebDriver setStrategy() {
			WebDriverManager.edgedriver().setup();
			WebDriver driver = new EdgeDriver();
			return driver;
		}
	}