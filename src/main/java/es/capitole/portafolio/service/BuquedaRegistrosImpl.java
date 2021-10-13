package es.capitole.portafolio.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.capitole.portafolio.dto.PricesDto;
import es.capitole.portafolio.exception.NotDataFoundException;
import es.capitole.portafolio.repository.BusquedaRegistrosRepository;
import lombok.extern.slf4j.Slf4j;


@Service
@Slf4j
public class BuquedaRegistrosImpl implements BuquedaRegistros {	
	
	@Autowired
	private BusquedaRegistrosRepository busquedaRepository;
	
    @PostConstruct
    public void init() {
       //initialization of clientAccountsData
    }

	
	@Override
	public List<PricesDto> buscaRegistros(LocalDate fechaAplicacion,
			int identificacionProducto,
			int identificacionCadena){	
		
		List<PricesDto> response = busquedaRepository.buscaRegistros
				(fechaAplicacion, identificacionProducto, identificacionCadena)
				;
		
		if (response.isEmpty()) {
			throw new NotDataFoundException("No se han encontrado Datos con IdProducto: " + identificacionProducto);
		}
			
		
		 return response;
	}
}