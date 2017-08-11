package com.selenium.test.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;
import java.util.NoSuchElementException;

/**
 * This page is a page object example.
 */
public class YouTubeSearchResultsPage {

    @FindBy(css = "div[class*='yt-lockup-tile yt-lockup-video']")
    private ElementsCollection videoElements;

    public boolean hasResults() {
        return !videoElements.isEmpty();
    }

}
