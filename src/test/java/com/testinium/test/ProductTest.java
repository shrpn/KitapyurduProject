package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.page.Login;
import com.testinium.page.Product;
import org.junit.Test;

public class ProductTest extends BaseTest {

    @Test
    public void productTest(){
        Login login = new Login();
        Product product = new Product();

        login.login();
        product.selectProduct();
    }
}
