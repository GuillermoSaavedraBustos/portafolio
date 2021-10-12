package es.capitole.portafolio.repository;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import es.capitole.portafolio.dto.PricesDto;

public interface BusquedaRegistrosRepository extends JpaRepository<PricesDto, Integer> {
	
    @Query(value = "select p"//p.productId, p.brandId, p.priceList, p.startDate, p.endDate, p.price"
    		+ " from PricesDto p "
    		+ " where :fechaAplicacion between p.startDate and p.endDate"
    		+ " and p.brandId = :identificacionCadena"
    		+ " and p.productId = :identificacionProducto", countName = "cantidad")
    Optional<PricesDto> buscaRegistros(@Param("fechaAplicacion") LocalDate fechaAplicacion,
    		@Param("identificacionProducto") int identificacionProducto,
    		@Param("identificacionCadena") int identificacionCadena);

}
