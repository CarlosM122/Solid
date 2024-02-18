package co.edu.uniquindio.Solid;

public class Empleado implements IgestionActividad {
    private String nombre;
    private int id;
    private long salario;
    private String trabajo;
    private boolean activo;

    public Empleado() {
    }

    public Empleado(String nombre, int id, long salario, String trabajo) {
        this.nombre = nombre;
        this.id = id;
        this.salario = salario;
        this.trabajo = trabajo;
        this.activo = true;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getSalario() {
        return salario;
    }

    public void setSalario(long salario) {
        this.salario = salario;
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
            System.out.println("El empleaado esta ejerciendo labores");
        } else {
            System.out.println("El usuario no esta laborando");
        }
    }
}
