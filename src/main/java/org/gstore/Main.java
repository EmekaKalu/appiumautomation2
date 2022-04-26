package org.gstore;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.gstore.pages.gstoreProductPage;
import org.gstore.pages.gstoreRegPage;

import java.net.MalformedURLException;

public class Main extends dcap{
    public static void main(String[] args) throws MalformedURLException {

        //This function calls the desired capabilities to the main method
        AndroidDriver<AndroidElement> driver = capabilities();
        //WebDriverWait wait = new WebDriverWait(driver, 30);
        gstoreRegPage regPage = new gstoreRegPage(driver);
        gstoreProductPage productPage = new gstoreProductPage(driver);

        regPage.countryPicker.click();
        regPage.pick();
        regPage.nameField.sendKeys("Emeka Kalu");
        regPage.letgobtn.click();

        productPage.addToCart.click();
        productPage.cartBtn.click();
    }
}