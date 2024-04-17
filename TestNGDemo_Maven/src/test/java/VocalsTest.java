import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class VocalsTest {

    @Test
    public void testEsVocalLongitudSuperior() {
        System.out.println("testEsVocallongitudSuperior");
        Vocals vocals = new Vocals();
        boolean expResult = Boolean.FALSE;
        boolean esVocal = vocals.esVocal("abc");
        assertEquals(expResult, esVocal);
    }
    @Test
    public void testEsVocalEsConsonante() {
        System.out.println("testEsVocalEsConsonante");
        Vocals vocals = new Vocals();
        boolean expResult = Boolean.FALSE;
        boolean esVocal = vocals.esVocal("f");
        assertEquals(expResult, esVocal);
    }
    @Test
    public void testEsVocalMinuscula() {
        System.out.println("testEsVocalMinuscula");
        Vocals vocals = new Vocals();
        boolean expResult = Boolean.TRUE;
        boolean esVocal = vocals.esVocal("a");
        assertEquals(expResult, esVocal);
    }
    @Test
    public void testEsVocalMayuscula() {
        System.out.println("testEsVocalMayuscula");
        Vocals vocals = new Vocals();
        boolean expResult = Boolean.TRUE;
        boolean esVocal = vocals.esVocal("A");
        assertEquals(expResult, esVocal);
    }
    @Test
    public void testEsVocalEntero() {
        System.out.println("testEsVocalEntero");
        Vocals vocals = new Vocals();
        boolean expResult = Boolean.FALSE;
        boolean esVocal = vocals.esVocal("1");
        assertEquals(expResult, esVocal);
    }
    @Test
    public void testEsVocalNulo() {
        System.out.println("testEsVocalNulo");
        Vocals vocals = new Vocals();
        boolean expResult = Boolean.FALSE;
        try {
            boolean esVocal = vocals.esVocal(null);
            assertEquals(expResult, esVocal);
        }catch (NullPointerException e){
            System.out.println("El String es nulo");
        }
    }
}