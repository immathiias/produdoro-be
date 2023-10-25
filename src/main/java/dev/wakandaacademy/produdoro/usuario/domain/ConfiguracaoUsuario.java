package dev.wakandaacademy.produdoro.usuario.domain;

import dev.wakandaacademy.produdoro.pomodoro.domain.ConfiguracaoPadrao;
import lombok.Getter;

@Getter
public class ConfiguracaoUsuario {

	private Integer tempoMinutosFoco;
	private Integer tempoMinutosPausaCurto;
	private Integer tempoMinutosPausaLonga;
	private Integer repeticoesPausaLonga;
	

	public ConfiguracaoUsuario(ConfiguracaoPadrao configuracaoPadrao) {
		this.tempoMinutosFoco = configuracaoPadrao.getTempoMinutosFoco();
		this.tempoMinutosPausaCurto = configuracaoPadrao.getTempoMinutosPausaCurto();
		this.tempoMinutosPausaLonga = configuracaoPadrao.getTempoMinutosPausaLonga();
		this.repeticoesPausaLonga = configuracaoPadrao.getRepeticoesPausaLonga();
	}

}
