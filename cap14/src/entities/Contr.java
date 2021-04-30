package entities;

public abstract class Contr {
	
	protected String name;
	protected Double rendaAnual;
	
	public Contr() {
		
	}

	public Contr(String name, Double rendaAnual) {		
		this.name = name;
		this.rendaAnual = rendaAnual;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getRendaAnual() {
		return rendaAnual;
	}

	public void setRendaAnual(Double rendaAnual) {
		this.rendaAnual = rendaAnual;
	};
	
	public abstract Double totPago();	
		

}
