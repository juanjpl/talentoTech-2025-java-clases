package ar.com.monstersToys.excepciones;

public class ProductoNoEncontradoException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ProductoNoEncontradoException(String mensaje) {
        super(mensaje);

    }

    public ProductoNoEncontradoException() {
        super();
        // TODO Auto-generated constructor stub
    }

    public ProductoNoEncontradoException(String message, Throwable cause, boolean enableSuppression,
                                         boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
        // TODO Auto-generated constructor stub
    }

    public ProductoNoEncontradoException(String message, Throwable cause) {
        super(message, cause);
        // TODO Auto-generated constructor stub
    }

    public ProductoNoEncontradoException(Throwable cause) {
        super(cause);
        // TODO Auto-generated constructor stub
    }


}