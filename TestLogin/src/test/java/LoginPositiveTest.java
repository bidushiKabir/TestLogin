import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.fail;

public class LoginPositiveTest {
    WebDriver driver;
    String url;

    @BeforeEach
    public void starter() {
        driver = new ChromeDriver();
        url = "http://localhost:8080/";
    }

    @AfterEach
    public void quite() {
        driver.quit();
    }


    @Test
    public void validInputTest() {
        try {
            driver.get(url);
        } catch (Exception ex) {
            fail("can not access " + url);
        }

    }
}
