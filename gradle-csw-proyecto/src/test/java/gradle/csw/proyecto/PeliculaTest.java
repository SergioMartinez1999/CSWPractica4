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
    
    //assertEquals con exito (encuentra un fallo)
    @Test
    public void assertEqualsOk() {
        assertEquals("name: Hulk, Duracion: 180", peliculaTest2.muestraPeli());
    }

    //assertTrue no tiene exito (no encuentra fallo
    @Test
    public void testAssertTrueTrue() {
        assertFalse(peliculaTest1.compararAnyo(2010));
    }

    //assertTrue con exito
    @Test
    public void testAssertTrueFalse() {
        peliculaTest2.setAnyoestreno(2000);
        assertTrue(peliculaTest2.compararAnyo(1950));
    }
    
  //assertFalse no tiene exito
    @Test
    public void testAssertFalseFalse() {
        assertFalse(peliculaTest1.comprobarAlquilada());
    }
    
    //assertFalse con exito
    @Test
    public void testAssertFalseTrue() {
        peliculaTest2.alquilar();
        assertFalse(peliculaTest2.comprobarAlquilada());
    }
    
    //assertNotNull no tiene exito
    @Test
    public void testAssertNotNullFalse() {
        assertNotNull(peliculaTest1);
    }
    
  //assertNotNull con exito
    @Test
    public void testAssertNotNullTrue() {
        peliculaTest2 = null;
        assertNotNull(peliculaTest2);
    }
  
    //assertSame con exito
    @Test
    public void testAssertSameFalse() {
        Pelicula clonacion = peliculaTest1.clone();
        assertSame(peliculaTest1, clonacion);
    }
    
    @Test
    public void testAssertSameEquals() {
        assertEquals(peliClonacion.muestraPeli(), peliculaTest1.muestraPeli());
    }
    
    //assertSame no con exito
    @Test
    public void testAssertSameTrue() {
        assertSame(peliculaTest1, peliReferenciada);
    }
    
    //assertNotSame con exito
    @Test
    public void testAssertNotSameFalse() {
        assertNotSame(peli2ClonacionImplicita, peliculaTest2);
    }
    
    //assertNotSame no tiene exito
    @Test
    public void testAssertNotSameTrue() {
        assertNotSame(peliClonacion, peliculaTest1);
    }
    
    //assertArrayEquals con exito
    @Test
    public void testAssertArrayEqualsTrue() {
        Pelicula lista1[] = {new Pelicula(peliculaTest1)};
        Pelicula lista2[] = {peliculaTest1};
        assertArrayEquals(lista1, lista2);
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
