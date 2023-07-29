package entidades;

public class Produto {
	
	
	private String nomeProd;
	private double preco;
	
	public Produto() {
		
	}
	
	public Produto(String nomeProd, double preco) {
		this.nomeProd = nomeProd;
		this.preco = preco;
	}

	public String getNomeProd() {
		return nomeProd;
	}

	public void setNomeProd(String nomeProd) {
		this.nomeProd = nomeProd;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
}
