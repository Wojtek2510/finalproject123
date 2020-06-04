package fill;

import Data.AddressesPages;
import Data.UserAdressPages;
import Login.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {
    private WebDriver driver;
    private LoginPage loginPages;
    private AddressesPages addressesPage;
    private UserAdressPages userAdressPages;

    @Given("^Login with early createt user$")
    public void anopenbrowserandgotoPrestasho() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://prod-kurs.coderslab.pl/index.php");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginAs("kjesse@bionagneu.tk","123456");
        Assert.assertEquals("Sherlock Holmes", loginPage.getLoggedUserName());
    }
    @When("^In User profile add new adress$")
    public void userGoesToNewAddressPage(){
        UserAdressPages yourAddressPages = new UserAdressPages(driver);
        addressesPage.clickCreateAddressButton();
    }
    @And("^Add user Information (.*), (.*), (.*), (.*), (.*), (.*)$")
    public void userEnterAliasAddressCityPostCodeCountryPhoneOnYourAccountPage
            (String alias, String address, String city, String postCode, String countery, String phone){

        this.addressesPage = new AddressesPages(driver);
        addressesPage.setAlias(alias);
        Assert.assertEquals("Sherlock", addressesPage.getAliasCheack());

        addressesPage.setAddress(address);
        Assert.assertEquals("Holmes", addressesPage.getAddressCheack());

        addressesPage.setCity(city);
        Assert.assertEquals("London", addressesPage.getCityCheack());

        addressesPage.setPostCode(postCode);
        Assert.assertEquals("W1U-8ED", addressesPage.getPostCodeCheack());

        //addressesPage.roleDropCountry(country);
        //Assert.assertArrayEquals("United Kingdom", addressesPage.getCounteryCheak());

        addressesPage.setPhoneInput(phone);
        Assert.assertEquals("+44 555 555 555", addressesPage.getPhoneCheack());
    }
    @Then("User delete earlier adress$")
    public void deleteAddress(){
        WebElement delateAddress = driver.findElement(By.xpath("//*[@od=\"address-3586\"]/div[2]/a[2]"));
        delateAddress.click();
    }
    @And("^Close browser$")
    public void tearDown(){
        driver.quit();
    }
}
