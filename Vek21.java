package ru.gb.lesson5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Vek21 {
    WebDriver driver;
    WebDriverWait driverWait;
    Actions actions;

    @BeforeAll
    static void registerDriver() {
        WebDriverManager.edgedriver().setup();
    }

    @BeforeEach
    void setupBrowser() {
        driver = new EdgeDriver();
        driverWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        actions = new Actions(driver);
    }

    @Test
    void killBrowser() {
        driver.quit();
    }

}
