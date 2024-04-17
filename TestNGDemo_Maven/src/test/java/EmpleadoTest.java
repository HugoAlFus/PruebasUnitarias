import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 *
 */
public class EmpleadoTest {

    /**
     * En este test salta la Excepcion debido a que 'vendeMes' es negativo
     */
    @Test
    public void testCalculaSalariBrutVendeMesNegativo(){
        Empleado emp = new Empleado();
        double resultado;
        try {
            resultado = emp.calculaSalariBrut("Venedor", -2, 20);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    /**
     * En este test salta la Excepcion debido a que 'horasExtra' es negativo
     */
    @Test
    public void testCalculaSalariBrutHorasExtraNegativo(){
        Empleado emp = new Empleado();
        double resultado;
        try {
            resultado = emp.calculaSalariBrut("Venedor", 1000, -20);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    /**
     * En este test salta la Excepcion debido a que 'tipusEmpleat' es null
     */
    @Test
    public void testCalculaSalariBrutTipusEmpleatNulo(){
        Empleado emp = new Empleado();
        double resultado;
        try {
            resultado = emp.calculaSalariBrut(null, 1000, 20);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    /**
     * En este test salta la Excepcion debido a que 'tipusEmpleat' es uno que no esta registrado
     */
    @Test
    public void testCalculaSalariBrutTipusEmpleatDistinto(){
        Empleado emp = new Empleado();
        double resultado;
        try {
            resultado = emp.calculaSalariBrut("patata", 1000, 20);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * En este test es correcto
     */
    @Test
    public void testCalculaSalariBrutTipusEmpleatVenedor(){
        Empleado emp = new Empleado();
        double resultado = 0;
        try {
            resultado = emp.calculaSalariBrut("venedor", 1000, 20);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        assertEquals(resultado,1471.4);
    }
    /**
     * En este test es correcto
     */
    @Test
    public void testCalculaSalariBrutTipusEmpleatVenedor2(){
        Empleado emp = new Empleado();
        double resultado = 0;
        try {
            resultado = emp.calculaSalariBrut("venedor", 2700, 20);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        assertEquals(resultado,1571.4);
    }
    /**
     * En este test es correcto
     */
    @Test
    public void testCalculaSalariBrutTipusEmpleatVenedor3(){
        Empleado emp = new Empleado();
        double resultado = 0;
        try {
            resultado = emp.calculaSalariBrut("venedor", 100, 20);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        assertEquals(resultado,1371.4);
    }
    /**
     * En este test es correcto
     */
    @Test
    public void testCalculaSalariBrutTipusEmpleatEncarregat(){
        Empleado emp = new Empleado();
        double resultado = 0;
        try {
            resultado = emp.calculaSalariBrut("Encarregat", 2700, 20);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        assertEquals(resultado,2071.4);
    }

    /**
     * En este test es correcto
     */
    @Test
    public void testCalculaSalariBrutTipusEmpleatEncarregat2(){
        Empleado emp = new Empleado();
        double resultado = 0;
        try {
            resultado = emp.calculaSalariBrut("Encarregat", 1000, 20);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        assertEquals(resultado,1971.4);
    }
    /**
     * En este test es correcto
     */
    @Test
    public void testCalculaSalariBrutTipusEmpleatEncarregat3(){
        Empleado emp = new Empleado();
        double resultado = 0;
        try {
            resultado = emp.calculaSalariBrut("Encarregat", 200, 20);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        assertEquals(resultado,1871.4);
    }
    /**
     * En este test salta una Excepcion al ser el salario bruto negativo
     */
    @Test
    public void testCalculaSalariNetBrutoNegativo() {
        Empleado emp = new Empleado();
        double resultado = 0;
        try {
            resultado = emp.calculaSalariNet(-20);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    /**
     * En este test es correcto
     */
    @Test
    public void testCalculaSalariNet1() {
        Empleado emp = new Empleado();
        double resultado = 0;
        try {
            resultado = emp.calculaSalariNet(2500);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        assertEquals(resultado,2000);
    }
    /**
     * En este test es correcto
     */
    @Test
    public void testCalculaSalariNet2() {
        Empleado emp = new Empleado();
        double resultado = 0;
        try {
            resultado = emp.calculaSalariNet(500);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        assertEquals(resultado,500);
    }
    /**
     * En este test es correcto
     */
    @Test
    public void testCalculaSalariNet3() {
        Empleado emp = new Empleado();
        double resultado = 0;
        try {
            resultado = emp.calculaSalariNet(0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        assertEquals(resultado,0);
    }
    /**
     * En este test es correcto
     */
    @Test
    public void testCalculaSalariNet4() {
        Empleado emp = new Empleado();
        double resultado = 0;
        try {
            resultado = emp.calculaSalariNet(1500);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        assertEquals(resultado,1200);
    }
    /**
     * En este test es correcto
     */
    @Test
    public void testCalculaSalariNet5() {
        Empleado emp = new Empleado();
        double resultado = 0;
        try {
            resultado = emp.calculaSalariNet(1499.99);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        assertEquals(resultado,1259.99);
    }
    /**
     * En este test es correcto
     */
    @Test
    public void testCalculaSalariNet6() {
        Empleado emp = new Empleado();
        double resultado = 0;
        try {
            resultado = emp.calculaSalariNet(1251);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        assertEquals(resultado,1050.845);
    }
    /**
     * En este test es correcto
     */
    @Test
    public void testCalculaSalariNet7() {
        Empleado emp = new Empleado();
        double resultado = 0;
        try {
            resultado = emp.calculaSalariNet(999.99);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        assertEquals(resultado,999.99);
    }
    /**
     * En este test es correcto
     */
    @Test
    public void testCalculaSalariNet8() {
        Empleado emp = new Empleado();
        double resultado = 0;
        try {
            resultado = emp.calculaSalariNet(2000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        assertEquals(resultado,1600);
    }
}