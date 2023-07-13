package models.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import models.components.IntroComponent;

public class IntroScreen  {
    private final AppiumDriver<MobileElement> appiumDriver;

    public IntroScreen(AppiumDriver<MobileElement> appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    public IntroComponent IntroComp(){
        return new IntroComponent(appiumDriver);
    }
}
