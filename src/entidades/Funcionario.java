package entidades;

public class Funcionario {

	private String nome;
	private int idade;
	private long CPF;

	public Funcionario() {

	}

	public Funcionario(String nome, int idade, long cPF) {
		this.nome = nome;
		this.idade = idade;
		this.CPF = cPF;
	}

	public Funcionario(String nome, long cPF) {
		super();
		this.nome = nome;
		this.CPF = cPF;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public long getCPF() {
		return CPF;
	}

	public void setCPF(long cPF) {
		this.CPF = cPF;
	}

	public String toString() {
		return nome + ", portador do CPF: " + CPF + " e com " + idade + " anos.";
	}

}
