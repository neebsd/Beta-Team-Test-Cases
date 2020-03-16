import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DesktopTests {
    public static void initiate(WebDriver driver){
        desktop_01(driver);
        desktop_02(driver);
        desktop_03(driver);
        desktop_04(driver);
    }

    public static void desktop_01(WebDriver driver){    //Testing drop down menu
        WebElement desktopDrop = driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]/a"));

        Actions action = new Actions(driver);
        action.moveToElement(desktopDrop).perform();    //Making mouse hover over menu
    }

    public static void desktop_02(WebDriver driver){    //Testing PC link
        driver.get("http://tutorialsninja.com/demo/index.php?route=common/home");   //Resetting back to home page
        WebElement PCLink = driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]/div/div/ul/li[1]/a"));

        Actions action = new Actions(driver);
        action.moveToElement(PCLink).click().perform();     //Clicking on link
    }

    public static void desktop_03(WebDriver driver){    //Testing Mac link
        driver.get("http://tutorialsninja.com/demo/index.php?route=common/home");   //Resetting back to home page
        WebElement PCLink = driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]/div/div/ul/li[2]/a"));

        Actions action = new Actions(driver);
        action.moveToElement(PCLink).click().perform();     //Clicking on link
    }

    public static void desktop_04(WebDriver driver){    //Testing show all link
        driver.get("http://tutorialsninja.com/demo/index.php?route=common/home");   //Resetting back to home page
        WebElement PCLink = driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]/div/a"));

        Actions action = new Actions(driver);
        action.moveToElement(PCLink).click().perform();     //Clicking on link
    }
}
