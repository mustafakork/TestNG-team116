package tests.day15_DataProvider;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_RaporluNutellaTesti {

    @Test
    public void raporluTest(){

        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        AmazonPage amazonPage =new AmazonPage();

        amazonPage.aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);




    }





}
