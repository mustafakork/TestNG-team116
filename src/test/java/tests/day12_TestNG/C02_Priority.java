package tests.day12_TestNG;

import org.testng.annotations.Test;
/*
JINİTTE HANGİ TEST ÖNCE çalışacağını öngöremeyiz

TestNG testleri natural  order(harf sırası) göre çalışır
eğer sırlamayı değiştirmek isterseniz test metodların priority atayabiliriz.
 */

public class C02_Priority {
    @Test
    public void  amazonTest(){
        System.out.println("Amazon");
    }

    @Test(priority = 2)
    public void youtubeTest(){
        System.out.println("youtube");
    }

    @Test(priority = 1)
    public  void wiseTest(){
        System.out.println("wise");

    }
}
