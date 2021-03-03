package com.carvajal.pruebatecnica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carvajal.pruebatecnica.component.FacturaComponent;
import com.carvajal.pruebatecnica.entity.Factura;
import com.carvajal.pruebatecnica.request.ConsultarFacturaRequest;

/**
 * 
 * @author Gustavo Adolfo Lopez Mendieta(Shark_426)
 *
 */
@Service
public class FacturaServiceImpl implements FacturaService{
	
	@Autowired
	FacturaComponent facturaComponent;
	
	@Override
	public List<Factura> getFacturas(){
		return this.facturaComponent.getFacturas();
	}
	
	@Override
	public List<Factura> getFacturaFiltro(ConsultarFacturaRequest consulta){
		return this.facturaComponent.getFacturaFiltro(consulta);
	}

}
