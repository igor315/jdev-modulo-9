package Application;

import javax.swing.JOptionPane;

import Classes.Aluno;

public class Application {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
		String idade = JOptionPane.showInputDialog("Qual a idade?");
		String dataNascimento = JOptionPane.showInputDialog("Data de nascimento?");
		String rg = JOptionPane.showInputDialog("Registro Geral?");
		String cpf = JOptionPane.showInputDialog("Qual o CPF?");
		String mae = JOptionPane.showInputDialog("Nome da mãe?");
		String pai = JOptionPane.showInputDialog("Nome do pai?");
		String matricula = JOptionPane.showInputDialog("Data da matricula?");
		String serie = JOptionPane.showInputDialog("Qual a série?");
		String escola = JOptionPane.showInputDialog("Nome da escola?");
		String nota1 = JOptionPane.showInputDialog("Nota 1?");
		String nota2 = JOptionPane.showInputDialog("Nota 2?");
		String nota3 = JOptionPane.showInputDialog("Nota 3?");
		String nota4 = JOptionPane.showInputDialog("Nota 4?");
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(pai);
		aluno1.setDataMatricula(matricula);
		aluno1.setNomeEscola(escola);
		aluno1.setNota1(Integer.valueOf(nota1));
		aluno1.setNota2(Integer.valueOf(nota2));
		aluno1.setNota3(Integer.valueOf(nota2));
		aluno1.setNota4(Integer.valueOf(nota4));

		System.out.println("Nome do aluno1 = " + aluno1.getNome());
		System.out.println("Data de nascimento = " + aluno1.getDataNascimento());
		System.out.println("Idade = " + aluno1.getIdade());
		System.out.println("Registro geral " + aluno1.getRegistroGeral());
		System.out.println("Número CPF = " + aluno1.getNumeroCpf());
		System.out.println("Nome da mãe = " + aluno1.getNomeMae());
		System.out.println("Nome do pai = " + aluno1.getNomePai());
		System.out.println("Data da matrícula  = " + aluno1.getDataMatricula());
		System.out.println("Nome da escola = " + aluno1.getNomeEscola());
		System.out.println("Média da nota é = " + (int)aluno1.getMediaNota());
		System.out.println("Resultado = " + (aluno1.getAlunoAprovado()  ? "Aprovado" : "Reprovado"));
		System.out.println("Resultado 2 = " + aluno1.getAlunoAprovado2());
		
		

		Aluno aluno2 = new Aluno("Maria");
		
		Aluno aluno3 = new Aluno("Joao", 15);
	
	}

}
