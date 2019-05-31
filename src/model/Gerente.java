package model;

public class Gerente extends Funcionario {
	private float bonificação;
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
	public float getBonificação() {
		return bonificação;
	}
	public void setBonificação(float bonificação) {
		this.bonificação = bonificação;
	}

}
