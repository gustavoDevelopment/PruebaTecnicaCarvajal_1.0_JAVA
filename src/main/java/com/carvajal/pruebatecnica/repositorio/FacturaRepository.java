package com.carvajal.pruebatecnica.repositorio;

import java.util.HashMap;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.carvajal.pruebatecnica.entity.Factura;

/**
 * 
 * @author Gustavo Adolfo Lopez Mendieta(Shark_426)
 *
 */
@Repository
public interface FacturaRepository extends JpaRepository<Factura, Long>{	
	public List<Factura> getFacturaFiltro(HashMap<String, Object> condiciones);
}
