package screens;

import io.appium.java_client.AppiumDriver;
import models.User;
import org.openqa.selenium.By;

public class SignupScreen {
    private AppiumDriver appiumDriver;

    // The signup screen contains several elements that will be represented as MobileElements.
    // The locators for these elements should be defined only once.
    By email = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText[1]");
    By password = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText[2]");
    By fullName = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText[3]");
    By signupBtn = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup");

    public SignupScreen(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    // The signup screen page allows the user to type email, password, fullname
    public HomeScreen signup(User client) {
        appiumDriver.findElement(email).sendKeys(client.getEmail());
        appiumDriver.findElement(password).sendKeys(client.getPassword());
        appiumDriver.findElement(fullName).sendKeys(client.getFullName());
        appiumDriver.findElement(signupBtn).click();

        // Return the HomeScreen as it navigates to HomeScreen on clicking signup.
        return new HomeScreen(appiumDriver);
    }
}