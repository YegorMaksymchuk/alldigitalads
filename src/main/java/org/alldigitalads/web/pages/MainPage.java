package org.alldigitalads.web.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    private WebDriver driver;

    private final static String MAIN_PAGE_URL = "https://alldigitalads.com/";

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    @Step
    public void open() {
        driver.get(MAIN_PAGE_URL);
    }

    @Step
    public void openContactsForm() {
        driver.findElement(By.xpath("//td[text()='Get Started']")).click();
    }

    @Step
    public boolean isContactFormOpen() {
        return driver.findElement(By.name("Email")).isDisplayed();
    }
}
