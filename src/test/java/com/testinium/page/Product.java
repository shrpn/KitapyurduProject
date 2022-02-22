package com.testinium.page;


import com.testinium.Methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Product {
    Methods methods;

    Logger logger = LogManager.getLogger(Product.class);

    public Product() {
        methods = new Methods();
    }

    public void selectProduct() {
        methods.sendKeys(By.id("search-input"), "oyuncak");
        methods.click(By.cssSelector(".common-sprite.button-search"));
        methods.waitBySeconds(3);
        List<WebElement> products = methods.findElements(By.cssSelector(".product-details"));
        WebElement el = products.get(7);
        methods.scrollWithAction(el);
        methods.addFavorites();
        methods.scrollWithAction(By.cssSelector(".js-ajaxCt.js-bookCt"));
        methods.click(By.cssSelector(".menu.top.my-list"));
        methods.click(By.xpath("//*[@id=\"header-top\"]/div/div[2]/ul/li[1]/div/ul/li/div/ul/li[1]/a"));
        methods.waitBySeconds(2);
        String sonuc1 = methods.findElement(By.cssSelector(".limit")).getText();
        Assert.assertTrue(sonuc1.contains("Göster"));
        methods.scrollWithAction(By.xpath("//img[@title='kitapla buluşmanın en kolay yolu!']"));
        methods.click(By.xpath("//img[@title='kitapla buluşmanın en kolay yolu!']"));
        methods.waitBySeconds(1);
        methods.scrollWithAction(By.cssSelector(".lvl1catalog"));
        methods.click(By.cssSelector(".lvl1catalog"));
        methods.waitBySeconds(1);
        methods.scrollWithAction(By.xpath("//img[@title='Puan Kataloğundaki Türk Klasikleri']"));
        methods.click(By.xpath("//img[@title='Puan Kataloğundaki Türk Klasikleri']"));
        methods.waitBySeconds(1);
        methods.scrollWithAction(By.cssSelector(".product-filter-header"));
        methods.click(By.cssSelector(".product-filter-header"));
        methods.scrollWithAction(By.cssSelector(".sort>:nth-of-type(1)"));
        methods.click(By.cssSelector(".sort>:nth-of-type(1)"));
        methods.click(By.cssSelector(".sort>:nth-of-type(1)>:nth-of-type(6)"));
        methods.click(By.xpath("//span[@class='mn-strong common-sprite' and contains(text(),'Tüm Kitaplar')]"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//a[@class='mn-icon icon-angleRight' and text()='Hobi']"));
        methods.waitBySeconds(2);
        methods.clickRandomProduct();
        methods.waitBySeconds(2);
        methods.click(By.id("button-cart"));
        methods.waitBySeconds(1);
        methods.click(By.cssSelector(".menu.top.my-list"));
        methods.click(By.xpath("//*[@id=\"header-top\"]/div/div[2]/ul/li[1]/div/ul/li/div/ul/li[1]/a"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("(//*[@data-title='Favorilerimden Sil'])[3]"));
        methods.waitBySeconds(2);
        methods.click(By.cssSelector(".heading"));
        methods.waitBySeconds(1);
        methods.click(By.id("js-cart"));
        methods.waitBySeconds(1);
        methods.findElement(By.cssSelector(".js-cart-update-product>input")).clear();
        methods.waitBySeconds(1);
        methods.sendKeys(By.cssSelector(".js-cart-update-product>input"),"3");methods.waitBySeconds(3);
        methods.click(By.cssSelector(".fa.fa-refresh.green-icon"));
        methods.waitBySeconds(15);
        methods.click(By.cssSelector(".button.red"));
        methods.waitBySeconds(15);
        methods.click(By.xpath("//*[@id=\"shipping-tabs\"]/a[2]"));
        methods.waitBySeconds(3);
        methods.click(By.id("address-firstname-companyname"));methods.waitBySeconds(1);
        methods.sendKeys(By.id("address-firstname-companyname"),"suha");methods.waitBySeconds(1);
        methods.click(By.id("address-lastname-title"));methods.waitBySeconds(1);
        methods.sendKeys(By.id("address-lastname-title"),"horpan");methods.waitBySeconds(1);
        methods.click(By.id("address-zone-id"));methods.waitBySeconds(1);
        methods.selectByText(By.id("address-zone-id"),"İstanbul");methods.waitBySeconds(1);
        methods.click(By.id("address-county-id"));methods.waitBySeconds(1);
        methods.selectByText(By.id("address-county-id"),"AVCILAR");methods.waitBySeconds(1);
        methods.click(By.id("address-address-text"));methods.waitBySeconds(1);
        methods.sendKeys(By.id("address-address-text"),"asdfhgsavnbdsadsadsadsadas");methods.waitBySeconds(1);
        methods.click(By.id("address-telephone"));methods.waitBySeconds(1);
        methods.sendKeys(By.id("address-telephone"),"5531818875");methods.waitBySeconds(1);
        methods.click(By.id("address-mobile-telephone"));methods.waitBySeconds(1);
        methods.sendKeys(By.id("address-mobile-telephone"),"5531818875");methods.waitBySeconds(1);
        methods.click(By.id("button-checkout-continue"));methods.waitBySeconds(2);
        methods.click(By.id("button-checkout-continue"));methods.waitBySeconds(5);
        methods.click(By.id("credit-card-owner"));methods.waitBySeconds(1);
        methods.sendKeys(By.id("credit-card-owner"),"suha onur horpan");methods.waitBySeconds(1);
        methods.click(By.id("credit_card_number_1"));methods.waitBySeconds(1);
        methods.sendKeys(By.id("credit_card_number_1"),"5555555555555555");methods.waitBySeconds(1);
        methods.click(By.id("credit-card-expire-date-month"));methods.waitBySeconds(1);
        methods.selectByText(By.id("credit-card-expire-date-month"),"09");methods.waitBySeconds(1);
        methods.click(By.id("credit-card-expire-date-year"));methods.waitBySeconds(1);
        methods.selectByText(By.id("credit-card-expire-date-year"),"2032");methods.waitBySeconds(1);
        methods.click(By.id("credit-card-security-code"));methods.waitBySeconds(1);
        methods.sendKeys(By.id("credit-card-security-code"),"555");methods.waitBySeconds(1);
        methods.click(By.id("button-checkout-continue"));methods.waitBySeconds(3);
        //methods.scrollWithAction(By.xpath("//img[@title='kitapla buluşmanın en kolay yolu!']"));
        methods.click(By.cssSelector(".checkout-logo"));methods.waitBySeconds(2);
        methods.click(By.cssSelector(".menu.top.login"));
    }
}