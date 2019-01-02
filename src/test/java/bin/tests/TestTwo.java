package bin.tests;

import org.testng.annotations.Test;

public class TestTwo extends TestInit{
    @Test
    public void testTwoV1(){
        getDriver().get("https://preply.com");
        System.out.println("2.1");
        sleep(5);
    }

    @Test
    public void testTwoV2(){
        getDriver().get("https://preply.com");
        System.out.println("2.2");
        sleep(5);
    }

    @Test
    public void testTwoV3(){
        getDriver().get("https://preply.com");
        System.out.println("2.3");
        sleep(5);
    }
}
