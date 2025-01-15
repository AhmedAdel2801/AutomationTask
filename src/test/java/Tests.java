import Pages.P01_Login;
import Pages.P02_Home;
import com.shaft.driver.SHAFT;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Tests {
    SHAFT.GUI.WebDriver driver;
    SHAFT.TestData.JSON testData;
    @Test(description = "Navigate to product and add item with price less than 1000")
    public void addProduct(){
new P01_Login(driver).
        login((testData.getTestData("userName")),(testData.getTestData("password")))
        .productsNavigation()
        .addProduct()
        .verifyViewCartProducts();

    }

    @BeforeClass
    public void setUp(){
        driver=new SHAFT.GUI.WebDriver();
        driver.browser().navigateToURL("https://automationexercise.com/login");
        testData=new SHAFT.TestData.JSON(SHAFT.Properties.paths.testData() + "testData.json");
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
