package model;

public class Diretor extends Gerente {
	private String area;
	private String projeto;
	private int quantidade_filiais;
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getProjeto() {
		return projeto;
	}
	public void setProjeto(String projeto) {
		this.projeto = projeto;
	}
	public int getQuantidade_filiais() {
		return quantidade_filiais;
	}
	public void setQuantidade_filiais(int quantidade_filiais) {
		this.quantidade_filiais = quantidade_filiais;
	}
	
	

}
