package com.carvajal.pruebatecnica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carvajal.pruebatecnica.entity.Factura;
import com.carvajal.pruebatecnica.request.ConsultarFacturaRequest;
import com.carvajal.pruebatecnica.service.FacturaService;

/**
 * 
 * @author Gustavo Adolfo Lopez Mendieta(Shark_426) - galopez@asesoftware
 *
 */
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("carvajal/")
public class FacturaController {
	
	@Autowired
	FacturaService  facturaService;
	
	@GetMapping("/pruebatecnica/getFacturas")
	public List<Factura> getFacturas(){
		return this.facturaService.getFacturas();
	}
	
	@PostMapping("/pruebatecnica/getFacturasFiltro")	
	public List<Factura> getFacturaFiltro(@RequestBody ConsultarFacturaRequest consulta){
		return this.facturaService.getFacturaFiltro(consulta);	
	}

}
