package com.carvajal.pruebatecnica;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.carvajal.pruebatecnica.entity.Factura;
import com.carvajal.pruebatecnica.repositorio.FacturaRepository;

/**
 * 
 * @author Gustavo Adolfo Lopez Mendieta(Shark_426)
 *
 */
@SpringBootApplication
public class PruebaTenicaCarvajalApplication implements CommandLineRunner {

	@Autowired
	FacturaRepository facturaRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(PruebaTenicaCarvajalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		this.facturaRepository.save(Factura.builder().nitCliente("11111111").nombre("FACTURA-1").fecha(new Date()).valor(new BigDecimal("1500000")).estado("ACT").build());
		this.facturaRepository.save(Factura.builder().nitCliente("5488722").nombre("FACTURA-2").fecha(new Date()).valor(new BigDecimal("1500000")).estado("ACT").build());
		this.facturaRepository.save(Factura.builder().nitCliente("784545245").nombre("FACTURA-3").fecha(new Date()).valor(new BigDecimal("1500000")).estado("ACT").build());
		this.facturaRepository.save(Factura.builder().nitCliente("1111121121111").nombre("FACTURA-4").fecha(new Date()).valor(new BigDecimal("10000")).estado("ACT").build());
		this.facturaRepository.save(Factura.builder().nitCliente("123123123").nombre("FACTURA-5").fecha(new Date()).valor(new BigDecimal("100000")).estado("ACT").build());
		this.facturaRepository.save(Factura.builder().nitCliente("123123123").nombre("FACTURA-6").fecha(new Date()).valor(new BigDecimal("178500000")).estado("ACT").build());
		this.facturaRepository.save(Factura.builder().nitCliente("12312379").nombre("FACTURA-7").fecha(new Date()).valor(new BigDecimal("155500000")).estado("BLO").build());
		this.facturaRepository.save(Factura.builder().nitCliente("7811274").nombre("FACTURA-8").fecha(new Date()).valor(new BigDecimal("10500000")).estado("INA").build());
		this.facturaRepository.save(Factura.builder().nitCliente("1714714").nombre("FACTURA-9").fecha(new Date()).valor(new BigDecimal("5500000")).estado("INA").build());
		this.facturaRepository.save(Factura.builder().nitCliente("1442424").nombre("FACTURA-10").fecha(new Date()).valor(new BigDecimal("1500000")).estado("BLO").build());
		this.facturaRepository.save(Factura.builder().nitCliente("754124657").nombre("FACTURA-11").fecha(new Date()).valor(new BigDecimal("500000")).estado("INA").build());
		this.facturaRepository.save(Factura.builder().nitCliente("76796").nombre("FACTURA-12").fecha(new Date()).valor(new BigDecimal("1200000")).estado("ACT").build());
		
	}

}
