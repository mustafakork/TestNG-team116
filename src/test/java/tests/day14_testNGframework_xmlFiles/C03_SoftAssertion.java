package tests.day14_testNGframework_xmlFiles;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_SoftAssertion {

    @Test
    public void nutellaTesti(){
        //amazona gidin

        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

    //1-Soft assert kullanmak için obje oluşturmalı
        SoftAssert softAssert =new SoftAssert();
        //2- istediğimiz tüm testleri softSSERT Objesini kulalnarak yapın
        //titlenin best içermediğini  test edin
String unexpectedIcerik ="Amazon";
String actualTitle = Driver.getDriver().getTitle();

softAssert.assertFalse(actualTitle.contains(unexpectedIcerik),"title istenmeyen içerik barındırıyor,");
        //Urlnin    "https://www.amazon.com/" olduğunu test edin
        String expectedUrl = "https://www.amazon.com";
        String actualUrl = Driver.getDriver().getCurrentUrl();

        softAssert.assertEquals(actualUrl,expectedUrl,"Url beklenen içerik barındırmıyor");

        //nutella aratın
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("kutella"+ Keys.ENTER);

                //arama sonuçlarını Nutalla içerdiğini test edin
        String expectedNutellaIcerik="Nutella";
        String actualsonucNutella =amazonPage.sonucYazıElementi.getText();
softAssert.assertTrue(actualsonucNutella.contains(expectedNutellaIcerik),"sonuçlar nutalla içermiyor");

//3-tüm  testlerimiz bittiğinde
        //soft assert objesinin not aldığı hataları raporlamasını isteyelim

        softAssert.assertAll();
        Driver.closeDriver();


    }}
