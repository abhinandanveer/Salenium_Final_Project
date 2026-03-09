package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.openqa.selenium.*;
import factory.DriverFactory;

import java.io.File;
import org.apache.commons.io.FileUtils;

public class TestListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {

        try {

            WebDriver driver = DriverFactory.getDriver();

            if(driver == null){
                System.out.println("Driver not available for screenshot");
                return;
            }

            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            String path = "screenshots/" + result.getName() + "_" + System.currentTimeMillis() + ".png";

            File dest = new File(path);

            dest.getParentFile().mkdirs();

            FileUtils.copyFile(src, dest);

            System.out.println("Screenshot saved: " + path);

        }
        catch(Exception e){
            e.printStackTrace();
        }

    }

}