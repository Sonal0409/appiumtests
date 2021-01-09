package appiumScripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class MultiTouchActionTest {

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
	
	
	//1st finger action simulation
	
TouchAction t1= new TouchAction(driver).press(PointOption.point(580,790))
	.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
	.moveTo(PointOption.point(845,350)).release();
	
	
	//thumb action simulation
	
TouchAction t2= new TouchAction(driver).press(PointOption.point(410,1054))
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
		.moveTo(PointOption.point(180,1420)).release();
		
		
	MultiTouchAction mta= new MultiTouchAction(driver);
	
	mta.add(t1).add(t2).perform();
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	}

}
