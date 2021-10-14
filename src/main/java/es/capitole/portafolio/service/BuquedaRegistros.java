package es.capitole.portafolio.service;

import java.time.LocalDateTime;
import java.util.List;

import es.capitole.portafolio.dto.PricesDto;

public interface BuquedaRegistros {
	
	List<PricesDto> buscaRegistros(LocalDateTime fechaAplicacion,
			int identificacionProducto,
			int identificacionCadena);
}
