package Classes;

/**
 * @author jdev-treinamentos
 * Os exemplos aqui estão como nas aulas do curso jdev treinamentos.
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
	

	
//	O construtor cria dados na memória - sendo padrão do Java
//	Quando não criamos nenhum construtor, este objeto Aluno vem como default mesmo que não esteja escrito aqui
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
