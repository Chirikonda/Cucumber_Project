package factory;

import java.io.File;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Platform;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class BaseClass {
	static  WebDriver driver;
	 static Logger logger;
	public static Properties p;
	
	
	public static WebDriver initilizeBrowser() throws IOException {
		
		
	
		if(getProperties().getProperty("execution_env").equalsIgnoreCase("remote")) {
			DesiredCapabilities cp=new DesiredCapabilities();
			
			
			if(getProperties().getProperty("os").equalsIgnoreCase("windows")) {
				cp.setPlatform(Platform.WIN11);
			}
			else if(getProperties().getProperty("os").equalsIgnoreCase("mac")) {
				
				cp.setPlatform(Platform.MAC);
			}
			else {
				System.out.println("No matching OS..");
			}
			switch(getProperties().getProperty("browser").toLowerCase()) {
			case "chrome" :cp.setBrowserName("chrome");break;
			case "edge" :cp.setBrowserName("MicrosoftEdge");break;
			default :System.out.println("No matching Browser..");
			
			}
			 driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cp);
			}
		else if(getProperties().getProperty("execution_env").equalsIgnoreCase("local")) {
			switch(getProperties().getProperty("browser").toLowerCase()) {
			case "chrome":
				driver=new ChromeDriver();
				break;
			case "edge":
				driver=new EdgeDriver();
				break;
			default :
				System.out.println("No Matching browser");
				driver=null;
				
			
		}
	}
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		return driver;
	}
	public static WebDriver getDriver() {
		return driver;
	}
	public static Properties getProperties() throws IOException {
		FileReader file=new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties");
		p=new Properties();
		p.load(file);
		return p;
	}
	public static Logger getLogger() {
		logger=LogManager.getLogger();
		return logger;
	}
		
	
	
	public String randomstring() {
		String generatestring =RandomStringUtils.randomAlphabetic(5);
		return generatestring;
	}
	
	public String randomnumber() {
		String generatenum =RandomStringUtils.randomNumeric(10);
		return generatenum;
	}
	
	public String randomstringalphanum() {
		String str =RandomStringUtils.randomAlphabetic(3);
		String num =RandomStringUtils.randomNumeric(3);
		return (str+"@"+num);
	}
	

}
