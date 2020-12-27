package gradle.csw.proyecto;

import static org.junit.Assert.*;

import org.junit.Test;

public class PeliculaTest {

	public Pelicula peliculaTest1 = new Pelicula("Spider-Man 3", 150, 2010);
    public Pelicula peliculaTest2 = new Pelicula("Hulk", 180, 2007);
    public Pelicula peliClonacion = peliculaTest1.clone();
    public Pelicula peliReferenciada = peliculaTest1;
    public Pelicula peli2ClonacionImplicita = peliculaTest2.cloneExplicito();
    public Pelicula peliculaTest3;
    
    //Assertos a probar
    /*
     * assertEquals
     * assertTrue
     * assertFalse
     * assertNotNull
     * assertNull
     * assertSame
     * assertNotSame
     * assertArrayEquals
     * 
     */

    //assertTrue no tiene exito (no encuentra fallo
    @Test
    public void testAssertTrueTrue() {
    	assertTrue(peliculaTest1.compararAnyo(2010));
    }
    
  //assertFalse no tiene exito
    @Test
    public void testAssertFalseFalse() {
        assertFalse(peliculaTest1.comprobarAlquilada());
    }
    
    //assertNotNull no tiene exito
    @Test
    public void testAssertNotNullFalse() {
        assertNotNull(peliculaTest1);
    }
    
    //assertSame no con exito
    @Test
    public void testAssertSameTrue() {
        assertNotSame(peliculaTest1, peliReferenciada);
    }
    
    //assertNotSame no tiene exito
    @Test
    public void testAssertNotSameTrue() {
        assertNotSame(peliClonacion, peliculaTest1);
    }
    
  //assertArrayEquals no tiene exito
    @Test
    public void testAssertArrayEqualsFalse() {
        Pelicula pIgual;
        Pelicula lista1[] = {pIgual = peliculaTest1.cloneExplicito()};
        Pelicula lista2[] = {peliculaTest1};
        assertArrayEquals(lista1, lista2);
    }
}
