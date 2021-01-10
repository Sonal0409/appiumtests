package appiumScripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class SetupCheck {

@Parameters({"deviceName","Version","URL"})	
	
@Test(priority='1')
public void setup(String deviceName, String Version, String url) throws MalformedURLException
{
	// DesiredCapabilties are exisitng class in appium client
		// Jar files--> java classes and methods
	// create an object for this class	
		
	DesiredCapabilities	cap= new DesiredCapabilities();
	
    cap.setCapability("deviceName", deviceName);
	cap.setCapability("platformName", "Android");
	cap.setCapability("platformVersion", Version);
	cap.setCapability("appPackage", "com.example.android.apis");
	cap.setCapability("appActivity", "com.example.android.apis.ApiDemos");
		
	// we need to provide the path of Server to the script
	// http://127.0.0.1:4723/wd/hub
	
	AndroidDriver driver= new AndroidDriver(new URL(url),cap);
	
	
	// identify the elements of an application -- Locators/ address of element
	
	
	
	// Appium desktop--> Appium Inspector - will give us the element attributes on the application
	
	// Mobile Element attributes -- id, name, tag, clickable, input
	
	// perform action on those elements -- we will use appium methods to perform action on apelements
	
	
	// test step 1: click on preference
	
	driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
	
	// test step2 : click on  preference dependencies
	
	driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
	}

}
