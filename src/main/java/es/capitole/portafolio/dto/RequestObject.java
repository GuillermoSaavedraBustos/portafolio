package es.capitole.portafolio.dto;

import java.time.LocalDate;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@ApiModel("Objeto Request")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RequestObject {
	@ApiModelProperty("Fecha Aplicacion")
	@NonNull
	private LocalDate fechaAplicacion;
	
	@ApiModelProperty("Identificacion producto")
	@NonNull
	private String identificacionProducto;
	
	@ApiModelProperty("Identificacion de cadena")
	@NonNull
	private int identificacionCadena;
}
