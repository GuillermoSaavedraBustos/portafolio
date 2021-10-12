package es.capitole.portafolio.service;

import java.time.LocalDate;
import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.capitole.portafolio.dto.PricesDto;
import es.capitole.portafolio.repository.BusquedaRegistrosRepository;

@Service
public class BuquedaRegistrosImpl implements BuquedaRegistros {	
	
	@Autowired
	private BusquedaRegistrosRepository busquedaRepository;
	
    @PostConstruct
    public void init() {
       //initialization of clientAccountsData
    }

	
	@Override
	public PricesDto buscaRegistros(LocalDate fechaAplicacion,
			int identificacionProducto,
			int identificacionCadena){	
		
		return busquedaRepository.buscaRegistros(fechaAplicacion, identificacionProducto, identificacionCadena);
	}
}