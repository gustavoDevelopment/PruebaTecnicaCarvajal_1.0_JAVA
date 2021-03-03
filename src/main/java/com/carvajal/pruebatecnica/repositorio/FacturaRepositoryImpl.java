package com.carvajal.pruebatecnica.repositorio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.carvajal.pruebatecnica.entity.Factura;
import com.carvajal.pruebatecnica.request.ConsultarFacturaRequest;

/**
 * 
 * @author Gustavo Adolfo Lopez Mendieta(Shark_426)
 *
 */
public class FacturaRepositoryImpl {

	@PersistenceContext
	private EntityManager entityManager;

	public List<Factura> getFacturaFiltro(HashMap<String, Object> condiciones){
		if(!condiciones.isEmpty()) {
			CriteriaBuilder crtrBldr= entityManager.getCriteriaBuilder();
			CriteriaQuery<Factura> consulta= crtrBldr.createQuery(Factura.class);
			Root<Factura> root= consulta.from(Factura.class);
			List<Predicate> predicados= new ArrayList<>();

			condiciones.forEach((field,value)->{
				switch (field) {
				case ConsultarFacturaRequest.PROP_NUMERO_FACTURA:
					predicados.add(crtrBldr.equal (root.get(field), (long)value));
					break;

				case ConsultarFacturaRequest.PROP_NIT_CLIENTE:
					predicados.add(crtrBldr.equal (root.get(field), (String)value));
					break;

				default:
					break;
				}
			});
			consulta.select(root).where(predicados.toArray(new Predicate[predicados.size()]));		
			return entityManager.createQuery(consulta).getResultList();
		}
		return new ArrayList<Factura>();
	}
}
