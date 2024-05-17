package ru.yandex.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class PageWithQuestion {
    private final WebDriver driver ;

    // Локатор вопроса о подтверждении заказа

    private final By confirmButton = By.xpath(".//button[text()='Да']");


    public PageWithQuestion(WebDriver driver) {
        this.driver = driver;
    }



    public void clickConfirmButton() {
        driver.findElement(confirmButton).click();
    }
}
