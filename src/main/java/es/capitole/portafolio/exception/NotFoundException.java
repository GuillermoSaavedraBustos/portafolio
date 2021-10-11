package es.capitole.portafolio.exception;
import org.springframework.http.HttpStatus;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    private String code = "";
   
    public NotFoundException(String code, String message) {
        super(message);
        Assert.notNull("Dato no encontrados", code);
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}