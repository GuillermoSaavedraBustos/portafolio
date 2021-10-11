package es.capitole.portafolio.repository;

import java.util.List;

import es.capitole.portafolio.dto.PricesDto;

public interface BusquedaRegistrosRepository {
	
	List<PricesDto> buscaRegistros();
	
}
