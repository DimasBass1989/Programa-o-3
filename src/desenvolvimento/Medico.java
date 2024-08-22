package desenvolvimento;

import java.util.Scanner;

public class Medico {
	
	private int CRM;
	private String nome;
	
	
	public int getCRM() {
		return CRM;
	}
	public void setCRM(int cRM) {
		CRM = cRM;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void cadastar() {
		Scanner cad = new Scanner(System.in);
		System.out.println("Nome: ");
		this.setNome(cad.nextLine());
		System.out.println("CRM: ");
		this.setCRM(cad.nextInt());
	}
	
	public void imprimirmedico() {
		System.out.println("Médico: " + this.getNome());
		System.out.println("CRM: " + this.getCRM());
		
	}

}
