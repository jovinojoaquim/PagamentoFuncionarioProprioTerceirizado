package entities;

public class Trabalhador {
	protected String nome;
	protected Double valorHora;
	protected Integer horas;
	
	public Trabalhador() {
	}
	
	public Trabalhador(String nome, Double valorHora, Integer horas) {
		this.nome = nome;
		this.valorHora = valorHora;
		this.horas = horas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValorHora() {
		return valorHora;
	}

	public void setValorHora(Double valorHora) {
		this.valorHora = valorHora;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}
	
	public double pagamento() {
		return valorHora*horas;
	}
	
	
}
