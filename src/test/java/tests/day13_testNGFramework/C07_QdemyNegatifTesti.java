package tests.day13_testNGFramework;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QDemyPage;
import utilities.ConfigReader;
import utilities.Driver;

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
       qDemyPage.ikinciloginElementi.click();
      Assert.assertTrue(qDemyPage.sonucYazıElementi.isDisplayed());
      }
    /*@Test
    public void gecersizPaswordTesti2() {


        //1- https://www.qualitydemy.com/
        //anasayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));

        //2- login linkine basin
        QDemyPage qDemyPage = new QDemyPage();
        qDemyPage.ılklogin.click();
        // - gecersiz username, gecerli password

        qDemyPage.emailloginElementi.sendKeys(ConfigReader.getProperty("qdGecersizUsername"));
        qDemyPage.paswordElementi.sendKeys(ConfigReader.getProperty("Nevzat152032"));
    }
        @Test
        public void gecersizPaswordTesti3(){


            //1- https://www.qualitydemy.com/
            //anasayfasina gidin
            Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));

            //2- login linkine basin
            QDemyPage qDemyPage =new QDemyPage();
            qDemyPage.ılklogin.click();
    // - gecersiz username, gecersiz password.
      qDemyPage.emailloginElementi.sendKeys(ConfigReader.getProperty("qdGecersizUsername"));
      qDemyPage.paswordElementi.sendKeys(ConfigReader.getProperty("qdGecersizPasword"));
    // 4- Login butonuna basarak login olun
      qDemyPage.ikinciloginElementi.click();
    // 5- Basarili olarak giris yapilamadigini test edin

     */
}
