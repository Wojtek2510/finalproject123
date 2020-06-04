package Data;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddressesPages {
    private static WebDriver driver;

    public AddressesPages(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(name = "alias")
    private WebElement aliasInput;
    @FindBy(name = "address")
    private WebElement addressInput;
    @FindBy(name="city")
    private WebElement cityInput;
    @FindBy(name="postCode")
    private WebElement postCodeInput;
    @FindBy(name="country")
    private WebElement countryInput;
    @FindBy(name="phone")
    private WebElement phoneInput;
    @FindBy(name="id_country")
    private WebElement roleDropCountry;
    @FindBy(css=".btn.btn-primary.float-xs-right")
    private WebElement saveButton;

    public void setAlias(String alias){
        aliasInput.click();
        aliasInput.clear();
        aliasInput.sendKeys();
    }
    public void setAddress(String address){
        addressInput.click();
        addressInput.clear();
        addressInput.sendKeys();
    }

    public void setCity(String city){
        cityInput.click();
        cityInput.clear();
        cityInput.sendKeys();
    }
    public void setPostCode(String postCode){
        postCodeInput.click();
        postCodeInput.clear();
        postCodeInput.sendKeys();
    }
    public void setRoleDropCountry(String country){
        Select contryDrop = new Select(roleDropCountry);
        contryDrop.selectByVisibleText(country);
    }
    public void setPhoneInput(String phone){
        phoneInput.click();
        phoneInput.clear();
        phoneInput.sendKeys(phone);
    }
    public void clickSaveButton(){
        saveButton.click();
    }
    public String getAliasCheack(){
        return aliasInput.getAttribute("value");
    }
    public String getAddressCheack(){
        return addressInput.getAttribute("value");
    }
    public String getCityCheack(){
        return cityInput.getAttribute("value");
    }
    public String getPostCodeCheack(){
        return postCodeInput.getAttribute("value");
    }
    public String getCounteryCheak(){
        return roleDropCountry.getAttribute("value");
    }
    public String getPhoneCheack(){
        return phoneInput.getAttribute("value");
    }

    public void clickCreateAddressButton() {
    }
}
