package Classes;

/**
 * @author jdev-treinamentos
 * Os exemplos aqui estão como nas aulas do curso jdev treinamentos.
 */
public class Aluno {
	
//	Esses são os atributos do Aluno
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
	
//	Veremos os metodos SETTERS e GETTERS do objeto
//	SET é para adicionar ou receber dados para os atributos
//	GET é para resgatar ou obter o valor dos atributos

	
//	retorna os dados
	public String getNome() {
		return nome;
	}
	
//	recebe os dados
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}

	public String getNumeroCpf() {
		return numeroCpf;
	}

	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}
	

	
}
