package es.capitole.portafolio.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/busqueda")
public class HomeController {

  @GetMapping(path = "/productos/{fechaAplicacion}/{identificacionProducto}/{identificacionCadena}",
		  produces = MediaType.APPLICATION_JSON_VALUE)
  public String obtenerProducto(@PathVariable("fechaAplicacion") String fechaAplicacion, 
		  @PathVariable("identificacionProducto") String identificacionProducto, 
		  @PathVariable("identificacionCadena") int identificacionCadena){

    return "userForm";
  }
}
	