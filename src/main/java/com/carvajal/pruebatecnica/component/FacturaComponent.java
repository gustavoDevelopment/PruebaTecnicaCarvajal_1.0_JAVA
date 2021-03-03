package com.carvajal.pruebatecnica.component;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.carvajal.pruebatecnica.entity.Factura;
import com.carvajal.pruebatecnica.repositorio.FacturaRepository;
import com.carvajal.pruebatecnica.request.ConsultarFacturaRequest;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * @author Gustavo Adolfo Lopez Mendieta(Shark_426)
 *
 */
@Component
@Slf4j
public class FacturaComponent {

	@Autowired
	FacturaRepository facturaRepository;

	public List<Factura> getFacturas(){
		log.info("Llamado al metodo getFacturas");
		return facturaRepository.findAll();
	}

	public List<Factura> getFacturaFiltro(ConsultarFacturaRequest consulta){
		log.info("Llamado al metodo getFacturaFiltro");
		HashMap<String, Object> condiciones= new HashMap<String, Object>();
		if(consulta!=null) {
			if(consulta.getNumeroFactura()!=0) {
				condiciones.put(ConsultarFacturaRequest.PROP_NUMERO_FACTURA, consulta.getNumeroFactura());
			}
			
			if(consulta.getNitCliente()!=null && !consulta.getNitCliente().trim().equals("")) {
				condiciones.put(ConsultarFacturaRequest.PROP_NIT_CLIENTE, consulta.getNitCliente());
			}
		}
		return facturaRepository.getFacturaFiltro(condiciones);
	}



}
