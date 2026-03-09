package pages;

import factory.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PurchasePage {

public PurchasePage(){

PageFactory.initElements(DriverFactory.getDriver(), this);

}

@FindBy(id="inputName")
WebElement name;

@FindBy(id="address")
WebElement address;

@FindBy(id="city")
WebElement city;

@FindBy(id="state")
WebElement state;

@FindBy(id="zipCode")
WebElement zipCode;

@FindBy(id="cardType")
WebElement cardType;

@FindBy(id="creditCardNumber")
WebElement cardNumber;

@FindBy(id="nameOnCard")
WebElement cardName;

@FindBy(xpath="//input[@value='Purchase Flight']")
WebElement purchaseBtn;

public void enterName(String n){

name.sendKeys(n);

}

public void enterAddress(String addr){

address.sendKeys(addr);

}

public void enterCity(String c){

city.sendKeys(c);

}

public void enterState(String s){

state.sendKeys(s);

}

public void enterZipCode(String zip){

zipCode.sendKeys(zip);

}

public void selectCardType(String type){

Select dropdown = new Select(cardType);
dropdown.selectByVisibleText(type);

}

public void enterCardNumber(String number){

cardNumber.sendKeys(number);

}

public void enterCardName(String cname){

cardName.sendKeys(cname);

}

public void clickPurchase(){

purchaseBtn.click();

}

}