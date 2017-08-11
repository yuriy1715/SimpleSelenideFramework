package com.selenium.test.core;

/**
 * Created by yuriyborzak on 09.08.17.
 */
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

import static org.openqa.selenium.remote.BrowserType.CHROME;


@Listeners({com.selenium.test.core.TestListener.class})
public class TestBase {

    private String browser = System.getProperty("browser", CHROME);

    @BeforeClass
    public void setUp() {
        switch (browser) {
            case WebDriverRunner.CHROME:
                ChromeDriverManager.getInstance().setup();
                break;
            case WebDriverRunner.FIREFOX:
                FirefoxDriverManager.getInstance().setup();
                break;
        }
        Configuration.browser = browser;
        Configuration.reportsFolder = ("screenshot.folder");
    }
}
