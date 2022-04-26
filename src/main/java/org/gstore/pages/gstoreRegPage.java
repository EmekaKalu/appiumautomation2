package org.gstore.pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class gstoreRegPage {

    public gstoreRegPage(AndroidDriver<AndroidElement> driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(className = "android.widget.Spinner")
    public WebElement countryPicker;
    @AndroidFindBy(className = "android.widget.ListView")
    public WebElement country;
    @AndroidFindBy(className = "android.widget.EditText")
    public WebElement nameField;
    @AndroidFindBy(className = "android.widget.Button")
    public WebElement letgobtn;

    public By pick(){
        country.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setMaxSearchSwipes(31).scrollIntoView(text(\"Nigeria\"))")).click();
        return null;
    }

}

