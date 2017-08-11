package com.selenium.test.junit.tests;

import com.selenium.test.junit.rules.ScreenShotOnFailRule;
import com.selenium.test.pages.YouTubePage;
import com.selenium.test.pages.YouTubeSearchResultsPage;
import org.junit.Rule;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.Assert.assertTrue;

/**
 * Created by Sidelnikov Mikhail on 30.07.15.
 * Uses JUnit test framework
 * Test demonstrates work with Selenide and Page Object Pattern(https://code.google.com/p/selenium/wiki/PageObjects)
 * For more information about Selenide visit <a href="http://selenide.org">Selenide</a>
 */
public class PageObjectTest {

    @Rule
    public ScreenShotOnFailRule screenShotOnFailRule = new ScreenShotOnFailRule();

    @Test
    public void testSearch() {
        YouTubePage youTubePage = open("http://youtube.com", YouTubePage.class);
        youTubePage.insertSearchString("Selenium");
        YouTubeSearchResultsPage resultsPage = youTubePage.doSearch();
        assertTrue("No results were found on results page", resultsPage.hasResults());
    }

}
