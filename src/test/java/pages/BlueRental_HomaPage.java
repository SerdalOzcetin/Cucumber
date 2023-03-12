package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BlueRental_HomaPage {
    public BlueRental_HomaPage() {
        // PageFactory seleniumdan gelen ve bu sayfa elementlerini intantiate etmek icin kullanili

        // Sayfa objeleri cagrildiginda null pointer exception alinmaz
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(partialLinkText = "Login")
    public WebElement LoginLink;

    @FindBy(id = "dropdown-basic-button")
    public WebElement userID;

    @FindBy(linkText = "Logout")
    public WebElement LogOut;

    @FindBy(xpath = "//button[.='OK']")
    public WebElement OK;


}
