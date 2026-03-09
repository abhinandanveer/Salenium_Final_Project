package pages;

import factory.DriverFactory;
import org.openqa.selenium.By;

public class ConfirmationPage {

public String getConfirmation(){

return DriverFactory.getDriver()
.findElement(By.tagName("h1"))
.getText();

}

}