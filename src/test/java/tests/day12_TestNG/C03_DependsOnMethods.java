package tests.day12_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class C03_DependsOnMethods {
    //amazon anasayfasına gidelim
    //
    //3 farklı test metodu oluşturup şu testleri yapın

    // 2- nutella aratıp sonucun nutella içerdiğini test edin
    // 3- ilk ürüne click yapıp açılan sayfadaki ürün isminin nutalla içerdiğini test edin

    @Test(priority = 1)
    public  void amazonUrlTest(){
       Driver.getDriver().get("https://www.amazon.com");
        // 1- url amazon içerdiğini test edin
       String  expectedUrl="amazon";
       String actualUrl = Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualUrl.contains(expectedUrl));

    }

    @Test(dependsOnMethods = "amazonUrlTest")
    public void nutellAramaTest(){
        // 2- nutella aratıp sonucun nutella içerdiğini test edin

        WebElement aramaKutusu = Driver.getDriver().findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("nutella"+ Keys.ENTER);

        WebElement aramaSonucElementi =Driver.getDriver().findElement(By.xpath("//h1[@class='a-size-base s-desktop-toolbar a-text-normal']"));
            String expectedSonucİçerik="nutella";
            String actualSonucİçerik = aramaSonucElementi.getText();

            Assert.assertTrue(actualSonucİçerik.contains(expectedSonucİçerik));


    }
@Test(dependsOnMethods = "nutellAramaTest")
    public void urunİsimTest(){
    // 3- ilk ürüne click yapıp açılan sayfadaki ürün isminin nutalla içerdiğini

Driver.getDriver()
        .findElement(By.xpath("//div[@class='a-section a-spacing-base']"))
        .click();


WebElement ilkürünİsim = Driver.getDriver().findElement(By.xpath("//span[@id='productTitle']"));

String expedtedilkürünİsim = "Nutella";
String actualİlkÜrünisim = ilkürünİsim.getText();

Assert.assertTrue(actualİlkÜrünisim.contains(expedtedilkürünİsim));
Driver.closeDriver();
}




}
