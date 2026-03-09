package utilities;

import factory.DriverFactory;
import org.openqa.selenium.*;
import java.io.File;
import org.apache.commons.io.FileUtils;

public class ScreenshotUtil {

public static void capture(String testName){

try{

WebDriver driver = DriverFactory.getDriver();

if(driver == null){
System.out.println("Driver not available for screenshot");
return;
}

File src = ((TakesScreenshot)driver)
.getScreenshotAs(OutputType.FILE);

String path = "screenshots/" + testName + "_" +
System.currentTimeMillis() + ".png";

File dest = new File(path);

dest.getParentFile().mkdirs();

FileUtils.copyFile(src,dest);

System.out.println("Screenshot saved: " + path);

}catch(Exception e){

e.printStackTrace();

}

}

}