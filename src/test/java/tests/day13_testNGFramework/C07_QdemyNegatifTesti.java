package tests.day13_testNGFramework;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QDemyPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class C07_QdemyNegatifTesti {
   @Test
   public void gecersizPaswordTesti(){


    //1- https://www.qualitydemy.com/
    //anasayfasina gidin
    Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));

    //2- login linkine basin
       QDemyPage qDemyPage =new QDemyPage();
       qDemyPage.ılklogin.click();
       qDemyPage.cookies.click();
    // 3 farkli test method’u olusturun.
    // - gecerli username, gecersiz password

          qDemyPage.emailloginElementi.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));

          qDemyPage.paswordElementi.sendKeys(ConfigReader.getProperty("qdGecersizPasword"));
       ReusableMethods.bekle(2);
          qDemyPage.ikinciloginElementi.click();
          ReusableMethods.bekle(1);
      Assert.assertTrue(qDemyPage.emailloginElementi.isDisplayed());
      Driver.closeDriver();
      }
    @Test
    public void gecersizPaswordTesti2() {


        //1- https://www.qualitydemy.com/
        //anasayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));

        //2- login linkine basin
        QDemyPage qDemyPage = new QDemyPage();
        qDemyPage.ılklogin.click();
        ReusableMethods.bekle(1);
        qDemyPage.cookies.click();
        // - gecersiz username, gecerli password

        qDemyPage.emailloginElementi.sendKeys(ConfigReader.getProperty("qdGecersizUsername"));
        qDemyPage.paswordElementi.sendKeys(ConfigReader.getProperty("qdGecerliPasword"));
        qDemyPage.ikinciloginElementi.click();
        Assert.assertTrue(qDemyPage.emailloginElementi.isDisplayed());
        Driver.closeDriver();
    }
        @Test
        public void gecersizPaswordTesti3(){


            //1- https://www.qualitydemy.com/
            //anasayfasina gidin
            Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));

            //2- login linkine basin
            QDemyPage qDemyPage =new QDemyPage();
            ReusableMethods.bekle(1);
            qDemyPage.ılklogin.click();
            ReusableMethods.bekle(1);
            qDemyPage.cookies.click();
    // - gecersiz username, gecersiz password.
      qDemyPage.emailloginElementi.sendKeys(ConfigReader.getProperty("qdGecersizUsername"));
      qDemyPage.paswordElementi.sendKeys(ConfigReader.getProperty("qdGecersizPasword"));
    // 4- Login butonuna basarak login olun
      qDemyPage.ikinciloginElementi.click();
      ReusableMethods.bekle(1);
    // 5- Basarili olarak giris yapilamadigini test edin
Assert.assertTrue(qDemyPage.emailloginElementi.isDisplayed());
Driver.closeDriver();

}}
