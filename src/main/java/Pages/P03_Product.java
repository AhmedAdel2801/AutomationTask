package Pages;

import com.shaft.driver.SHAFT;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P03_Product {
    SHAFT.GUI.WebDriver driver;
    public P03_Product(SHAFT.GUI.WebDriver driver)
    {
        this.driver=driver;
    }
    By productsCard=By.xpath("//div[@class=\"productinfo text-center\"]");
    By continueShoppingButton =By.xpath("(//button[@class=\"btn btn-success close-modal btn-block\"])");
    By viewCartButton = By.xpath("(//a[@href=\"/view_cart\"])[1]");


    @Step("Add products with price less than 1000")

    public P03_Product addProduct(){
        List<WebElement> products = driver.getDriver().findElements(productsCard);
        try {
            for (int i = 0; i < products.size(); i++) {
                int productPrice= Integer.parseInt(driver.getDriver().findElement
                        (By.xpath("(//div[@class=\"productinfo text-center\"]/h2)["+ (i + 1) +"]"))
                        .getText().replaceAll("[^0-9]",""));
                System.out.println("Product Price is:   " +(i + 1));
                if(productPrice<1000){
                    driver.element().click
                                    (By.xpath("(//div[@class=\"productinfo text-center\"])["+ (i + 1) + "]/a"))
                            .click(continueShoppingButton);
                    System.out.println("Added Product Price  "+productPrice+"To The Cart");
                }
            }
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }
        return this;
    }
    @Step("Verify view cart products")
    public void verifyViewCartProducts(){
        driver.element().scrollToElement(viewCartButton).click(viewCartButton).and().browser().captureScreenshot();

    }
}
