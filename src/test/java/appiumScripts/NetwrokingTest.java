package appiumScripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class NetwrokingTest {

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
		
		
		// getconnection(), is AirplanemodeEnabled()
		
		// check if airplane mode is enabled or not
		
		driver.openNotifications();
		
		// inspect the notification using inpector and click on any notifaction.
		
	boolean ap=	driver.getConnection().isAirplaneModeEnabled();  // false
		
		System.out.println("airplane mode is " +ap);
		
		driver.toggleAirplaneMode();  // ON
		
		/*boolean wi=driver.getConnection().isWiFiEnabled();
		
		if(wi==true)
		{
		driver.toggleWifi();
		}*/
		boolean wi1=driver.getConnection().isWiFiEnabled();
		if(wi1==true)
		{
		System.out.println("wifi is enabled");
		}
		else
			System.out.println("wifi is disabled");
		
boolean data=driver.getConnection().isDataEnabled();
		
		System.out.println(data);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
