import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;

public class FirstWebTest {

    @Test
    public void shouldOpenGoogle() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com");
        WebElement header = driver.findElement(By.tagName("h1"));
        System.out.println("Заголовок страницы: " + header.getText());

        driver.quit();
    }
}