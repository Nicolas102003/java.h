package model;

public class Gerente extends Funcionario {
	private float bonifica��o;
	private String empresa;
	private String agenda;
	private int n_funcionarios;
	
	

	public int getN_funcionarios() {
		return n_funcionarios;
	}
	public void setN_funcionarios(int n_funcionarios) {
		this.n_funcionarios = n_funcionarios;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public String getAgenda() {
		return agenda;
	}
	public void setAgenda(String agenda) {
		this.agenda = agenda;
	}
	public float getBonifica��o() {
		return bonifica��o;
	}
	public void setBonifica��o(float bonifica��o) {
		this.bonifica��o = bonifica��o;
	}

}
