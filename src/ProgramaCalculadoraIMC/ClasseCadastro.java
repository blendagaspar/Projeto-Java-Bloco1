package ProgramaCalculadoraIMC;

public class ClasseCadastro {

	private String nome;
	private int idade;
	private String gênero;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int string) {
		this.idade = string;
	}
	public String getGênero() {
		return gênero;
	}
	public void setGênero(String gênero) {
		this.gênero = gênero;
	}
	public void Impressao() {
		System.out.println("\t===============INFORMAÇÕES DO USUÁRIO================\n"
				+ "\n\tNome: " + nome + "\n\tIdade: " + idade + " anos"
				+ "\n\tGênero: " + gênero 
				+ "\n\t====================================================="); 
    }
}