package dev.wakandaacademy.produdoro.usuario.application.service;

import org.springframework.stereotype.Service;

import dev.wakandaacademy.produdoro.pomodoro.domain.ConfiguracaoPadrao;
import dev.wakandaacademy.produdoro.usuario.application.api.UsuarioCriadoResponse;
import dev.wakandaacademy.produdoro.usuario.application.api.UsuarioNovoRequest;
import dev.wakandaacademy.produdoro.usuario.domain.Usuario;
import jakarta.validation.Valid;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class UsuarioService implements UsuarioApplicationService {

	@Override
	public UsuarioCriadoResponse criaNovoUsuario(@Valid UsuarioNovoRequest usuarioNovo) {
		log.info("[start] UsuarioService - criaNovoUsuario");
		
		ConfiguracaoPadrao configuracaoPadrao = getConfiguracaoPadrao();
		
		Usuario usuario = new Usuario(usuarioNovo, configuracaoPadrao);
		
		log.info("[finish] UsuarioService - criaNovoUsuario");
		return new UsuarioCriadoResponse(usuario);
	}

	private ConfiguracaoPadrao getConfiguracaoPadrao() {
		ConfiguracaoPadrao configuracaoUsuario = ConfiguracaoPadrao.builder()
			.tempoMinutosFoco(25)
			.tempoMinutosPausaCurto(5)
			.tempoMinutosPausaLonga(15)
			.repeticoesPausaLonga(3)
			.build();
		
		return configuracaoUsuario;
	}

}
