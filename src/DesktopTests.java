import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DesktopTests {
    public static void initiate(WebDriver driver){
        desktop_01(driver);
        desktop_02(driver);
    }

    public static void desktop_01(WebDriver driver){
        WebElement desktopDrop = driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]/a"));   //Finding the desktop menu

        Actions action = new Actions(driver);
        action.moveToElement(desktopDrop).perform();    //Making mouse hover over menu
    }

    public static void desktop_02(WebDriver driver){
        WebElement PCLink = driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]/div/div/ul/li[1]/a"));   //Finding PC link

        Actions action = new Actions(driver);
        action.moveToElement(PCLink).click().perform();     //Clicking on link
    }
}
