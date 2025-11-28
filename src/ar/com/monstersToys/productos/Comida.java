package ar.com.monstersToys.productos;

public class Comida  extends Producto implements IDescontable {
    private String fechaVencimiento;
    private String categoria ;

    public Comida(String nombre, double precio, int cantidadEnStock , String fechaVencimiento) {
        super(nombre, precio, cantidadEnStock);

        this.fechaVencimiento = fechaVencimiento;
        this.categoria="Comida";
    }


    @Override
    public double calcularPrecioFinal() {
        // Por ejemplo, las bebidas tienen un descuento del 5%
        return getPrecio() * 0.95;
    }


    @Override
    public double aplicarDescuento(double porcentaje) {
        // TODO Auto-generated method stub
        return getPrecio()*porcentaje/100;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }


    @Override
    public String toString() {
        return "Comida [fechaVencimiento=" + fechaVencimiento + ", categoria=" + categoria + ", getID()=" + getID()
                + ", getNombre()=" + getNombre() + ", getPrecio()=" + getPrecio() + ", getCantidadEnStock()="
                + getCantidadEnStock() + "]";
    }
}
