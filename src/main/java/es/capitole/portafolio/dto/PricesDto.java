package es.capitole.portafolio.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="PRICES")
@Getter
@Setter
@AllArgsConstructor
public class PricesDto {

	@Column(name = "product_id") 
	private int productId;
	
	@Column(name = "brand_id")
	private int brandId;
	
	@Column(name = "start_date")
	private Date startDate;
	
	@Column(name = "end_date")
	private Date endDate;
	
	@Column(name = "price_list")
	private int priceList;
	
	@Column(name = "priority")
	private int priority;
	
	@Column(name = "price")
	private int  price;
	
	@Column(name = "curr")
	private String curr;
}
