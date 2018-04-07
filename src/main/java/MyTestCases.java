import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyTestCases {

    private WebDriver driver;

    @BeforeMethod
    public void start() {

        driver = new ChromeDriver();

        driver.get("https://demo1-ru.webasyst.com/");


    }

    @AfterMethod
    public void quit(){

        driver.quit();
    }

    @Test
    public void CheckWorckOfSystemSearch (){

        WebElement inputField = driver.findElement(By.name("query"));
        inputField.sendKeys("\n");

    }

    @Test
    public void LongString(){

        WebElement inputField = driver.findElement(By.name("query"));
        inputField.sendKeys("wbevowbvoiwbvoiwvboiwbviowbviowbvoiwbvoiwebviowboiwebvoiwbowievbowibwoievboiwvbwoivbweoivbwoivbweoibwovibwevoibwevoiwebvoiwbvoiwvboiwbveoibvwoiebvoiwvbwebvoiwbvwoievboiwevboiwvboiwevbwoivbweiovbwoivbweiov" + "\n");

    }

    @Test
    public void brokenLogin(){

        WebElement loginButton = driver.findElement(By.className("not-visited"));
        loginButton.click();

        WebElement fieldLogin = driver.findElement(By.name("login"));
        fieldLogin.sendKeys("Jorick");

        WebElement fieldPassword = driver.findElement(By.name("password"));
        fieldPassword.sendKeys("jorick97");

        WebElement button = driver.findElement(By.xpath("//input[@value = 'Войти']"));
        button.click();
    }
}
