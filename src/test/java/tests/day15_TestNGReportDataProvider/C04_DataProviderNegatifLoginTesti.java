package tests.day15_TestNGReportDataProvider;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AmazonPage;
import pages.QDemyPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C04_DataProviderNegatifLoginTesti extends TestBaseRapor {

    @DataProvider
    public static Object[][] kullanıcıListesi() {

        String[][] kullanıcıİsimŞifreleri= {{"sevda","12345"},
                                            {"mustafa", "12345"},
                                            {"ahmet","45789"}};
        return kullanıcıİsimŞifreleri;
    }

    @Test(dataProvider = "kullanıcıListesi")
    public void cokluNegatifLoginTesti(String kullanıcıadı,String pasword){
        extentTest=extentReports.createTest("Data provider","qdm test");

        //qualitydemy anasayfasına gidin
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        extentTest.info("qdm ana  sayfaya gider");


        //liste olarak verilen kullanıcı adı  ve şifreleri ile giriş yapılamadığını test edin

        //ilk login linkine tıklayın
        QDemyPage qDemyPage =new QDemyPage();
        qDemyPage.cookies.click();
        extentTest.info("cookies tıklar");
        qDemyPage.ılklogin.click();
        extentTest.info("login butonuna basar");
                qDemyPage.emailloginElementi.click();
                extentTest.info("kullanıcı" + kullanıcıadı+"email girer");
        //kullanıcı adı e şifresini yazıpgiriş yapmayı deneyin
        qDemyPage.emailloginElementi.sendKeys(kullanıcıadı);
        qDemyPage.paswordElementi.sendKeys(pasword);
        qDemyPage.ikinciloginElementi.click();

        // giriş yapılamadığını test edin
        Assert.assertTrue(qDemyPage.emailloginElementi.isDisplayed());
        extentTest.pass("sayfaya girilemediği test eder");

        //sayfayı kapatın
        Driver.closeDriver();


    }

}
