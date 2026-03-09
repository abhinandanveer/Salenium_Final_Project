package tests;

import base.BaseTest;
import dataproviders.TestDataProvider;
import pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FlightBookingTest extends BaseTest {

	@Test(
			dataProvider="flightData",
			dataProviderClass=TestDataProvider.class
			)

			public void bookFlight(

			String fromCity,
			String toCity,
			String flightIndex,
			String name,
			String address,
			String city,
			String state,
			String zip,
			String cardType,
			String cardNumber,
			String cardName,
			String expected

			){

			HomePage home = new HomePage();
			FlightsPage flights = new FlightsPage();
			PurchasePage purchase = new PurchasePage();
			ConfirmationPage confirm = new ConfirmationPage();

			home.selectCities(fromCity,toCity);
			home.clickFindFlights();

			waitTime();

			flights.chooseFlight(Integer.parseInt(flightIndex));

			waitTime();

			purchase.enterName(name);
			purchase.enterAddress(address);
			purchase.enterCity(city);
			purchase.enterState(state);
			purchase.enterZipCode(zip);
			purchase.selectCardType(cardType);
			purchase.enterCardNumber(cardNumber);
			purchase.enterCardName(cardName);

			purchase.clickPurchase();

			waitTime();

			String message = confirm.getConfirmation();

			if(expected.equalsIgnoreCase("PASS")){

			Assert.assertTrue(message.contains("Thank you"));

			}else{

			Assert.fail("Intentional failure");

			}

			}

}