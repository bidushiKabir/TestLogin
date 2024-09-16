
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.fail;

public class LoginTest {
    WebDriver driver;

    @BeforeEach
    public void starter() {
        driver = new ChromeDriver();
    }

    @AfterEach
    public void quite() {
        driver.quit();
    }

    @Test
    public void webpageAccessible() {

        try {
            driver.get("http://localhost:8080/");
        } catch (Exception ex) {
            fail("Error");
        }

        try {
            WebElement loginHeader = driver.findElement(By.xpath("/html/body/div/h2"));
            String actual = loginHeader.getText();
            String target = "Login";
            Assertions.assertEquals(target, actual);
        } catch (Exception ex) {
            fail("can not login header");
        }

    }
}
