package com.carvajal.pruebatecnica;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
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
import com.carvajal.pruebatecnica.request.ConsultarFacturaRequest;
import com.carvajal.pruebatecnica.service.FacturaServiceImpl;

@ExtendWith(MockitoExtension.class)
@RunWith(JUnitPlatform.class)
public class FacturaServiceImplTest {
	
	@InjectMocks
	FacturaServiceImpl facturaServiceImpl= new FacturaServiceImpl();
	
	@Mock
	FacturaComponent facturaComponent;
	
	@Test
	public void getFacturasTest() {		
		List<Factura> fac= new ArrayList<Factura>();
		fac.add(Factura.builder().numeroFactura(1).nombre("FACTURA-1").build());
		when(facturaComponent.getFacturas()).thenReturn(fac);
		List<Factura> respuesta= facturaServiceImpl.getFacturas();
		assertTrue(!respuesta.isEmpty());		
	}
	
	@Test
	public void getFacturaFiltroTest() {		
		List<Factura> fac= new ArrayList<Factura>();
		fac.add(Factura.builder().numeroFactura(1).nombre("FACTURA-1").build());
		ConsultarFacturaRequest consulta = ConsultarFacturaRequest.builder().numeroFactura(1).build();
		when(facturaComponent.getFacturaFiltro(consulta)).thenReturn(fac);	
		List<Factura> respuesta= facturaServiceImpl.getFacturaFiltro(consulta);
		assertTrue(!respuesta.isEmpty());		
	}

}
