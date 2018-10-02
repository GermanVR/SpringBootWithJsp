package com.german.model.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.german.model.dao.UsuarioDao;
import com.german.model.service.UsuarioService;
import com.german.modelo.entidad.Usuario;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioDao usuarioDaoImpl;

	@Override
	public void insert(Usuario user) {
		usuarioDaoImpl.insert(user);
	}
}
