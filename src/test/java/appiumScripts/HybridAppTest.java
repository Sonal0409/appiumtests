package appiumScripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class HybridAppTest {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		
DesiredCapabilities	cap= new DesiredCapabilities();
		
	    cap.setCapability("deviceName", "443418ec");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "8.1.0");
		cap.setCapability("appPackage", "com.android.chrome");
		cap.setCapability("appActivity", "com.google.android.apps.chrome.IntentDispatcher");
		cap.setCapability("chromedriverExecutable","C:\\Users\\vishal mittal\\Downloads\\chromedriver_win32 (17)\\chromedriver.exe");
		cap.setCapability("browserName", "chrome");
		// we need to provide the path of Server to the script
		// http://127.0.0.1:4723/wd/hub
		
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
	
		driver.findElementByXPath("//android.widget.TextView[@text='Wikipedia']").click();
		
	Set<String> cns=driver.getContextHandles();
		
	System.out.println(cns +"\n\n");
	
		// we have to switch betwen the views
	
	driver.context("WEBVIEW_chrome");
	
	Thread.sleep(3000);
		
	driver.findElementByXPath("//button[@type='submit']").click();
	
	Thread.sleep(2000);
	
	driver.findElementByXPath("//input[@class='search']").sendKeys("appium");
	
	driver.pressKey(new KeyEvent(AndroidKey.ENTER));
	
	driver.context("NATIVE_APP");
	
	Thread.sleep(3000);
	
	driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"More options\"]").click();
	
	
	driver.findElementByAccessibilityId("History").click();
	
	
	Thread.sleep(3000);
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
