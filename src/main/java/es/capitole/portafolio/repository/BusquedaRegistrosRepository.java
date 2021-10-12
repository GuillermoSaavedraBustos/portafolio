package es.capitole.portafolio.repository;

import java.time.LocalDate;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import es.capitole.portafolio.dto.PricesDto;

public interface BusquedaRegistrosRepository {
	
    @Query("select p from PersonModel p left join fetch p.telephones"
        	+ " left join fetch p.group left join fetch p.personExtra"
        	+ " where p.personId = :personId")
    PricesDto buscaRegistros(@Param("personId") LocalDate fechaAplicacion,
    		@Param("personId") String identificacionProducto,
    		@Param("personId") int identificacionCadena);

}
