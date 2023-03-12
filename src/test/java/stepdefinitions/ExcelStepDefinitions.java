package stepdefinitions;

import io.cucumber.java.en.When;
import pages.BlueRental_HomaPage;
import pages.BlueRental_LoginPage;
import utilities.Driver;
import utilities.ExcelUtils;
import utilities.ReusableMethods;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ExcelStepDefinitions {

    BlueRental_HomaPage blueRental_homaPage;
    BlueRental_LoginPage blueRental_loginPage;
    ExcelUtils excelUtils;
    List<Map<String,String>> excelDatas;
    @When("User logs in with {string}")
    public void userLogsInWith(String arg0) throws IOException {

        String path ="C:\\Users\\asus\\IdeaProjects\\Cucumber\\src\\test\\resources\\testData\\mysmoketestdata.xlsx";
        String sayfa = "customer_info";

        excelUtils = new ExcelUtils(path, sayfa);
        excelDatas = excelUtils.getDataList();

        // home page hit the Login Button
        for (Map<String, String> data : excelDatas) {

            blueRental_homaPage = new BlueRental_HomaPage();
            blueRental_loginPage = new BlueRental_LoginPage();
            blueRental_homaPage.LoginLink.click();
            ReusableMethods.waitFor(1);// 1 saniye bekle
            blueRental_loginPage.emailBox.sendKeys(data.get("username"));
            ReusableMethods.waitFor(1);
            blueRental_loginPage.passwordBox.sendKeys(data.get("password"));
            ReusableMethods.waitFor(1);
            blueRental_loginPage.loginButton.click();

            ReusableMethods.verifyElementDisplayed(blueRental_loginPage.loginButton);
            //Login is done
            ReusableMethods.getScreenshot("Ekran Görüntüsü");

            ReusableMethods.waitFor(1);
            blueRental_homaPage.userID.click();
            ReusableMethods.waitFor(1);
            blueRental_homaPage.LogOut.click();
            ReusableMethods.waitFor(1);
            blueRental_homaPage.OK.click();
        }
        Driver.closeDriver();

    }
}
