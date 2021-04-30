package entities;

public class JuridContr extends Contr{
	
	public Integer numFunc;
	
	public JuridContr() {
		super();
	}

	public JuridContr(String name, Double rendaAnual, Integer numFunc) {
		super(name, rendaAnual);
		this.numFunc = numFunc;
	}		

	public Integer getNumFunc() {
		return numFunc;
	}

	public void setNumFunc(Integer numFunc) {
		this.numFunc = numFunc;
	}

	@Override
	public Double totPago() {
		
		double percImpto;
		
		if(numFunc > 10)
			percImpto = 0.14;
		else
			percImpto = 0.16;	
		
		return rendaAnual * percImpto;
	}

}
