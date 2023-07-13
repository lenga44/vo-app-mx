package testflows;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import models.screens.IntroScreen;

public class BaseFlow {
    protected final AppiumDriver<MobileElement> appiumDriver;

    public BaseFlow(AppiumDriver<MobileElement> appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

   public void goToLoginScreen(){
        new IntroScreen(appiumDriver).IntroComp().clickOnLoginBtn();
   }
}
