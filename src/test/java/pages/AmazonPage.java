package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {
    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
        //başka packagetaki clasların   bu constructuru kullanabilmesi için
        //access modifier public

        // bu page clasından locate kullanacak tüm classlar
        // AmazonPage clasından obje oluşturmalı
        //obje oluşturmak için  mutlaka constructır çalışacak
        //o zaman bu classda wedriverimizi tanımlama işini b constructor içinde yapabiliriz
    }

    @FindBy(id = "twotabsearchtextbox")
    public WebElement aramaKutusu;

    @FindBy(xpath = "//h1[@class='a-size-base s-desktop-toolbar a-text-normal']")
    public WebElement sonucYazıElementi;



}
