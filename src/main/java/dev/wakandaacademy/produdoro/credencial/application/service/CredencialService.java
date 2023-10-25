package dev.wakandaacademy.produdoro.credencial.application.service;

import org.springframework.stereotype.Service;

import dev.wakandaacademy.produdoro.usuario.application.api.UsuarioCriadoResponse;
import dev.wakandaacademy.produdoro.usuario.application.api.UsuarioNovoRequest;
import dev.wakandaacademy.produdoro.usuario.application.service.UsuarioApplicationService;
import jakarta.validation.Valid;

@Service
public class CredencialService implements UsuarioApplicationService {

	@Override
	public UsuarioCriadoResponse criaNovoUsuario(@Valid UsuarioNovoRequest usuarioNovo) {
		return null;
	}

}
