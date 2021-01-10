package appiumScripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class PerformancedataTest {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		

		
DesiredCapabilities	cap= new DesiredCapabilities();
		
	    cap.setCapability("deviceName", "443418ec");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "8.1.0");
		cap.setCapability("appPackage", "com.google.android.apps.maps");
		cap.setCapability("appActivity", "com.google.android.maps.MapsActivity");
			
		// we need to provide the path of Server to the script
		// http://127.0.0.1:4723/wd/hub
		
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
// tap at a location -->TouchAction--> tap
		
		TouchAction t= new TouchAction(driver);
		
	t.tap(PointOption.point(309,879)).perform();	
	
// longpress
	
	//t.longPress(PointOption.point(309, 879)).release().perform();
	
	t.longPress(PointOption.point(572,970))
	.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3))).release().perform();
	
	
	
	// getsupportedPerformncedatatypes()
	// 4 performnce datatypes are supported by appium
	// [cpuinfo, memoryinfo, batteryinfo, networkinfo]
	// getPerformnceData(cpu)
	
	
List<String> pl=	driver.getSupportedPerformanceDataTypes();
	
	System.out.println(pl);
	
	
	
	
	System.out.println(driver.getPerformanceData("com.google.android.apps.maps","memoryinfo",10));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	}

}
