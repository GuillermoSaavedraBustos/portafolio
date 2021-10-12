package es.capitole.portafolio.controller;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.capitole.portafolio.dto.PricesDto;
import es.capitole.portafolio.dto.RequestObject;
import es.capitole.portafolio.service.BuquedaRegistros;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/busqueda")
public class HomeController {

	@Autowired
	BuquedaRegistros busqueda;

	@GetMapping(path = "/productos/{fechaAplicacion}/{identificacionProducto}/{identificacionCadena}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation("Operacion que se encarga de buscar en la tabla PRICES")
	@ApiResponses({ @ApiResponse(code = 500, message = "Internal server error") })
	public Optional<PricesDto> obtenerProducto(@PathVariable("fechaAplicacion") LocalDate fechaAplicacion,
			@PathVariable("identificacionProducto") String identificacionProducto,
			@PathVariable("identificacionCadena") int identificacionCadena) {


		Optional<PricesDto> response = busqueda.buscaRegistros(fechaAplicacion, identificacionProducto, identificacionCadena);

		return response;
	}
}
