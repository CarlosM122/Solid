package co.edu.uniquindio.Solid;
import java.util.ArrayList;
import java.util.List;

public class Cine {
    private String nombre;
    private String cartelera;
    private List<Empleado> empleados = new ArrayList<>();
    private String horario;

    public Cine() {
    }

    public Cine(String nombre, String cartelera, List<Empleado> empleados, String horario) {
        this.nombre = nombre;
        this.cartelera = cartelera;
        this.empleados = empleados;
        this.horario = horario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCartelera() {
        return cartelera;
    }

    public void setCartelera(String cartelera) {
        this.cartelera = cartelera;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }


    @Override
    public String toString() {
        return "Cine{" +
                "nombre='" + nombre + '\'' +
                ", cartelera='" + cartelera + '\'' +
                ", empleados=" + empleados +
                ", horario='" + horario + '\'' +
                '}';
    }
}
