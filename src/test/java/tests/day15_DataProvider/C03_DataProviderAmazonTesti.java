package tests.day15_DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class C03_DataProviderAmazonTesti {

    @DataProvider
    public static Object[][] AranacakUrunListesi() {
       //data provider notasyonuna sahip metodlar çift katlı aray
        //döndürmek zorundadır
        String[][] urunListesi={{"Nutella"},{"Cokokrem"},{"java"},{"Selenium"}};
        return urunListesi;
    }

    @Test(dataProvider = "AranacakUrunListesi")
    public void cokluAramaTesti() {


    }
}
