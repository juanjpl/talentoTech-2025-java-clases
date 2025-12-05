package ar.com.techlab.clase008;

public class ProductoIndumentaria extends Producto {

    private double peso;

    @Override
    public double calcularCostoDeEnvio() {
        return peso;
    }
}
