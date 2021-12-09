package EjemploCarritoCompras;

import java.util.ArrayList;
import java.util.List;

public class Carrito {

    EstadoCarrito estado;
    List<Producto> lista = new ArrayList();


    public Carrito() {
        this.estado = new Vacio();
    }

    public EstadoCarrito getEstado() {
        return estado;
    }

    public void setEstado(EstadoCarrito estado) {
        this.estado = estado;
    }

    public void  agregar (Producto producto){
        lista.add(producto);
        System.out.println("Esta es la lista de productos" + lista);
    };

    public void cancelar() {

    }

    public void volver() {

    }

    public void avanzar() {

    }




}
