package model;

public abstract class Funcionario {
	private String nome;
	private String fun��o;
	private String departamento;
	private String endereco;
	private long cep;
	private long cpf;
	private float salario;
	private double registro;
	
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public double getRegistro() {
		return registro;
	}
	public void setRegistro(double registro) {
		this.registro = registro;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFun��o() {
		return fun��o;
	}
	public void setFun��o(String fun��o) {
		this.fun��o = fun��o;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public long getCep() {
		return cep;
	}
	public void setCep(long cep) {
		this.cep = cep;
	}
	public long getCpf() {
		return cpf;
	}
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	

}
