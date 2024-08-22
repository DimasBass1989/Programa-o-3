package desenvolvimento;

import java.util.Scanner;

public class UF {
	private String nome;
	private String siglas;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSiglas() {
		return siglas;
	}
	public void setSiglas(String siglas) {
		this.siglas = siglas;
	}
	
	public void cadastrar() {
		Scanner tec = new Scanner(System.in);
		System.out.println("Estado: ");
		this.setNome(tec.nextLine());
		System.out.println("Sigla: ");
		this.setSiglas(tec.nextLine());
	}
	
	public void imprimirUf() {
		System.out.println("Estado: " + this.getNome());
		System.out.println("Sigla: " + this.getSiglas());
	}

}
