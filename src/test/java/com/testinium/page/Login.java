package com.testinium.page;

import com.testinium.Methods.Methods;
import org.junit.Assert;
import org.openqa.selenium.By;

public class Login {
    Methods methods;

    public Login(){
        methods = new Methods();
    }

    public void login(){
        methods.click(By.cssSelector(".menu-top-button.login>a"));
        methods.waitBySeconds(1);
        methods.sendKeys(By.id("login-email"),"suhaonur.horpan@testinium.com");
        methods.waitBySeconds(1);
        methods.sendKeys(By.id("login-password"),"qwerty123");
        methods.waitBySeconds(1);
        methods.click(By.cssSelector(".ky-btn.ky-btn-orange.w-100.ky-login-btn"));
        methods.waitBySeconds(1);
        String result = methods.findElement(By.cssSelector(".section")).getText();
        Assert.assertTrue(result.contains("Hesabım"));
    }






}
