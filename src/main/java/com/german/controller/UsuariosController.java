package com.german.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.german.model.service.UsuarioService;
import com.german.modelo.entidad.Usuario;

@RestController
@RequestMapping(value = "/users")
public class UsuariosController {

	@Autowired
	private UsuarioService usuarioServiceImpl;

	@PostMapping(consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> insertaUsuario(Usuario user) {
		try {
			usuarioServiceImpl.insert(user);
			return ResponseEntity.ok().body("Insertado Correctamente");
		} catch (Exception e) {
			return ResponseEntity.badRequest().body("Error al insertar: " + e.getMessage());
		}
	}
}
