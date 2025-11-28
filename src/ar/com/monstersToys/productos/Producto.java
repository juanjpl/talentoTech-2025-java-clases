package ar.com.monstersToys.productos;

import java.util.UUID;

public class Producto {
    static int cantidadProductos =0;

    private UUID ID = UUID.randomUUID();
    private String nombre;
    private double precio; // Ahora es privado
    private int cantidadEnStock;




    // Constructor con parámetros
    public Producto(String nombre, double precio, int cantidadEnStock) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadEnStock = cantidadEnStock;
        cantidadProductos++;
    }

    public Producto() {
        // TODO Auto-generated constructor stub
    }

    public static Producto buscarProductoPorNombre(String string) {
        // TODO Auto-generated method stub
        return null;
    }

    public static int getCantidadProductos() {
        return cantidadProductos;
    }

    public String getID() {
        return ID.toString();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        // Podemos verificar que el nombre no esté vacío
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        }
    }

    public int getCantidadEnStock() {
        return cantidadEnStock;
    }

    public void setCantidadEnStock(int cantidadEnStock) {
        if (cantidadEnStock >= 0) {
            this.cantidadEnStock = cantidadEnStock;
        }
    }

    @Override
    public String toString() {
        return "ProductoDos [ID= "+ID+" nombre=" + nombre + ", precio=" + precio + ", cantidadEnStock=" + cantidadEnStock + "]";
    }




    public double calcularPrecioFinal() {
        // TODO Auto-generated method stub
        return precio*1.21;
    }
}
