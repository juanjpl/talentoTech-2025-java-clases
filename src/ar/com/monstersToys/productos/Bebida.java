package ar.com.monstersToys.productos;

public class Bebida extends ProductoDos implements IDescontable {
    private double volumenEnLitros=0;
    private String categoria;

    public Bebida(String nombre, double precio, int cantidadEnStock, double volumenEnLitros) {
        super(nombre, precio, cantidadEnStock);

        this.volumenEnLitros = volumenEnLitros;
        this.categoria = "Bebida";

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

    public double getvolumenBebida() {
        return volumenEnLitros;
    }

    @Override
    public String toString() {
        return "Bebida [volumenEnLitros=" + volumenEnLitros + ", categoria=" + categoria + ", getID()=" + getID()
                + ", getNombre()=" + getNombre() + ", getPrecio()=" + getPrecio() + ", getCantidadEnStock()="
                + getCantidadEnStock() + "]";
    }
}
