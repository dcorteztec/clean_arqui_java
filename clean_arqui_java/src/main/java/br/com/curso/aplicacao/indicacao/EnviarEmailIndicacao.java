package br.com.curso.aplicacao.indicacao;

import br.com.curso.dominio.aluno.Aluno;

public interface EnviarEmailIndicacao {
	
	void enviarPara(Aluno indicado);

}
