package testpack;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class ApiDemos {
	

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

		// import DesiredCapabilties class in your current class, so as to use its method
		
		DesiredCapabilities cap= new DesiredCapabilities();
		
		cap.setCapability("deviceName", "SonalDec");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "6.0");
		cap.setCapability("appPackage", "com.example.android.apis");
		cap.setCapability("appActivity", "com.example.android.apis.ApiDemos");
		
		
		// Connect to the server
		
AndroidDriver<MobileElement> driver= new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);

// find the elements and perform an action on them
		
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		
		Thread.sleep(2000);
		// to find and click on preference dependencies
		
		driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		
		Thread.sleep(2000);
		//to find and click on the check box

		
		driver.findElementById("android:id/checkbox").click();
		
		Thread.sleep(3000);
		
		
		
		
	}

}



