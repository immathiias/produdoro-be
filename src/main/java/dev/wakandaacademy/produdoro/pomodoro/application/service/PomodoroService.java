package dev.wakandaacademy.produdoro.pomodoro.application.service;

import org.springframework.stereotype.Service;

import dev.wakandaacademy.produdoro.pomodoro.domain.ConfiguracaoPadrao;

@Service
public class PomodoroService implements PomodoroApplicationService {

	@Override
	public ConfiguracaoPadrao getConfiguracaoPadrao() {
		return ConfiguracaoPadrao.builder()
				.tempoMinutosFoco(25)
				.tempoMinutosPausaCurto(5)
				.tempoMinutosPausaLonga(15)
				.repeticoesPausaLonga(3)
				.build();
	}

}
