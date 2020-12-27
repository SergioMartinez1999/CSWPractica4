package gradle.csw.proyecto;

public class Pelicula {
	protected static int identificador=0;

    protected String nombrePelicula;
    protected int duracion;
    protected String genero;
    protected int anyoestreno;

    protected int alquilada=0;

    protected final String generos[] = {"ROMANCE", "COMEDIA", "ACCION", "INFANTIL", "EFECTOS ESPECIALES", "TERROR"};

    public Pelicula(String nombre, int duracion, int anyoEstreno)throws IllegalArgumentException {
        Pelicula.identificador++;
        this.setNombrePelicula(nombre);
        this.setDuracion(duracion);
        this.setAnyoestreno(anyoEstreno);

        this.alquilada = 0;
    }

    public Pelicula(Pelicula otro) {
        this(otro.nombrePelicula, otro.duracion, otro.anyoestreno);
    }

    public String getNombrePelicula() {
        return nombrePelicula;
    }
    
    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }
    
    public int getDuracion() {
        return duracion;
    }
    
    public void setDuracion(int duracion) throws IllegalArgumentException {
        if(duracion>0)
            this.duracion = duracion;
        else
            throw new IllegalArgumentException("La duracion no es valida...");
    }

    public String getGenero() {
        return genero;
    }
    
    public void setGenero(String genero) throws IllegalArgumentException {
        genero = genero.toUpperCase();
        for(int i=0; i<generos.length;++i)
            if(generos[i].equals(genero)) {
                this.genero = genero;
                return;
            }
        throw new IllegalArgumentException("El idioma no es valido...");
    }

    public int getAnyoestreno() {
        return anyoestreno;
    }
    
    public void setAnyoestreno(int anyoestreno) {
        this.anyoestreno = anyoestreno;
    }

    public int getPeliculaId() {
        return Pelicula.identificador;
    }

    @Override
    public void finalize() {
        Pelicula.identificador--;
        System.out.println("Se ha borrado la pelicula "+this.toString());
    }

    @Override
    public Pelicula clone() {
        return new Pelicula(this);
    }

    //Metodos dedicados a los Asertos de JUnit
    public boolean compararAnyo(int anyo) {
        if(this.anyoestreno==anyo)
            return true;
        else
            return false;
    }

    public String muestraPeli() {
        String message = "Nombre: "+this.nombrePelicula+", Duracion: "+this.duracion;
        return message;
    }

    public void alquilar() {
        this.alquilada=1;
    }

    public boolean comprobarAlquilada() {
        if(this.alquilada==1)
            return true;
        else
            return false;
    }

    public Pelicula cloneExplicito() {
        return this;
    }
}
