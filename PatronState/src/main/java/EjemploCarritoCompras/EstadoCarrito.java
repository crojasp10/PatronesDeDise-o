package EjemploCarritoCompras;

public interface EstadoCarrito {

    public Producto agregar(Producto producto);
    public void cancelar();
    public void volver();
    public void avanzar();



}
