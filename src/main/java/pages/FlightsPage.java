package pages;

import factory.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FlightsPage {

    WebDriver driver;

    public FlightsPage(){
        driver = DriverFactory.getDriver();
    }

    public void chooseFlight(int flightIndex){

        driver.findElement(
            By.xpath("(//input[@value='Choose This Flight'])[" + flightIndex + "]")
        ).click();

    }

}