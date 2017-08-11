package com.selenium.test.core;

/**
 * Created by yuriyborzak on 09.08.17.
 */
import com.codeborne.selenide.WebDriverRunner;
import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


import static com.google.common.io.Files.toByteArray;

public class TestListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult iTestResult) {

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        saveScreenshot(iTestResult.getMethod().getMethodName());
    }

    
    public byte[] saveScreenshot(String screenshotName) {
        try {
            File scrFile = ((TakesScreenshot) WebDriverRunner.getWebDriver()).getScreenshotAs(OutputType.FILE);
            return toByteArray(scrFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new byte[0];
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }
}


