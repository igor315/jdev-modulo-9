package Application;

import Classes.Aluno;

public class Application {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Matew");
		aluno1.setDataNascimento("01/07/2000");
		aluno1.setIdade(22);
		aluno1.setRegistroGeral("222-22");
		aluno1.setNumeroCpf("111-111-111-11");
		aluno1.setNomeMae("Maria Antonia");
		aluno1.setNomePai("Sebastiao Texeira");
		aluno1.setDataMatricula("10/01/2020");
		aluno1.setNomeEscola("JDEV treinamentos");
		aluno1.setNota1(90);
		aluno1.setNota2(80.8);
		aluno1.setNota3(70.9);
		aluno1.setNota4(90.7);

		System.out.println("Nome do aluno1 = " + aluno1.getNome());
		System.out.println("Data de nascimento = " + aluno1.getDataNascimento());
		System.out.println("Idade = " + aluno1.getIdade());
		System.out.println("Registro geral " + aluno1.getRegistroGeral());
		System.out.println("N�mero CPF = " + aluno1.getNumeroCpf());
		System.out.println("Nome da m�e = " + aluno1.getNomeMae());
		System.out.println("Nome do pai = " + aluno1.getNomePai());
		System.out.println("Data da matr�cula  = " + aluno1.getDataMatricula());
		System.out.println("Nome da escola = " + aluno1.getNomeEscola());
		System.out.println(" M�dia da nota � = " + (int)aluno1.getMediaNota());
		System.out.println("Resultado = " + (aluno1.getAlunoAprovado()  ? "Aprovado" : "Reprovado"));
		System.out.println("Resultado 2 = " + aluno1.getAlunoAprovado2());
		
		

		Aluno aluno2 = new Aluno("Maria");
		
		Aluno aluno3 = new Aluno("Joao", 15);
	
	}

}
