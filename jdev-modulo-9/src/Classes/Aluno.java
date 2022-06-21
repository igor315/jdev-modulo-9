package Classes;

/**
 * @author jdev-treinamentos
 * Os exemplos aqui est�o como nas aulas do curso jdev treinamentos.
 */
public class Aluno {
	
	String nome;
	int idade;
	String dataNascimento;
	String registroGeral;
	String numeroCpf;
	String nomeMae;
	String nomePai;
	String dataMatricula;
	String nomeEscola;
	String serieMatriculado;
	

	
//	O construtor cria dados na mem�ria - sendo padr�o do Java
//	Quando n�o criamos nenhum construtor, este objeto Aluno vem como default mesmo que n�o esteja escrito aqui
	public Aluno() {
		
	}

	public Aluno(String nomePadrao) {
		this.nome = nomePadrao;
	}
	
	
//	Criamos esse construtor para receber valores definidos
	public Aluno(String nomePadrao, int idadePadrao) {
		this.nome = nomePadrao;
		this.idade = idadePadrao;
	}
}
