package models.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import models.components.LoginComponent;

public class LoginScreen {
    private final AppiumDriver<MobileElement> appiumDriver;

    public LoginScreen(AppiumDriver<MobileElement> appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    public LoginComponent loginComp(){
        return new LoginComponent(appiumDriver);
    }

}
