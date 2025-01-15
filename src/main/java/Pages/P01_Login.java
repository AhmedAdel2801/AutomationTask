package Pages;

import com.shaft.driver.SHAFT;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class P01_Login {
    SHAFT.GUI.WebDriver driver;
    public P01_Login(SHAFT.GUI.WebDriver driver)
    {
        this.driver=driver;
    }
    By userNameInput = By.xpath("//input[@data-qa=\"login-email\"]");
    By passInput = By.xpath("//input[@data-qa=\"login-password\"]");
    By loginButton = By.xpath("//button[@data-qa=\"login-button\"]");
@Step("Login with valid email and password")
    public P02_Home login(String userName, String password){
        driver.element().type(userNameInput,userName)
                .type(passInput,password)
                .click(loginButton);
    return new P02_Home(driver);
    }
}
