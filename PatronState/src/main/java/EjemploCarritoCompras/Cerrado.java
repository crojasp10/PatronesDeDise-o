package EjemploCarritoCompras;

public class Cerrado implements EstadoCarrito{


    @Override
    public Producto agregar(Producto producto) {
        Producto miproducto = producto;
        return miproducto;
    }

    @Override
    public void cancelar() {

    }

    @Override
    public void volver() {

    }

    @Override
    public void avanzar() {

    }
}
