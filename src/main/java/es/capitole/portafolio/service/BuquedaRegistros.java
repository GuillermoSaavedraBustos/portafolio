package es.capitole.portafolio.service;

import java.time.LocalDate;
import java.util.List;

import es.capitole.portafolio.dto.PricesDto;

public interface BuquedaRegistros {
	
	List<PricesDto> buscaRegistros(LocalDate fechaAplicacion,
			int identificacionProducto,
			int identificacionCadena);
}
