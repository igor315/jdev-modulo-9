package Application;

import Classes.Aluno;

public class Application {

	public static void main(String[] args) {
		
//		Aluno1 � uma refer�ncia para o objeto Aluno
//		new Aluno() � uma inst�ncia(Cria��o de Objeto)
		Aluno aluno1 = new Aluno();
		
//		Nome do aluno2 "Maria" � um exemplo de atributo do Objeto
		Aluno aluno2 = new Aluno("Maria");
		
		Aluno aluno3 = new Aluno("Joao", 15);
	
		System.out.println("Nomse " + aluno1);
	}

}
