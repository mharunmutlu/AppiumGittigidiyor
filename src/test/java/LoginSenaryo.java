import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;

public class LoginSenaryo extends Driver {
    MobileElement mobileElement;

    @Step("login sayfası açılır")
    public void uygulamayiAc() {
        mobileElement = (MobileElement) appiumDriver.findElementByXPath("/hierarchy/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[4]\n");
        mobileElement.click();
    }

    @Step("Kullanıcı adı <kAdi> ve Şifre <sifre> girilir")
    public void veriGirisi(String kAdi, String sifre) {
        mobileElement = (MobileElement) appiumDriver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText");
        mobileElement.sendKeys(kAdi);

        mobileElement = (MobileElement) appiumDriver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText");
        mobileElement.sendKeys(sifre);
    }

    @Step("Giriş yap butonuna tıkla")
    public void butonTikla() {
        mobileElement = (MobileElement) appiumDriver.findElementById("com.gittigidiyormobil:id/loginBtn");
        mobileElement.click();
    }
}

