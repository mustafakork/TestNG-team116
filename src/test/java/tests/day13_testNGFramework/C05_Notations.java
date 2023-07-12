package tests.day13_testNGFramework;

import org.testng.annotations.*;

public class C05_Notations {


    @BeforeSuite
    public void setupSuite(){
        System.out.println("Before Suit çaşıltı");
 }
    @AfterSuite
    public void teardownSuite() {
        System.out.println("After Suit çaşıltı");
    }

    @BeforeTest
    public void setupTest(){
        System.out.println("Before test çalıştı");

    }
    @AfterTest
    public void teardownTest() {
        System.out.println("After Test çalıştı");
    }
    @BeforeClass
    public void setupClass(){
        System.out.println("Before Class çalıştı");

    }
    @AfterClass
    public void teardownclass() {
        System.out.println("After Class çalıştı");
    }
    @BeforeMethod
    public void setupMethod(){
        System.out.println("Before Method çalıştı");

    }
    @AfterMethod
    public void teardownMethod() {
        System.out.println("After Method çalıştı");
    }
    @Test
    public void test01(){
        System.out.println("test01 çalıştı");
    }
    @Test
    public void test02(){
        System.out.println("test02 çalıştı");
    }





}
