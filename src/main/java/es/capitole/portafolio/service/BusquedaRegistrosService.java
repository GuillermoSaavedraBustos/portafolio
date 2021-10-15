package es.capitole.portafolio.service;

import java.time.LocalDateTime;

import es.capitole.portafolio.dto.PricesDto;

public interface BusquedaRegistrosService {
	
	PricesDto buscaRegistros(LocalDateTime fechaAplicacion,
			int identificacionProducto,
			int identificacionCadena);
}
