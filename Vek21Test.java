package ru.gb.lesson5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Vek21Test extends Vek21 {

    @Test
    void goTo21VekTest1() {
        driver.get("https://www.21vek.by");
        WebElement inputSearch = driver.findElement(By.xpath("//input[@placeholder='Поиск товаров']"));
        inputSearch.sendKeys("рюкзак");
        driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("a[href = \"/kids_bags/\"]")));
        actions.moveToElement(driver.findElement(By.xpath("a[href = \"/kids_bags/\"]")))
                .click()
                .perform();

        Assertions.assertTrue(driver.getTitle().contains("Сумки, рюкзаки детские"));
    }

    @Test
    void goTo21VekTest2 (){
        driver.get("https://www.21vek.by/tv/");
        actions.moveToElement(driver.findElement(By.xpath("//div/dd[1]/label")))
                .click()
               .perform();
        actions.moveToElement(driver.findElement(By.xpath("//span[@id='j-filter__counter']")))
                .click()
                .perform();
        Assertions.assertTrue(driver.getCurrentUrl().contains("good_status"));
    }

}
