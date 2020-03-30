import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;

public class register extends Driver {
    MobileElement mobileElement;

    @Step("Open Login Page")
    public void uygulamayiAc() {
        mobileElement = (MobileElement) appiumDriver.findElementByXPath("/hierarchy/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[4]\n");
        mobileElement.click();
    }

    @Step("Click Register Tab")
    public void clickRegisterTab() {
        mobileElement = (MobileElement) appiumDriver.findElementByXPath("//androidx.appcompat.app.ActionBar.b[@content-desc=\"Üye Ol\"]");
        mobileElement.click();
    }

    @Step("name <name>, surname <surname>, email <email>, passowrd <pass>, phone <phone>")
    public void register(String name, String surname, String email, String pass, String phone) {
        mobileElement = (MobileElement) appiumDriver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText");
        mobileElement.sendKeys(name);

        mobileElement = (MobileElement) appiumDriver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText");
        mobileElement.sendKeys(surname);

        mobileElement = (MobileElement) appiumDriver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.EditText");
        mobileElement.sendKeys(email);

        mobileElement = (MobileElement) appiumDriver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.EditText");
        mobileElement.sendKeys(pass);

        mobileElement = (MobileElement) appiumDriver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.LinearLayout[5]/android.widget.FrameLayout/android.widget.EditText");
        mobileElement.sendKeys(phone);
    }

    @Step("Submit!")
    public void submit() {
        mobileElement = (MobileElement) appiumDriver.findElementById("com.gittigidiyormobil:id/registerBtn");
        mobileElement.click();
    }
}