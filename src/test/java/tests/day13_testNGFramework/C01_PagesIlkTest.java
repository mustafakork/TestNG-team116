package tests.day13_testNGFramework;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class C01_PagesIlkTest {

    @Test(groups = "mini regression1")
    public void amazonTest(){

        //amazon anasayfaya gidin

        Driver.getDriver().get("https://amazon.com");

        //nutella için aran yapın
        AmazonPage amazonPage =new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);
//sonuçların nutella içerdiğini test edin
        String expectedIcerik ="Nutella";
        String actualIcerik = amazonPage.sonucYazıElementi.getText();

        Assert.assertTrue(actualIcerik.contains(expectedIcerik));

        //sayfayı kapatın
        ReusableMethods.bekle(1);
        Driver.closeDriver();

    }
}
