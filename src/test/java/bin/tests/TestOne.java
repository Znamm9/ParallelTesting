package bin.tests;

import org.testng.annotations.Test;

public class TestOne extends TestInit{

    @Test
    public void testOneV1(){
        getDriver().get("https://preply.com");
        System.out.println("1.1");
        sleep(5);
    }

    @Test
    public void testOneV2(){
        getDriver().get("https://preply.com");
        System.out.println("1.2");
        sleep(5);
    }

    @Test
    public void testOneV3(){
        getDriver().get("https://preply.com");
        System.out.println("1.3");
        sleep(5);
    }
}
