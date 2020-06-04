package Data;

import Login.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPages {
    private static WebDriver driver;

    public LoginPages(WebDriver driver) {

        LoginPages.driver = driver;
    }
    public void loginAs(String email, String password){
        WebElement loginInput = driver.findElement(By.name("email"));
        loginInput.click();
        loginInput.clear();
        loginInput.sendKeys(email);

        WebElement passwordInput = driver.findElement(By.name("password"));
        passwordInput.click();
        passwordInput.click();
        passwordInput.sendKeys(password);

        WebElement signInButton = driver.findElement(By.id("submint-login"));
        signInButton.click();
    }
}
