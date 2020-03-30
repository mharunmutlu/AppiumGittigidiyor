import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.interactions.touch.TouchActions;

public class UrunSepeteEkleme extends Driver {
    MobileElement mobileElement;

    @Step("Kategorilere gidilir")
    public void kategoriGit() {
        mobileElement = (MobileElement) appiumDriver.findElementByXPath("/hierarchy/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]");
        mobileElement.click();
    }

    @Step("Bilgisayar kategorisi seçilir")
    public void kategoriSec() {
        mobileElement = (MobileElement) appiumDriver.findElementByXPath("/hierarchy/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[2]");
        mobileElement.click();
    }

    @Step("Diz üstü pc seç")
    public void dizUstuPcSec() {
        mobileElement = (MobileElement) appiumDriver.findElementByXPath("/hierarchy/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[1]");
        mobileElement.click();
    }

    @Step("Pc Seç")
    public void pcSec() {
        mobileElement = (MobileElement) appiumDriver.findElementByXPath("/hierarchy/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout");
        mobileElement.click();
    }

    @Step("Sepete Ekle")
    public void sepeteEkle() {
        mobileElement = (MobileElement) appiumDriver.findElementById("com.gittigidiyormobil:id/btnAddBasket");
        mobileElement.click();
    }

    @Step("Sepetime Git")
    public void sepeteGit() {
        mobileElement = (MobileElement) appiumDriver.findElementByXPath("/hierarchy/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[3]");

        //mobileElement = (MobileElement) appiumDriver.findElementByXPath("/hierarchy/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[3]");
        //mobileElement.click();
    }

    @Step("Adet seç")
    public void adetSec() {
        mobileElement = (MobileElement) appiumDriver.findElementById("com.gittigidiyormobil:id/spnAmountDownArrow");
        mobileElement.click();
    }

    @Step("2 Adet Seç")
    public void adetSayiSec() {
        mobileElement = (MobileElement) appiumDriver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.CheckedTextView[2]");
        mobileElement.click();
    }

    @Step("Sepeti sil")
    public void sepetiSil() {
        mobileElement = (MobileElement) appiumDriver.findElementById("com.gittigidiyormobil:id/txtDelete");
        mobileElement.click();

        mobileElement = (MobileElement) appiumDriver.findElementById("android:id/button1");
        mobileElement.click();
    }

    @Step("Çıkış")
    public void cikis() {
        mobileElement = (MobileElement) appiumDriver.findElementById("com.gittigidiyormobil:id/btnClose");
        mobileElement.click();

    }


}
