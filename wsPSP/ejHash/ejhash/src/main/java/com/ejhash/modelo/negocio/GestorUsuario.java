package com.ejhash.modelo.negocio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejhash.modelo.entidad.Usuario;
import com.ejhash.modelo.persistencia.DaoUsuario;

@Service
public class GestorUsuario {

	@Autowired
	private DaoUsuario daoUsuario;

	public boolean validarUsuario(Usuario usuario) {
		Usuario aux = daoUsuario.findByNombreAndPassword(usuario.getNombre(), usuario.getPassword());

		if (aux != null) {
			return true;
		} else {
			return false;
		}
	}
	
	public void addUsuario(Usuario user) {
		daoUsuario.save(user);
	}
}
