package testflows;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import models.components.LoginComponent;
import models.screens.LoginScreen;

public class LoginFlow extends BaseFlow {
    private String user;
    private String password;

    public LoginFlow(AppiumDriver<MobileElement> appiumDriver, String user, String password) {
        super(appiumDriver);
        this.user = user;
        this.password = password;
    }

    public void login(){
        LoginScreen loginScreen = new LoginScreen(appiumDriver);
        LoginComponent loginComp = loginScreen.loginComp();
        if (!user.isEmpty()) loginComp.inputUser(user);
        if (!password.isEmpty()) loginComp.inputPassword(password);
        loginComp.clickOnLoginBtn();
    }
}
