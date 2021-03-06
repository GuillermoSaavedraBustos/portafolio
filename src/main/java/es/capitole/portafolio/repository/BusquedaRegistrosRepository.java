package es.capitole.portafolio.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import es.capitole.portafolio.dto.PricesDto;

@Repository
public interface BusquedaRegistrosRepository extends JpaRepository<PricesDto, Integer> {
	
    @Query(value = "select p"
    		+ " from PricesDto p "
    		+ " where :fechaAplicacion between p.startDate and p.endDate"
    		+ " and p.productId = :identificacionProducto"
    		+ " and p.brandId = :identificacionCadena")
    List<PricesDto> buscaRegistros(@Param("fechaAplicacion") LocalDateTime fechaAplicacion,
    		@Param("identificacionProducto") int identificacionProducto ,
    		@Param("identificacionCadena") int identificacionCadena);

}
