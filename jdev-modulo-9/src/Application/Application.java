package Application;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author jdev-treinamentos
 * Os exemplos aqui estão como nas aulas do curso jdev treinamentos.
 */
import javax.swing.JOptionPane;

import Classes.Aluno;
import Classes.Disciplina;

public class Application {

	public static void main(String[] args) {
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		for(int qtd = 1; qtd <= 2; qtd++) {
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno "+qtd+"?");
		/*String idade = JOptionPane.showInputDialog("Qual a idade?");
		String dataNascimento = JOptionPane.showInputDialog("Data de nascimento?");
		String rg = JOptionPane.showInputDialog("Registro Geral?");
		String cpf = JOptionPane.showInputDialog("Qual o CPF?");
		String mae = JOptionPane.showInputDialog("Nome da mãe?");
		String pai = JOptionPane.showInputDialog("Nome do pai?");
		String matricula = JOptionPane.showInputDialog("Data da matricula?");
		String serie = JOptionPane.showInputDialog("Qual a série?");
		String escola = JOptionPane.showInputDialog("Nome da escola?");*/
		
		Aluno aluno = new Aluno();
		aluno.setNome(nome);
		/*aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(pai);
		aluno1.setDataMatricula(matricula);
		aluno1.setSerieMatriculado(serie);
		aluno1.setNomeEscola(escola);*/
		
//		For Dinamico para pegar as disciplinas do Aluno
		for (int pos = 1; pos <= 4; pos++) {
			String nomeDisciplina =  JOptionPane.showInputDialog("Qual o nome da Disciplina " + pos + "?");
			String notaDisciplina =  JOptionPane.showInputDialog("Nota da Disciplina " + pos + "?");
			
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
			
			aluno.getDisciplinas().add(disciplina);
		}
		
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
		
		if(escolha == 0) {
			
			int continuarRemover = 0;
			int posicao = 1;
			
			while(continuarRemover == 0){
			String removerDisciplina = JOptionPane.showInputDialog("Qual disciplina deseja remover 1, 2, 3 ou 4?");
			aluno.getDisciplinas().remove(Integer.valueOf(removerDisciplina).intValue() - posicao);
			posicao ++;
			continuarRemover = JOptionPane.showConfirmDialog(null, "Deseja remover outra disciplina?");
			}
			
		}
		
		alunos.add(aluno);
		
		}
		
		for (Aluno aluno : alunos) {
			
			if(aluno.getNome().equalsIgnoreCase("Igor")) {
			System.out.println(aluno);
			System.out.println("Média da nota é = " + (int)aluno.getMediaNota());
			System.out.println("Resultado = " + (aluno.getAlunoAprovado()  ? "Aprovado" : "Reprovado"));
			System.out.println("Resultado 2 = " + aluno.getAlunoAprovado2());
			System.out.println("--------------------------------------------------------------------------------------");
			break;
			}
		}
		
		
 	}

}
