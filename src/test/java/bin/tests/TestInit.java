package bin.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;

public class TestInit {

    protected static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal();

    @BeforeMethod
    @Parameters(value={"browser"})
    public void setupTest (String browser) throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        if (browser=="firefox") {
            FirefoxProfile profile = new FirefoxProfile();
            profile.setAcceptUntrustedCertificates(true);
            profile.setAssumeUntrustedCertificateIssuer(false);
            profile.setPreference("network.proxy.type", 0);
            capabilities.setCapability(FirefoxDriver.PROFILE, profile);
        }
        capabilities.setCapability("browserName", browser);
        driver.set(new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities));
    }

    public WebDriver getDriver() {
        //Get driver from ThreadLocalMap
        return driver.get();
    }

    @AfterMethod
    public void tearDown() throws Exception {
        getDriver().quit();
    }

    @AfterClass
    void terminate () {
        //Remove the ThreadLocalMap element
        driver.remove();
    }

    public void sleep(int sec){
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
