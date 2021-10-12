package es.capitole.portafolio.service;

import java.time.LocalDate;

import es.capitole.portafolio.dto.PricesDto;

public interface BuquedaRegistros {
	
	PricesDto buscaRegistros(LocalDate fechaAplicacion,
			int identificacionProducto,
			int identificacionCadena);
}
