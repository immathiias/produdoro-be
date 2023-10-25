package dev.wakandaacademy.produdoro.usuario.application.api;

import dev.wakandaacademy.produdoro.usuario.domain.ConfiguracaoUsuario;
import lombok.Value;

@Value
public class ConfiguracaoUsuarioResponse {

	private final Integer tempoMinutosFoco;
	private final Integer tempoMinutosPausaCurto;
	private final Integer tempoMinutosPausaLonga;
	private final Integer repeticoesPausaLonga;

	public ConfiguracaoUsuarioResponse(ConfiguracaoUsuario configuracao) {
		this.tempoMinutosFoco = configuracao.getTempoMinutosFoco();
		this.tempoMinutosPausaCurto = configuracao.getTempoMinutosPausaCurto();
		this.tempoMinutosPausaLonga = configuracao.getTempoMinutosPausaLonga();
		this.repeticoesPausaLonga = configuracao.getRepeticoesPausaLonga();
	}

}
