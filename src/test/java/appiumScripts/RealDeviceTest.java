package appiumScripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class RealDeviceTest {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities	cap= new DesiredCapabilities();
		
	    cap.setCapability("deviceName", "443418ec");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "8.1.0");
		cap.setCapability("appPackage", "com.github.axet.android.apis");
		cap.setCapability("appActivity", "com.github.axet.android.apis.ApiDemos");
			
		// we need to provide the path of Server to the script
		// http://127.0.0.1:4723/wd/hub
		
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
		
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
