package EjemploCarritoCompras;

public class main {

    public static void main(String[] args) {
        Carrito carrito = new Carrito();
        System.out.println(carrito.getEstado());
        Producto producto = new Producto("primerProducto",12);
        Producto producto2 = new Producto("psegundoProducto",12);
        carrito.agregar(producto);
        carrito.agregar(producto2);
        carrito.avanzar();
        System.out.println(carrito.getEstado());



    }




}
