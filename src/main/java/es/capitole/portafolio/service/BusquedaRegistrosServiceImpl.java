package es.capitole.portafolio.service;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.capitole.portafolio.dto.PricesDto;
import es.capitole.portafolio.exception.NotDataFoundException;
import es.capitole.portafolio.repository.BusquedaRegistrosRepository;

@Service
public class BusquedaRegistrosServiceImpl implements BusquedaRegistrosService {	
	
	@Autowired
	private BusquedaRegistrosRepository busquedaRepository;
	
	@Override
	public PricesDto buscaRegistros(LocalDateTime fechaAplicacion,
			int identificacionProducto,
			int identificacionCadena){	
		
		List<PricesDto> response = busquedaRepository.buscaRegistros
				(fechaAplicacion, identificacionProducto, identificacionCadena)
				;
		
		if (response.isEmpty()) {
			throw new NotDataFoundException("No se han encontrado Datos con IdProducto: " + identificacionProducto);
		}
		
		if (response.size() > 1) {
			return response.stream().max(Comparator.comparing(PricesDto::getPriority)).orElseThrow(NoSuchElementException::new);
		}
		
		 return response.get(0);
	}

}