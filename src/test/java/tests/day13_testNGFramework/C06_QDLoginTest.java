package tests.day13_testNGFramework;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QDemyPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class C06_QDLoginTest {
    @Test(groups = {"smoke,mini regression1, regression"})
    public void test01(){
  //1- https://www.qualitydemy.com/
        //anasayfasina gidin

        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));


        //2- login linkine basin
        QDemyPage qDemyPage = new QDemyPage();
        qDemyPage.ılklogin.click();
        qDemyPage.cookies.click();
        // 3- Kullanıcı  emaili olarak valid  email girin
        qDemyPage.emailloginElementi.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));
        // 4 Kullanıcı  pasword olarak valid  email girin
       qDemyPage.paswordElementi.sendKeys(ConfigReader.getProperty("qdGecerliPasword"));
        // 4- Login butonuna basarak login olun
        ReusableMethods.bekle(2);
        qDemyPage.ikinciloginElementi.click();
        // 5- Basarili olarak giris yapil digini test edin

        System.out.println(qDemyPage.sonucYazıElementi.getText());


        Assert.assertTrue(qDemyPage.sonucYazıElementi.isDisplayed());


    }
}
