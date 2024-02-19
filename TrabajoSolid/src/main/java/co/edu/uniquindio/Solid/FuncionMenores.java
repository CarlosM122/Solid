package co.edu.uniquindio.Solid;

public class FuncionMenores extends Sala implements IClasificarFuncion {
    private String titulo;
    private String genero;
    private int edadMinima;

    public FuncionMenores() {
    }

    public FuncionMenores(String titulo, String genero, int edadMinima) {
        this.titulo = titulo;
        this.genero = genero;
        this.edadMinima = 0;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = 0;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public double getImpuesto() {
        return 0.12;
    }

    @Override
    public void agregarAlista() {
        if(getEdadMinima()==0){
            getFuncionMenores().add(titulo);
        }

    }
}
