package es.capitole.portafolio.test;

import java.time.LocalDateTime;
import java.time.Month;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

import es.capitole.portafolio.InditexApplication;
import es.capitole.portafolio.dto.PricesDto;
import es.capitole.portafolio.service.BusquedaRegistrosServiceImpl;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = InditexApplication.class)
@Transactional
@Commit
public class PortafolioTest {	

	@Autowired
	private BusquedaRegistrosServiceImpl busquedaRegistroService;
	
	@Test
	public void test1()  {		
		LocalDateTime dateTime = LocalDateTime.of(2020, Month.JUNE, 14, 10, 00, 00);
		PricesDto prices = PricesDto
				.builder()
				.brandId(1)
				.price(35.5D)
				.priceList(1)
				.productId(35455)
				.build();
		
		
		PricesDto response = busquedaRegistroService.buscaRegistros(dateTime, 35455,1);
		
	    Assertions.assertNotNull(response);
//	    Assertions.assertEquals(accountModels.size(), globalBalance.getAccounts().size());

	}
	
	@Test
	public void test2() {
		LocalDateTime dateTime = LocalDateTime.of(2020, Month.JUNE, 14, 16, 00, 00);
		PricesDto prices = PricesDto
				.builder()
				.brandId(1)
				.price(25.45D)
				.priceList(2)
				.productId(35455)
				.build();

		PricesDto response = busquedaRegistroService.buscaRegistros(dateTime, 35455,1);
		Assertions.assertNotNull(response);
	}
	
	@Test
	public void test3() {
		LocalDateTime dateTime = LocalDateTime.of(2020, Month.JUNE, 14, 21, 00, 00);
		PricesDto prices = PricesDto
				.builder()
				.brandId(1)
				.price(35.5D)
				.priceList(1)
				.productId(35455)
				.build();
		
		PricesDto response = busquedaRegistroService.buscaRegistros(dateTime, 35455,1);
		Assertions.assertNotNull(response);
	}
	
	@Test	
	public void test4() {
		LocalDateTime dateTime = LocalDateTime.of(2020, Month.JUNE, 15, 10, 00, 00);
		PricesDto prices = PricesDto
				.builder()
				.brandId(1)
				.price(30.45D)
				.priceList(2)
				.productId(35455)
				.build();
		
		PricesDto response = busquedaRegistroService.buscaRegistros(dateTime, 35455,1);
		Assertions.assertNotNull(response);
	}
	
	@Test
	public void test5() {
		LocalDateTime dateTime = LocalDateTime.of(2020, Month.JUNE, 16, 21, 00, 00);
		PricesDto prices = PricesDto
				.builder()
				.brandId(1)
				.price(25.45D)
				.priceList(2)
				.productId(35455)
				.build();
		
		PricesDto response = busquedaRegistroService.buscaRegistros(dateTime, 35455,1);
		Assertions.assertNotNull(response);
	}
}
