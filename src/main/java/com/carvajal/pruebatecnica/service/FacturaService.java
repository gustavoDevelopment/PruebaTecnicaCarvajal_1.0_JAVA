package com.carvajal.pruebatecnica.service;

import java.util.List;

import com.carvajal.pruebatecnica.entity.Factura;
import com.carvajal.pruebatecnica.request.ConsultarFacturaRequest;

/**
 * 
 * @author Gustavo Adolfo Lopez Mendieta(Shark_426)
 *
 */
public interface FacturaService {
	List<Factura> getFacturas();
	List<Factura> getFacturaFiltro(ConsultarFacturaRequest consulta);
}
