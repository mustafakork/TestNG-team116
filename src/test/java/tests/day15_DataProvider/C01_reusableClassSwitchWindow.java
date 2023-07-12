package tests.day15_DataProvider;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utulities.Driver;
import utulities.ReusableMethods;

public class C01_reusableClassSwitchWindow {

    @Test
    public void switchWindowTesti(){
        //https://the-internet.herokuapp.com/windows adresine gidin.
        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");
//Click Here butonuna basın.
        Driver.getDriver().findElement(By.xpath("//a[text()='Click Here']")).click();
//Acilan yeni pencerenin sayfa başlığının (title) "New Window" oldugunu dogrulayin.
        ReusableMethods.switchToWindow("New Window");

        String expectedTitle="New Window";


// sayfalari kapatin




    }
}
