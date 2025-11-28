package ar.com.monstersToys.pedidos;

import ar.com.monstersToys.clientes.Clientes;
import ar.com.monstersToys.productos.Producto;

import java.util.ArrayList;

public class Pedidos {

    static int cantidadPedidos = 0;
    private ArrayList<Producto> productos;
    private Clientes cliente;



    public static int getCantidadPedidos() {
        return cantidadPedidos;
    }

    // Constructor
    public Pedidos(Clientes cliente) {
        this.cliente = cliente;
        this.productos = new ArrayList<>();
        cantidadPedidos++;
    }

    void agregarProducto(Producto p) {
        productos.add(p);
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.getPrecio() * p.getCantidadEnStock();
        }
        return total;
    }
}
