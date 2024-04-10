package pruebas_unitarias;

import org.testng.annotations.Test;

public class TestCases {

    @Test(priority = 1)
    void setup(){
        System.out.println("Estoy dentro de setup");
    }

    @Test(priority = 2)
    void testSteps(){
        System.out.println("Estoy dentro de testSteps");
    }

    @Test(priority = 3)
    void tearDown(){
        System.out.println("Estoy dentro de tearDown");
    }
}
