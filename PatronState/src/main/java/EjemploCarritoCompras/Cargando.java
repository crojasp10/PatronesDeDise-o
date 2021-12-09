package EjemploCarritoCompras;

public class Cargando implements EstadoCarrito{
    private Carrito carrito;


    public Carrito getCarrito() {
        return carrito;
    }

    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }

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
