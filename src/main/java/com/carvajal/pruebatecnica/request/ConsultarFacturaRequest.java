package com.carvajal.pruebatecnica.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ConsultarFacturaRequest {
	
	public static final String PROP_NUMERO_FACTURA="numeroFactura";
	public static final String PROP_NIT_CLIENTE="nitCliente";
	
	private long numeroFactura;
	private String nitCliente;	

}
