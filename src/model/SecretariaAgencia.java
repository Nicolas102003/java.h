package model;

public class SecretariaAgencia extends Secretaria{
	private float bonificação;
	private int cod_agencia;
	private String tipo;
	public float getBonificação() {
		return bonificação;
	}
	public void setBonificação(float bonificação) {
		this.bonificação = bonificação;
	}
	public int getCod_agencia() {
		return cod_agencia;
	}
	public void setCod_agencia(int cod_agencia) {
		this.cod_agencia = cod_agencia;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	

}
