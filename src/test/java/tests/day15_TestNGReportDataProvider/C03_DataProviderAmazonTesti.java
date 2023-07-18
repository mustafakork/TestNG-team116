package tests.day15_TestNGReportDataProvider;

import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_DataProviderAmazonTesti {

    @DataProvider
    public static Object[][] AranacakUrunListesi() {
       //data provider notasyonuna sahip metodlar çift katlı aray
        //döndürmek zorundadır


        String[][] urunListesi={{"Nutella"},{"Cokokrem"},{"java"},{"Selenium"}};
        return urunListesi;
    }

    @Test(dataProvider = "AranacakUrunListesi")
    public void cokluAramaTesti(String aranacakurun) {

        //amazon anasayfasına gidin
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        //verilen listedki her bir ürün için ayrı ayrı
        //aramaypıpp, sonuçların o ürünü ,çerdiğini test edin
        //Nutella, çokokrem,Java,selenium, Apple, Samsung

        AmazonPage amazonPage =new AmazonPage();
        amazonPage.aramaKutusu.sendKeys(aranacakurun+ Keys.ENTER);

        Driver.closeDriver();


    }
}
