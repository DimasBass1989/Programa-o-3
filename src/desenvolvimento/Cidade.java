package desenvolvimento;

import java.util.Scanner;

public class Cidade {
	private String nome, ddd;
	private UF uf = new UF();
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDdd() {
		return ddd;
	}
	public void setDdd(String ddd) {
		this.ddd = ddd;
	}
	public UF getUf() {
		return uf;
	}
	public void setUf(UF uf) {
		this.uf = uf;
	}
	
	public void cadastrar() {
		Scanner tec = new Scanner(System.in);
		System.out.println("Cidade:");
		this.setNome(tec.nextLine());
		System.out.println("DDD: " );
		this.setDdd(tec.nextLine());
		uf.cadastrar();
	}
	
	public void imprimirCidade() {
		System.out.println("Cidade: " + this.getNome());
		System.out.println("DDD" + this.getDdd());
		uf.imprimirUf();
	}

}
