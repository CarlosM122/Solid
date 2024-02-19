package co.edu.uniquindio.Solid;

public class Usuario implements IgestionActividad{
    private String nombre;
    private int numIdentificacion;
    private boolean activo;

    public Usuario() {
    }

    public Usuario(String nombre, int numIdentificacion) {
        this.nombre = nombre;
        this.numIdentificacion = numIdentificacion;
        this.activo = true;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumIdentificacion() {
        return numIdentificacion;
    }

    public void setNumIdentificacion(int numIdentificacion) {
        this.numIdentificacion = numIdentificacion;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public void verActividad() {
        if (isActivo()){
            System.out.println("El usuario esta activo");
        } else {
            System.out.println("El usuario no esta activo( 30 dias sin actividad)");
        }
    }
}
