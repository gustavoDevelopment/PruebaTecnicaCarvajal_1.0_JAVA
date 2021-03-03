package com.carvajal.pruebatecnica;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.carvajal.pruebatecnica.component.FacturaComponent;
import com.carvajal.pruebatecnica.entity.Factura;
import com.carvajal.pruebatecnica.repositorio.FacturaRepository;
import com.carvajal.pruebatecnica.request.ConsultarFacturaRequest;

/**
 * 
 * @author Gustavo Adolfo Lopez Mendieta(Shark_426)
 *
 */
@ExtendWith(MockitoExtension.class)
@RunWith(JUnitPlatform.class)
public class FacturaComponentTest {
	
	@InjectMocks
	FacturaComponent facturaComponent= new FacturaComponent();
	
	@Mock
	FacturaRepository  facturaRepository;
	
	@Test
	public void getFacturasTest() {		
		List<Factura> fac= new ArrayList<Factura>();
		fac.add(Factura.builder().numeroFactura(1).nombre("FACTURA-1").build());
		when(facturaRepository.findAll()).thenReturn(fac);
		List<Factura> respuesta= facturaComponent.getFacturas();
		assertTrue(!respuesta.isEmpty());		
	}
	
	@Test
	public void getFacturaFiltroTest() {
		List<Factura> fac= new ArrayList<Factura>();
		fac.add(Factura.builder().numeroFactura(1).nombre("FACTURA-1").build());
		ConsultarFacturaRequest consulta = ConsultarFacturaRequest.builder().numeroFactura(1).nitCliente("11111111").build();
		HashMap<String, Object> data= new HashMap<String, Object>();
		data.put(ConsultarFacturaRequest.PROP_NUMERO_FACTURA, Long.valueOf("1"));
		data.put(ConsultarFacturaRequest.PROP_NIT_CLIENTE,String.valueOf("11111111"));
		when(facturaRepository.getFacturaFiltro(data)).thenReturn(fac);		
		List<Factura> respuesta= facturaComponent.getFacturaFiltro(consulta);
		assertTrue(!respuesta.isEmpty());		
	}
	
	

}
