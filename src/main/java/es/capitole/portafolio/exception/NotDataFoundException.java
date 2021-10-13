package es.capitole.portafolio.exception;

public class NotDataFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public NotDataFoundException(String message) {
        super(message);
        
    }
}