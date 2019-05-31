package model;

public abstract class Secretaria extends Funcionario{

	private String função;
	private int n_agendapresidente;
	private int n_agendadiretor;
	private int n_agendagerente;
	
	public int getN_agendapresidente() {
		return n_agendapresidente;
	}
	public void setN_agendapresidente(int n_agendapresidente) {
		this.n_agendapresidente = n_agendapresidente;
	}
	public int getN_agendadiretor() {
		return n_agendadiretor;
	}
	public void setN_agendadiretor(int n_agendadiretor) {
		this.n_agendadiretor = n_agendadiretor;
	}
	public int getN_agendagerente() {
		return n_agendagerente;
	}
	public void setN_agendagerente(int n_agendagerente) {
		this.n_agendagerente = n_agendagerente;
	}
	public String getFunção() {
		return função;
	}
	public void setFunção(String função) {
		this.função = função;
	}
	

}
