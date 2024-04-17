import org.testng.annotations.*;

import java.util.NoSuchElementException;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

public class MatricadTest {

    public MatricadTest() {
    }

    static String[] cadenes;

    @BeforeClass
    public static void setUpClass() throws Exception {
        cadenes = new String[]{"hui", "és", "dilluns", "i", "no", "m'agrada", "gens"};    // carrega la matriu de cadenes
    }

    @AfterClass
    public static void tearDownClass() throws Exception {    // s’executa una única vegada al final de la prova
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {    // s’executa cada vegada a l’inici del mètode
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {    // s’executa cada vegada al final del mètode
    }

    /**
     * Test of getMaxCad method, of class Matricad.
     */
    @Test
    public void testGetMaxCad() {
        System.out.println("getMaxCad");
        Matricad instance = new Matricad(cadenes);
        String expResult = "m'agrada";
        String result = instance.getMaxCad();
        assertEquals(result, expResult);
    }

    /**
     * Test of getSumaCaracters method, of class Matricad.
     */
    @Test
    public void testGetSumaCaracters() {
        System.out.println("getSumaCaracters");
        Matricad instance = new Matricad(cadenes);
        int expResult = 27;
        int result = instance.getSumaCaracters();
        assertEquals(result, expResult);
    }

    /**
     * Test of getIndexDe method, of class Matricad.
     */
    @Test
    public void testGetIndexDeCadenes() {
        System.out.println("getIndexDeCadenes");
        String unaCadena = "no";
        Matricad instance = new Matricad(cadenes);
        int expResult = 4;
        int result = instance.getIndexDe(unaCadena);
        assertEquals(result, expResult);
    }
    @Test
    public void testGetIndexDeNulo() {
        System.out.println("getIndexDeNulo");
        String unaCadena = null;
        Matricad instance = new Matricad(cadenes);
        try {
            int result = instance.getIndexDe(unaCadena);
        }catch (IllegalArgumentException ex) {
            System.out.println("El string es nulo");
        }
    }
    @Test
    public void testGetIndexDeStringDiferente() {
        System.out.println("getIndexDeCadenesStringDiferente");
        String unaCadena = "patata";
        Matricad instance = new Matricad(cadenes);
        int expResult = 4;
        try {
            int result = instance.getIndexDe(unaCadena);
        }catch (NoSuchElementException ex) {
            System.out.println("Se ingresa un string que no esta en el vector");
        }

    }

    @Test
    public void testMatricadNull() {

        try {
            new Matricad(null);
        } catch (IllegalArgumentException e) {
            System.out.println("El vector es nulo");
        }
    }
    @Test
    public void testMatricadEmpty() {
        try{
            new Matricad(new String[]{});
        } catch (IllegalArgumentException e){
            System.out.println("El vector esta vacio");
        }
    }
    @Test
    public void testMatricad() {
        new Matricad(cadenes);
    }
}