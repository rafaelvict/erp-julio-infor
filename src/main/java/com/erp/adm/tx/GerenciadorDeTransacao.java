package com.erp.adm.tx;

import java.io.Serializable;

import javax.persistence.EntityManager;

@Transacional
public class GerenciadorDeTransacao  implements Serializable{

	private static final long serialVersionUID = 1L;

	private EntityManager manager;

	//http://stackoverflow.com/questions/20760867/hibernate-postgresql-connection-with-state-idle-in-transaction
//	public Object executaTX(InvocationContext contexto) throws Exception  {
//		Object resultado = null;
//		try {
//			manager.getTransaction().begin();
//			resultado = contexto.proceed();
//			manager.getTransaction().commit();
//			
//		} catch(Exception ex) {
//			manager.getTransaction().rollback();
//			throw new Exception(ex.getMessage());
//		} finally {
//			if (manager.getTransaction().isActive()) {
//			manager.getTransaction().rollback();
//			}
//		}
//		return resultado;
//	}
}