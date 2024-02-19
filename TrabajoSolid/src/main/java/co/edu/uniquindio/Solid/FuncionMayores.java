package co.edu.uniquindio.Solid;

public class FuncionMayores extends Sala implements IClasificarFuncion {
    private String titulo;
    private String genero;
    private int edadMinima;

    public FuncionMayores() {
    }

    public FuncionMayores(String titulo, String genero, String edadMinima) {
        this.titulo = titulo;
        this.genero = genero;
        this.edadMinima = 18;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = 18;
    }

    @Override
    public double getImpuesto() {
        return 0.23;
    }

    @Override
    public void agregarAlista() {
        if (getEdadMinima()==18){
            getFuncionMayores().add(titulo);
        }
    }
}
