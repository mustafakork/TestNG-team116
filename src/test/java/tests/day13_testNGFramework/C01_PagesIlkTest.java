package tests.day13_testNGFramework;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class C01_PagesIlkTest {

    @Test
    public void amazonTest(){

        //amazon anasayfaya gidin
        //sonuçların nutella içerdiğini test edin
        //sayfayı kapatın
        Driver.getDriver().get("https://amazon.com");
        AmazonPage amazonPage =new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

    }
}
