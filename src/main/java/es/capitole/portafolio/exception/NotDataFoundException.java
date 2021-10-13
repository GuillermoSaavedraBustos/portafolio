package es.capitole.portafolio.exception;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotDataFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public NotDataFoundException(String message) {
        super(message);
        
    }
}