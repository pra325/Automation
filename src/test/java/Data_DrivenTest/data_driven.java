package Data_DrivenTest;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;


public class data_driven {
    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream("C:\\Users\\jimmy\\Desktop\\Book1.xlsx");// for exel data
        XSSFWorkbook workbook = new XSSFWorkbook(file); // for workbook (book name )
        XSSFSheet sheet = workbook.getSheet("sheet1"); // or index (sheet 1 is excel sheet numeber which is in desktop
       // XSSFSheet sheet = workbook.getSheetAt(0); // providing sheet name in another way.which index starts from 0

      int rowcount =  sheet.getLastRowNum(); // for number in data sheet or number of row in sheet ,
      int colcount=  sheet.getRow(0).getLastCellNum(); //returns column or cell count
        for (int i=0; i<rowcount; i++) {
            // focus on first row and create the obj for sheet.getrow to keep entire row on variable.
          XSSFRow curentrow= sheet.getRow(i); // focus on the first ,current row. based on thr i value we get first row
            for (int j=0;j<colcount;j++) {
                String value = curentrow.getCell(j).toString(); // read the cell values which is in aviable in current row. read the value from a cell

                System.out.print(" " + value);
            }
            System.out.println();
            }
        }
    }

