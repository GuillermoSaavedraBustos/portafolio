package es.capitole.portafolio.service;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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
	public String obtenerReristros() {	
		return null;
	}
}