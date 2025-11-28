package ar.com.monstersToys.excepciones;

public class StockInsuficienteException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public StockInsuficienteException(String mensaje) {
        super(mensaje);

    }

    public StockInsuficienteException() {
        super();
        // TODO Auto-generated constructor stub
    }

    public StockInsuficienteException(String message, Throwable cause, boolean enableSuppression,
                                      boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
        // TODO Auto-generated constructor stub
    }

    public StockInsuficienteException(String message, Throwable cause) {
        super(message, cause);
        // TODO Auto-generated constructor stub
    }

    public StockInsuficienteException(Throwable cause) {
        super(cause);
        // TODO Auto-generated constructor stub
    }


}