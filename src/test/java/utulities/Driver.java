package utulities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Driver {

    public static WebDriver driver;

    public  static WebDriver getDriver(){
        /*
        Bundan sonra daha önce driver olarak TestBase'DEN KULLANDIĞIMIZ
        WebDriver'in yerine Driver classından getDriver() kullanacağız ancak

        driver =new ChromeDriver();

        mahşerin dört atlısındakullandığımız problem oluşturuyor çünkü her
        çalıştığında yeniden WebDriver oluşturuyor.
         bizim istediğimiz şu:
         Test çalışmaya başladığnda
         ilk kez bu method'u kullanınca chrome Driver oluştursun sonrakilerde
         oluşturmasın

bunun içim driver==null kontrol edip ona göre yeni
chromeDriver ataması yapıyoruz

         */
        WebDriverManager.chromedriver().setup();

        if (driver==null)

        driver =new ChromeDriver();


        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

       return  driver;
       }

       public static void closeDriver(){
        if (driver!=null)
        driver.close();
        driver=null;

       }
}
