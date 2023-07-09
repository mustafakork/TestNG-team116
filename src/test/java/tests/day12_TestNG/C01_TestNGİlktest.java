package tests.day12_TestNG;

import org.testng.annotations.Test;
import utulities.Driver;
import utulities.ReusableMethods;

public class C01_TestNGİlktest {

    @Test

    public  void test01(){
        Driver.getDriver().get("https://amazon.com");

        ReusableMethods.bekle(5);

        Driver.closeDriver();






    }
}
