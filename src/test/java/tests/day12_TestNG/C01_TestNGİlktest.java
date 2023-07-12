package tests.day12_TestNG;

import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;

public class C01_TestNGİlktest {

    @Test

    public  void test01(){
        Driver.getDriver().get("https://amazon.com");

        ReusableMethods.bekle(5);

        Driver.closeDriver();
    }
    @Test
    public void test02(){
        //youtube anasayfasınna gidin

        Driver.getDriver().get("https://www.youtube.com");
        ReusableMethods.bekle(3);
        //Url yazdırın
        System.out.println(Driver.getDriver().getCurrentUrl());
        ReusableMethods.bekle(3);

        Driver.closeDriver();

    }



}
