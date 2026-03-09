package utilities;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.*;

public class ExcelUtils {

public static Object[][] getExcelData(String path, String sheetName){

Object[][] data = null;

try{

FileInputStream fis = new FileInputStream(path);

Workbook workbook = WorkbookFactory.create(fis);

Sheet sheet = workbook.getSheet(sheetName);

int rows = sheet.getPhysicalNumberOfRows();

int cols = sheet.getRow(0).getLastCellNum();

data = new Object[rows-1][cols];

DataFormatter formatter = new DataFormatter();

for(int i = 1; i < rows; i++){

for(int j = 0; j < cols; j++){

Cell cell = sheet.getRow(i).getCell(j);

data[i-1][j] = formatter.formatCellValue(cell);

}

}

workbook.close();

}catch(Exception e){

e.printStackTrace();

}

return data;

}

}