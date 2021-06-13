package ProgramaCalculadoraIMC;

public class calculadoraImc {
	
	private double calculoImc;
	private double peso1;
	private double altura1;
	
	public double getCalculoImc() {
		return calculoImc;
	}
	public void setCalculoImc(double calculoImc) {
		this.calculoImc = calculoImc;
	}
	public double getPeso1() {
		return peso1;
	}
	public void setPeso1(double peso1) {
		this.peso1 = peso1;
	}
	public double getAltura1() {
		return altura1;
	}
	public void setAltura1(double altura1) {
		this.altura1 = altura1;
	}
	public double setCalculoImc (double peso, double altura) {
		calculoImc = calculoImc + peso / (altura * altura);
		System.out.println("\t==============PESO E ALTURA=================\n"
				+ "\n\tPeso: " + peso + " kg" + "\n\tAltura: " + altura + " metros"
				+ "\n\t============================================");
		return calculoImc;
	}
}





