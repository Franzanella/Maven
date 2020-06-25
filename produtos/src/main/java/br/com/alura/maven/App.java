package br.com.alura.maven;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Produto produto = new Produto("Bala Juquinha", 0.15);
		System.out.println("O nome da bala é: " + produto.getNome()  + " e custa: " + produto.getPreco());
	}
}
