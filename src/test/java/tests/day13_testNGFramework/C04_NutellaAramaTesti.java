package tests.day13_testNGFramework;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C04_NutellaAramaTesti {

    @Test
    public void test01(){

        //amazon sayfasına gidin
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        //NUTELLA İÇİN ARAMA YAPIN
        AmazonPage amazonPage =new AmazonPage();
        amazonPage.aramaKutusu.sendKeys(ConfigReader.getProperty("amazonArananKelime")+Keys.ENTER);

        //sonuçların nutella içerdiini test edin
        String expectedIcerik = "Nutella";
        String actualIcerik =amazonPage.sonucYazıElementi.getText();

        Assert.assertTrue(actualIcerik.contains(expectedIcerik));

        //sayfayı kaptın
        Driver.closeDriver();



    }
}
