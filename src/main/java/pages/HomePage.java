package pages;

import factory.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

public HomePage(){

PageFactory.initElements(DriverFactory.getDriver(),this);

}

@FindBy(name="fromPort")
WebElement fromCity;

@FindBy(name="toPort")
WebElement toCity;

@FindBy(css="input[type='submit']")
WebElement findFlightsBtn;

public void selectCities(String from,String to){

Select fromSelect = new Select(fromCity);
fromSelect.selectByVisibleText(from);

Select toSelect = new Select(toCity);
toSelect.selectByVisibleText(to);

}

public void clickFindFlights(){

findFlightsBtn.click();

}

}