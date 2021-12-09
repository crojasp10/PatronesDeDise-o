package EjemploCarritoCompras;

public class Vacio implements EstadoCarrito{


    private Carrito carrito;


    public Vacio() {
    }

    public Vacio(Carrito c) {
        this.carrito = c;
    }

    @Override
    public Producto agregar(Producto producto) {
        Producto miproducto = producto;
        return miproducto;
    }

    @Override
    public void cancelar() {
        System.out.println("Sigue en el mismo estado");
    }

    @Override
    public void volver() {
        System.out.println("Sigue en el mismo estado");
    }

    @Override
    public void avanzar() {
        System.out.println("Pasa a estado cargando");
        carrito.setEstado(new Cargando());
    }
}
