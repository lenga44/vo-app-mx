package models.components;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import models.screens.LoginScreen;
import org.openqa.selenium.By;

public class IntroComponent {
    private final AppiumDriver<MobileElement> appiumDriver;
    private final By loginBtnSel = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout" +
            "/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout" +
            "/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup" +
            "/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup" +
            "/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup" +
            "/android.view.ViewGroup/android.view.ViewGroup[6]/android.widget.TextView");
    private final By introScreenSel = MobileBy.id("com.earlystart.android.monkeyjunior:id/action_bar_root");
    public IntroComponent(AppiumDriver<MobileElement> appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    public void clickOnLoginBtn(){
        if(appiumDriver.findElement(introScreenSel).isDisplayed()) appiumDriver.findElement(loginBtnSel).click();

    }

}
