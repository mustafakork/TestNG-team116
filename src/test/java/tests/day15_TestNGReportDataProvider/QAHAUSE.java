package tests.day15_TestNGReportDataProvider;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class QAHAUSE {

    @Test
    public void qahause(){
        Driver.getDriver().get(ConfigReader.getProperty("qaheavenUrl"));

        //3. sayfa başlığının  url'nin https://qa.hauseheaven.com/ olduğu  doğrulanır
        String actualURL = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "qa.hauseheaven.com";
        Assert.assertTrue(actualURL.contains(expectedUrl));
        Assert.assertEquals(actualURL,expectedUrl);



    }
}
