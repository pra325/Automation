package Dataprovider;



import com.excel.utility.Reader2;

import java.util.ArrayList;

public class Util {
     static Reader2 reader;

    public static ArrayList<Object[]> getdatafromexcel() {

        ArrayList<Object[]> myData = new ArrayList<Object[]>();
        try {

            reader = new Reader2("C:\\Users\\jimmy\\Desktop\\TestData.xlsx");
        }
        catch (Exception e){
            e.printStackTrace();

        }

        for (int rownum=2; rownum<= reader.getRowCount("sheet1");rownum++){
            String firstname= reader.getCellData("sheet1","firstname",rownum);
            String lastname= reader.getCellData("sheet1","lastname",rownum);
            String address1= reader.getCellData("sheet1","address1",rownum);
            String address2= reader.getCellData("sheet1","address2",rownum);
            String city= reader.getCellData("sheet1","city",rownum);
            String state= reader.getCellData("sheet1","state",rownum);
            String zipcode= reader.getCellData("sheet1","zipcode",rownum);
            String emailaddress= reader.getCellData("sheet1","emailaddress",rownum);
            Object obj[]={firstname,lastname,address1,address2,city,state,zipcode,emailaddress};
            myData.add(obj);
        }
        return myData;
    }
}
