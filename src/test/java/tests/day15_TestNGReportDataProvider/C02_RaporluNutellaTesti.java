package tests.day15_TestNGReportDataProvider;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C02_RaporluNutellaTesti extends TestBaseRapor {

    @Test
    public void raporluTest(){

        extentTest=extentReports.createTest("Raporlu Nutelalla Arama","Kullanıcı Amazonda nutella araybilmeli");

        //amazona gidin
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        extentTest.info("Kullanıcı amazon anasayfaya gider");

//nutella için arama yapın
        AmazonPage amazonPage =new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("Kutella"+ Keys.ENTER);
    extentTest.info("kullanıcı aramakurusundan nutalla aratır");

        //sonuçların nutella olduğunu test edein

        String expectedIçerik = "Nutella";
        String actulıcerik = amazonPage.sonucYazıElementi.getText();

        Assert.assertTrue(actulıcerik.contains(expectedIçerik));
        extentTest.pass("Sonuçların Nutella içerdiğini test eder");

//sayfayı kapatın
        Driver.closeDriver();


    }





}
