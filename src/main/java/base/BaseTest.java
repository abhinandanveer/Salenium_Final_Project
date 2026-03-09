package base;

import factory.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class BaseTest {

@BeforeMethod
public void setup() {

DriverFactory.initDriver("chrome");
DriverFactory.getDriver().get("https://blazedemo.com");

}

@AfterMethod
public void tearDown() {

WebDriver driver = DriverFactory.getDriver();

if(driver != null){
driver.quit();
}

}

public void waitTime(){

try{
Thread.sleep(3000);
}
catch(Exception e){
e.printStackTrace();
}

}

}