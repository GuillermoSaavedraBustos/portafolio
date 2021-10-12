package es.capitole.portafolio.dto;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Positive;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@ApiModel ("Clase de los precios")
@Table(name="PRICES")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PricesDto {

	@Id
	@ApiModelProperty("ID producto")
	@Column(name = "PRODUCT_ID")
	@Positive
	private int productId;
	
	@ApiModelProperty("ID Brnad")
	@Column(name = "BRAND_ID")
	@Positive
	private int brandId;
	
	@ApiModelProperty("Precio de lista")
	@Column(name = "PRICE_LIST")
	private int priceList;
	
	@ApiModelProperty("Fecha inicio")
	@Column(name = "START_DATE")
	private LocalDate startDate;
	
	@ApiModelProperty("Fecha fin")
	@Column(name = "END_DATE")
	private LocalDate endDate;

	/*
	@ApiModelProperty("Prioridad")
	@Column(name = "PRIORITY")
	@Positive
	private int priority;
	*/
	
	@ApiModelProperty("Precio")
	@Column(name = "PRICE")
	@Positive
	private double price;
	
	@ApiModelProperty("Ocurrencia")
	@Column(name = "CURR")
	@Positive
	private String curr;
}
