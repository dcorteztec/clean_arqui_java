package br.com.curso.aplicacao.aluno.matricular;

import static org.junit.jupiter.api.Assertions.assertEquals;

import br.com.curso.dominio.aluno.Aluno;
import br.com.curso.dominio.aluno.CPF;
import br.com.curso.infra.aluno.RepositorioDeAlunosEmMemoria;
import org.junit.jupiter.api.Test;

class MatricularAlunoTest {

	@Test
	void alunoDeveriaSerPersistido() {
		// MOCK -> Mockito
		RepositorioDeAlunosEmMemoria repositorio = new RepositorioDeAlunosEmMemoria();
		MatricularAluno useCase = new MatricularAluno(repositorio);
		
		MatricularAlunoDto dados = new MatricularAlunoDto(
				"Fulano", 
				"123.456.789-00", 
				"fulano@email.com");
		useCase.executa(dados);
		
		Aluno encontrado = repositorio.buscarPorCPF(
				new CPF("123.456.789-00"));
		
		assertEquals("Fulano", encontrado.getNome());
		assertEquals("123.456.789-00", encontrado.getCpf());
		assertEquals("fulano@email.com", encontrado.getEmail());
	}

}
