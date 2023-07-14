package tests.day14_testNGframework_xmlFiles;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_TestNgAssertion {
    @Test
    public void nutellaTesti(){
        //amazona gidin
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        //titlenin best içermediğini  test edin
        String unexpectedTitle ="best";
        String  actualTitle = Driver.getDriver().getTitle();

        Assert.assertFalse(actualTitle.contains(unexpectedTitle),"Title'da istenmeyen içerik var");

        //Urlnin    "https://www.amazon.com/" olduğunu test edin

        String expectedUrl = "https://www.amazon.com/";
        String actualUrl = Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(actualUrl,expectedUrl,"Urlden bekleneneden farklı");


        //nutella aratın
        AmazonPage amazonPage =new AmazonPage();

        amazonPage.aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

        //arama sonuçlarını Nutalla içerdiğini test edin

        String expectedNutellaIcerik="Nutella";
        String actualsonucNutella =amazonPage.sonucYazıElementi.getText();

        Assert.assertTrue(actualsonucNutella.contains(expectedNutellaIcerik), "arama sonucu Nutelal içermiyor");



    }
}
