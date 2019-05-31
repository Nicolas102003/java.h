package model;

public class SecretariaAdministrativa extends Secretaria{
	private float bonificação;
	private int cod_administrativo;
	private String area;
	public float getBonificação() {
		return bonificação;
	}
	public void setBonificação(float bonificação) {
		this.bonificação = bonificação;
	}
	public int getCod_administrativo() {
		return cod_administrativo;
	}
	public void setCod_administrativo(int cod_administrativo) {
		this.cod_administrativo = cod_administrativo;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}

}
