package dataproviders;

import org.testng.annotations.DataProvider;
import utilities.ExcelUtils;

public class TestDataProvider {

@DataProvider(name="flightData")
public Object[][] getFlightData(){

return ExcelUtils.getExcelData(
"src/test/resources/testdata/testdata.xlsx",
"Sheet1"
);

}

}