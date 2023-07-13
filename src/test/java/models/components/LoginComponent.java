package models.components;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class LoginComponent {

    private final AppiumDriver<MobileElement> appiumDriver;
    private final By userSel = MobileBy.xpath("/hierarchy/android.widget.FrameLayout" +
            "/android.widget.LinearLayout/android.widget.FrameLayout" +
            "/android.widget.LinearLayout/android.widget.FrameLayout" +
            "/android.widget.FrameLayout/android.view.ViewGroup" +
            "/android.view.ViewGroup/android.view.ViewGroup" +
            "/android.view.ViewGroup/android.view.ViewGroup" +
            "/android.view.ViewGroup/android.view.ViewGroup" +
            "/android.view.ViewGroup/android.view.ViewGroup" +
            "/android.widget.ScrollView/android.view.ViewGroup" +
            "/android.view.ViewGroup[1]/android.widget.EditText");
    private final By passwordSel = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout" +
            "/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout" +
            "/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup" +
            "/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup" +
            "/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView" +
            "/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText");
    private final By loginBtnSel = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout" +
            "/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout" +
            "/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup" +
            "/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup" +
            "/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup" +
            "/android.view.ViewGroup[4]/android.view.ViewGroup/android.view.ViewGroup");
    public LoginComponent(AppiumDriver<MobileElement> appiumDriver1) {
        this.appiumDriver = appiumDriver1;
    }

    public void inputUser(String user) {
        if (!user.isEmpty()) {
            MobileElement userElemt = appiumDriver.findElement(userSel);
            userElemt.clear();
            userElemt.sendKeys(user);
        }
    }

    public void inputPassword(String password) {
        if(!password.isEmpty()) {
            MobileElement passwordElemt = appiumDriver.findElement(passwordSel);
            passwordElemt.clear();
            passwordElemt.sendKeys(password);
        }
    }

    public void clickOnLoginBtn() {
        appiumDriver.findElement(loginBtnSel).click();
    }
}
