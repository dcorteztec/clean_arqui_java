package br.com.curso.infra.indicacao;

import br.com.curso.aplicacao.indicacao.EnviarEmailIndicacao;
import br.com.curso.dominio.aluno.Aluno;

public class EnviarEmailIndicacaoComJavaMail implements EnviarEmailIndicacao {

	@Override
	public void enviarPara(Aluno indicado) {
		// logica de envio de email com a lib Java Mail
	}
}
