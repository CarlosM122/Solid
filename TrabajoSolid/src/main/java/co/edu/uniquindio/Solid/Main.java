package co.edu.uniquindio.Solid;
public class Main {
    public static void main(String[] args) {
        factura();
        infoFuncion();
    }

    public static void factura(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Saymon");
        usuario.setNumIdentificacion(82385798);

        Taquilla taquilla = new Taquilla();
        taquilla.setPrecio(35009);
        taquilla.setPrecioCombo(89000);
        taquilla.formaPago();
        taquilla.precioTotal();

        FuncionMenores funcion = new FuncionMenores();
        funcion.setTitulo("Pokemon");
        funcion.setNumSala(3);
        funcion.getImpuesto();

        System.out.println(" Cliente:"+ usuario.getNombre()+ "\n Numero de indentificacion:"+ usuario.getNumIdentificacion() +"\n Pelicula:"+ funcion.getTitulo()+"\n Sala:"+funcion.getNumSala()+ "\n Precio entrada:" +taquilla.getPrecio()+ "\n Precio combo:"+ taquilla.getPrecioCombo()+ "\n Impuesto por edad minima de la pelicula:" + funcion.getImpuesto() +"%"+"\n Forma de pago:" + taquilla.formaPago()+"\n Total:"+ taquilla.precioTotal() * funcion.getImpuesto());
    }

    public static void infoFuncion(){
        FuncionMenores funcionMenores = new FuncionMenores();
        funcionMenores.setTitulo("Pokemon");
        funcionMenores.setGenero("Aventura");
        funcionMenores.setEdadMinima(5);
        funcionMenores.setNumSala(4);
        funcionMenores.setCapacidad(12);
        System.out.println(funcionMenores.toString()+ "\n Numero de sala=" + funcionMenores.getNumSala()+ "\n Capacidad e la sala="+ funcionMenores.getCapacidad());
    }
}