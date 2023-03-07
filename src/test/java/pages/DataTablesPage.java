package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DataTablesPage {
    public DataTablesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[@class='dt-button buttons-create']")
    public WebElement NewButton;

    @FindBy(id = "DTE_Field_first_name")
    public WebElement FirstName;

    @FindBy(id = "DTE_Field_last_name")
    public WebElement LastName;

    @FindBy(id = "DTE_Field_position")
    public WebElement Position;

    @FindBy(id = "DTE_Field_extn")
    public WebElement Extension;

    @FindBy(id = "DTE_Field_start_date")
    public WebElement StartDate;

    @FindBy(id = "DTE_Field_salary")
    public WebElement Salary;

    @FindBy(xpath = "//button[@class='btn']")
    public WebElement CreateButton;

    @FindBy(id = "DTE_Field_office")
    public WebElement Office;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement SearchBox;

    @FindBy(xpath = "//tbody//tr[1]//td[2]")
    public WebElement verifyName;

}
