package ProgramaCalculadoraIMC;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
public class ClasseCadastro {

	private String nome;
	private int idade;
	private String g�nero;
	
	
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
	public String getG�nero() {
		return g�nero;
	}
	public void setG�nero(String g�nero) {
		this.g�nero = g�nero;
	}
	public void Impressao() {
		System.out.println("\t===============INFORMA��ES DO USU�RIO================\n"
				+ "\n\tNome: " + nome + "\n\tIdade: " + idade + " anos"
				+ "\n\t G�nero : " + g�nero 
				+ "\n\t====================================================="); }
		
		public void limpa() {
			try {
				Robot robot = new Robot();
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_F10);
				robot.keyPress(KeyEvent.VK_R);
				robot.keyRelease(KeyEvent.VK_SHIFT);
			}catch(AWTException e) {
			e.printStackTrace();
			}
			
			
		
		
    }
}