package entities;

public class Terceirizado extends Trabalhador{
	
	private Double adicional;
	
	public Terceirizado() {
		super();
	}
	
	public Terceirizado(String nome, Double valorHora, Integer horas, Double adicional) {
		super(nome, valorHora, horas);
		this.adicional = adicional;
	}


	public Double getAdicional() {
		return adicional;
	}

	public void setAdicional(Double adicional) {
		this.adicional = adicional;
	}

	@Override
	public double pagamento() {
		return super.pagamento() + adicional * 1.1;
	}
}
