package com.german.model.dao.impl;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.german.model.dao.UsuarioDao;
import com.german.modelo.entidad.Usuario;

@Repository
@Transactional
public class UsuarioDaoImpl implements UsuarioDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void insert(Usuario user) {
		sessionFactory.getCurrentSession().save(user);
	}
}
