package co.edu.uniquindio.Solid;

public class Taquilla implements IformaDePago{
    private int precioCombo;
    private long precio;


    public Taquilla() {
    }

    public Taquilla(int precioCombo, long precio) {
        this.precioCombo = precioCombo;
        this.precio = precio;

    }

    public int getPrecioCombo() {
        return precioCombo;
    }

    public void setPrecioCombo(int precioCombo) {
        this.precioCombo = precioCombo;
    }

    public long getPrecio() {
        return precio;
    }

    public void setPrecio(long precio) {
        this.precio = precio;
    }

    public long precioTotal(){
        return precio+precioCombo;
    }

    @Override
    public String formaPago() {
        return "Efectivo";
    }
}
