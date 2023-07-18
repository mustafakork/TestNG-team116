package tests.day13_testNGFramework;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QDemyPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class C06_QDLoginTest extends TestBaseRapor {
    @Test(groups = {"smoke,mini regression1, regression"})
    public void test01(){
  //1- https://www.qualitydemy.com/
        //anasayfasina gidin

        extentTest=extentReports.createTest("qualitydemyde Rporlu Test","qualityde  adımlar doğru yapıldı mı");

        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        extentTest.info("kullanıcı qualitydemy sayfasına gider");

        //2- login linkine basin
        QDemyPage qDemyPage = new QDemyPage();
        qDemyPage.ılklogin.click();
        extentTest.info("kullanıcı login linkine tıklar");
        qDemyPage.cookies.click();
        extentTest.info("kullanıcı cookies butonuna tıklar");
        // 3- Kullanıcı  emaili olarak valid  email girin
        qDemyPage.emailloginElementi.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));
        extentTest.info("Kullanıcı  emaili olarak valid  email girer");
        // 4 Kullanıcı  pasword olarak valid  password girin
       qDemyPage.paswordElementi.sendKeys(ConfigReader.getProperty("qdGecerliPasword"));
       extentTest.info("Kullanıcı  pasword olarak valid  password");
        // 4- Login butonuna basarak login olun
        ReusableMethods.bekle(2);
        extentTest.info("kullanıcı 2 saniye bekler");
        qDemyPage.ikinciloginElementi.click();

        // 5- Basarili olarak giris yapildigini test edin

        System.out.println(qDemyPage.sonucYazıElementi.getText());


        Assert.assertTrue(qDemyPage.sonucYazıElementi.isDisplayed());
        extentTest.pass("kullanıcıBasarili olarak giris yapildigini test eder ");

        Driver.closeDriver();
        extentTest.info("kullanıcı sayfayı kapatır");


    }
}
