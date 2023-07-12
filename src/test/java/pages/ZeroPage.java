package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ZeroPage {
    public  ZeroPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//button[@id='signin_button']")
    public WebElement ilkSigninElementi;

    @FindBy(xpath = "//input[@id='user_login']")
    public WebElement loginusernamekutuElementi;

    @FindBy(xpath = "//input[@id='user_password']")
    public WebElement passwordElementi;

    @FindBy(xpath = "//input[@name='submit']")
    public WebElement ikinciSigninElementi;

    @FindBy(xpath = "//strong[text()='Online Banking']")
    public WebElement onlineBankingElementi;

    @FindBy(xpath = "//span[@id='pay_bills_link']")
    public WebElement payBillElementi;

    @FindBy(xpath = "//a[text()='Purchase Foreign Currency']")
    public WebElement purchaseElementi;

    @FindBy(xpath = "//select[@id='pc_currency']")
    public WebElement dropdownElementi;






}
