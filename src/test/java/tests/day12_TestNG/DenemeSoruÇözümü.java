package tests.day12_TestNG;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.ZeroPage;
import utilities.ConfigReader;
import utilities.Driver;

public class DenemeSoruÇözümü {

    @Test
    public void zeroTest() {

        // 1. “http://zero.webappsecurity.com/” Adresine gidin
        Driver.getDriver().get("http://zero.webappsecurity.com/");
        // 2. Sign in butonuna basin
        ZeroPage zeroPage =new ZeroPage();
        zeroPage.ilkSigninElementi.click();


        // 3. Login kutusuna “username” yazin
        zeroPage.loginusernamekutuElementi.sendKeys(ConfigReader.getProperty("loginKutusu"));

        // 4. Password kutusuna “password” yazin
            zeroPage.passwordElementi.sendKeys(ConfigReader.getProperty("passwordkutusu"));
        // 5. Sign in tusuna basin
        zeroPage.ikinciSigninElementi.click();

        Driver.getDriver().navigate().back();
        // 6. Online banking menusu icinde Pay Bills sayfasina gidin
        zeroPage.onlineBankingElementi.click();
        zeroPage.payBillElementi.click();

        // 7. “Purchase Foreign Currency” tusuna basin
        zeroPage.purchaseElementi.click();

    // 8. “Currency” drop down menusunden Eurozone’u secin
    Select select=new Select(zeroPage.dropdownElementi);
    select.selectByVisibleText("Eurozone (euro)");


    // 9. soft assert kullanarak "Eurozone (euro)

    // 10. soft assert kullanarak DropDown listesinin su secenekleri oldugunu test edin
    // "Select One", "Australia (dollar)", "Canada (dollar)","Switzerland (franc)","China
    // (yuan)","Denmark (krone)","Eurozone (euro)","Great Britain (pound)","Hong Kong
    // (dollar)","Japan (yen)","Mexico (peso)","Norway (krone)","New Zealand
    // (dollar)","Sweden (krona)","Singapore (dollar)","Thailand (baht)"
}}
