package co.edu.uniquindio.Solid;

import java.util.ArrayList;
import java.util.List;

public class Sala {
    private boolean disponibilidad;
    private int numSala;
    private int capacidad;
    private List<String> funcionMayores = new ArrayList<>();
    private List<String> funcionMenores = new ArrayList<>();

    public Sala() {
    }

    public Sala(boolean disponibilidad, int numSala, int capacidad, List<String> funcionMayores, List<String> funcionMenores) {
        this.disponibilidad = disponibilidad;
        this.numSala = numSala;
        this.capacidad = capacidad;
        this.funcionMayores = funcionMayores;
        this.funcionMenores = funcionMenores;
    }

    public List<String> getFuncionMayores() {
        return funcionMayores;
    }

    public void setFuncionMayores(List<String> funcionMayores) {
        this.funcionMayores = funcionMayores;
    }

    public List<String> getFuncionMenores() {
        return funcionMenores;
    }

    public void setFuncionMenores(List<String> funcionMenores) {
        this.funcionMenores = funcionMenores;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public int getNumSala() {
        return numSala;
    }

    public void setNumSala(int numSala) {
        this.numSala = numSala;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }


}
