package bin.tests;

import org.testng.annotations.Test;

public class TestThree extends TestInit{
    @Test
    public void testThreeV1(){
        getDriver().get("https://preply.com");
        System.out.println("3.1");
        sleep(5);
    }

    @Test
    public void testThreeV2(){
        getDriver().get("https://preply.com");
        System.out.println("3.2");
        sleep(5);
    }

    @Test
    public void testThreeV3(){
        getDriver().get("https://preply.com");
        System.out.println("3.3");
        sleep(5);
    }
}
