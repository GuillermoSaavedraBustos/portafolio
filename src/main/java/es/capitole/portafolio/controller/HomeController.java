package es.capitole.portafolio.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.capitole.portafolio.dto.PricesDto;
import es.capitole.portafolio.service.BusquedaRegistrosService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/busqueda")
public class HomeController {

	@Autowired
	BusquedaRegistrosService busqueda;

	@GetMapping(path = "/productos/{fechaAplicacion}/{identificacionProducto}/{identificacionCadena}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation("Operacion que se encarga de buscar en la tabla PRICES")
	@ApiResponses({ @ApiResponse(code = 400, message = "Bad Request"),
		@ApiResponse(code= 404, message = "Data Not Found"),
		@ApiResponse(code = 200, message = "Datos OK")})
	public ResponseEntity<PricesDto> obtenerProducto(
			@PathVariable("fechaAplicacion") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)  LocalDateTime fechaAplicacion,
			@PathVariable("identificacionProducto") int identificacionProducto,
			@PathVariable("identificacionCadena") int identificacionCadena) {
		
		PricesDto response = busqueda.buscaRegistros(fechaAplicacion, identificacionProducto, identificacionCadena);
		
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
}
