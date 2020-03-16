import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DesktopTests {
    public static void desktop_01(WebDriver driver){
        WebElement desktopDrop = driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]/a"));

        Actions action = new Actions(driver);
        action.moveToElement(desktopDrop).perform();
    }
}
