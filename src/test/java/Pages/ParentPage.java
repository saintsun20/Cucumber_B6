package Pages;

import Utilities.GWD;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ParentPage {

    WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(5));

    public void mySendKeys(WebElement element, String yazi){

            wait.until(ExpectedConditions.visibilityOf(element));
            scrollToElement(element);
            element.clear();
            element.sendKeys(yazi);
    }

    public void myClick(WebElement element){

        wait.until(ExpectedConditions.elementToBeClickable(element));
        scrollToElement(element);
        element.click();
    }

    public void scrollToElement(WebElement element){

        JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }
}


//Text e bir veri göndermek için
//gerekli olanlar
//
//-Görünür olana kadar bekle(wait)
//-Elemente kadar scroll yap (var ise)
//-içini temizle
//-veriyi gönder
//
//
//Button için neler yapılır
//
//-Clickable olana kadar bekle(wait)
//-Elemente kadar scroll yap
//-Click yap