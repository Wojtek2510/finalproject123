package Data;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserAdressPages {
    public UserAdressPages(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/main/section/div/section/section/div[2]/a")
    private WebElement createAddressButton;
    public void clickCreateAddressButton(){
        createAddressButton.click();
        }
}
