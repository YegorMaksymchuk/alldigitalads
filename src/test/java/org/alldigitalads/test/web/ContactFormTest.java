package org.alldigitalads.test.web;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.alldigitalads.web.pages.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class ContactFormTest {
    private WebDriver driver;

    @BeforeClass
    public void beforeContactFormTest() {
        WebDriverManager.chromedriver().setup();
        this.driver = new ChromeDriver();
    }

    @AfterClass
    public void stop(){
        driver.quit();
    }

    @Test
    public void canSeeContactForm() {
        MainPage page = new MainPage(driver);
        page.open();
        page.openContactsForm();
        Assert.assertTrue(page.isContactFormOpen(),"Contact form should be opened");
    }
}
