package Application;

import Classes.Aluno;

public class Application {

	public static void main(String[] args) {
		
//		Aluno1 é um objeto da Classe Aluno
		Aluno aluno1 = new Aluno();
		
		Aluno aluno2 = new Aluno("Maria");
		
		Aluno aluno3 = new Aluno("Joao", 15);
	
		System.out.println("Nomse " + aluno1);
	}

}
