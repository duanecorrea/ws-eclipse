package entities;

public class FisicContr extends Contr{
	
	private Double valSaude;
	
	public FisicContr() {
		super();
	}

	public FisicContr(String name, Double rendaAnual, Double valSaude) {
		super(name, rendaAnual);
		this.valSaude = valSaude;
	}		

	public Double getValSaude() {
		return valSaude;
	}

	public void setValSaude(Double valSaude) {
		this.valSaude = valSaude;
	}

	@Override
	public Double totPago() {
		
		double percImpto;
		
		if(rendaAnual < 20000)
			percImpto = 0.15;
		else
			percImpto = 0.25;		
			
		return (rendaAnual * percImpto) - (valSaude * 0.5);
	}
}
