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
		String mae = JOptionPane.showInputDialog("Nome da m�e?");
		String pai = JOptionPane.showInputDialog("Nome do pai?");
		String matricula = JOptionPane.showInputDialog("Data da matricula?");
		String serie = JOptionPane.showInputDialog("Qual a s�rie?");
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
		aluno1.setSerieMatriculado(serie);
		aluno1.setNomeEscola(escola);
		aluno1.setNota1(Integer.valueOf(nota1));
		aluno1.setNota2(Integer.valueOf(nota2));
		aluno1.setNota3(Integer.valueOf(nota2));
		aluno1.setNota4(Integer.valueOf(nota4));
		
		System.out.println(aluno1.toString());
		System.out.println("M�dia da nota � = " + (int)aluno1.getMediaNota());
		System.out.println("Resultado = " + (aluno1.getAlunoAprovado()  ? "Aprovado" : "Reprovado"));
		System.out.println("Resultado 2 = " + aluno1.getAlunoAprovado2());
	
	}

}
