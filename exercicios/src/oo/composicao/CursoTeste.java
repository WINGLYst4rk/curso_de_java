package oo.composicao;

public class CursoTeste {

	public static void main(String[] args) {

		Aluno aluno1 = new Aluno("Maria");
		Aluno aluno2 = new Aluno("carlos");
		Aluno aluno3 = new Aluno("João");

		Curso curso1 = new Curso("React Native");
		Curso curso2 = new Curso("Java Completo");
		Curso curso3 = new Curso("Web 2023");

		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);

		curso2.adicionarAluno(aluno1);
		curso2.adicionarAluno(aluno3);
		
		aluno1.adicionarCurso(curso3);
		aluno2.adicionarCurso(curso3);
		aluno3.adicionarCurso(curso3);

		for (Aluno aluno : curso3.alunos) {
			System.out.printf("Estou matriculado no curso: %s...\n", curso3.nome);
			System.out.printf("...e o meu nome è: %s\n", aluno.nome);
			System.out.println();
		}
		
		System.out.println(aluno1.cursos.get(0).alunos);
		
		Curso cursoEncontrado = aluno1.obterCursoPorNome("React Native");
		
		if(cursoEncontrado != null) {
			System.out.println(cursoEncontrado.nome);
			System.out.println(cursoEncontrado.alunos);
		}
	}

}
