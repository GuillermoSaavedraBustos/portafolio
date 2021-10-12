package es.capitole.portafolio.service;

import java.time.LocalDate;
import java.util.Optional;

import es.capitole.portafolio.dto.PricesDto;

public interface BuquedaRegistros {
	
	Optional<PricesDto> buscaRegistros(LocalDate fechaAplicacion,
			int identificacionProducto,
			int identificacionCadena);
}
