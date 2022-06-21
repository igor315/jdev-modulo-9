package Application;

import Classes.Aluno;

public class Application {

	public static void main(String[] args) {
		
//		Aluno1 é uma referência para o objeto Aluno
//		new Aluno() é uma instância(Criação de Objeto)
		Aluno aluno1 = new Aluno();
		
//		Nome do aluno2 "Maria" é um exemplo de atributo do Objeto
		Aluno aluno2 = new Aluno("Maria");
		
		Aluno aluno3 = new Aluno("Joao", 15);
	
		System.out.println("Nomse " + aluno1);
	}

}
