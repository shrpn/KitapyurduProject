package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.page.Login;
import org.junit.Test;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest(){
        Login login = new Login();
        login.login();
    }
}
