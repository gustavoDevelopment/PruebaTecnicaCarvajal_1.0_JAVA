package com.carvajal.pruebatecnica.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 
 * @author Gustavo Adolfo Lopez Mendieta(Shark_426)
 *
 */
@Entity
@Table(name = "factura")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Factura {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "fctr_numero")
	private long numeroFactura;
	
	@Column(name = "fctr_nit_cliente")
	private String nitCliente;
	
	@Column(name = "fctr_nombre")
	private String nombre;
	
	@Column(name = "fctr_fecha")
	private Date fecha;
	
	@Column(name = "fctr_valor")
	private BigDecimal valor;
	
	@Column(name = "fctr_estado")
	private String estado;

}
