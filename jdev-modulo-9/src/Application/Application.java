package Application;
/**
 * @author jdev-treinamentos
 * Os exemplos aqui estão como nas aulas do curso jdev treinamentos.
 */
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
		
		String diciplina1 = JOptionPane.showInputDialog("Disciplina 1?");
		String nota1 = JOptionPane.showInputDialog("Nota 1?");
		String diciplina2 = JOptionPane.showInputDialog("Disciplina 2?");
		String nota2 = JOptionPane.showInputDialog("Nota 2?");
		String diciplina3 = JOptionPane.showInputDialog("Disciplina 3?");
		String nota3 = JOptionPane.showInputDialog("Nota 3?");
		String diciplina4 = JOptionPane.showInputDialog("Disciplina 4?");
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
		
		aluno1.getDisciplina().setNota1(Double.parseDouble(nota1));
		aluno1.getDisciplina().setNota2(Double.parseDouble(nota2));
		aluno1.getDisciplina().setNota3(Double.parseDouble(nota3));
		aluno1.getDisciplina().setNota4(Double.parseDouble(nota4));
		
		aluno1.getDisciplina().setDisciplina1(diciplina1);
		aluno1.getDisciplina().setDisciplina2(diciplina2);
		aluno1.getDisciplina().setDisciplina3(diciplina3);
		aluno1.getDisciplina().setDisciplina4(diciplina4);
		
		System.out.println(aluno1.toString());
		System.out.println("Média da nota é = " + (int)aluno1.getMediaNota());
		System.out.println("Resultado = " + (aluno1.getAlunoAprovado()  ? "Aprovado" : "Reprovado"));
		System.out.println("Resultado 2 = " + aluno1.getAlunoAprovado2());
		
 	}

}
