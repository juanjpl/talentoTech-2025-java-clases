package ar.com.monstersToys.pedidos;

import java.util.ArrayList;

public class Pedido {

    static int cantidadPedidos = 0;
    private ArrayList<ProductoDos> productos;
    private Cliente cliente;



    public static int getCantidadPedidos() {
        return cantidadPedidos;
    }

    // Constructor
    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.productos = new ArrayList<>();
        cantidadPedidos++;
    }

    void agregarProducto(ProductoDos p) {
        productos.add(p);
    }

    public double calcularTotal() {
        double total = 0;
        for (ProductoDos p : productos) {
            total += p.getPrecio() * p.getCantidadEnStock();
        }
        return total;
    }
}
