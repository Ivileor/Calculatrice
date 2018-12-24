package com.calculatrice.bean;

public class Calcul {
	private double nb1;
	private double nb2;
	private double resultat;
	
	public Calcul(String nombre1,String operateur,String nombre2){
		if(nombre1.isEmpty()) {
			this.nb1 = 0;
		}else{
			this.nb1 = Double.parseDouble(nombre1);
		}
		if(nombre2.isEmpty()) {
			this.nb2 = 0;
		}
		else {
			this.nb2 = Double.parseDouble(nombre2);
		}
		int ope = Integer.parseInt(operateur);
		switch(ope)
		{
		case 1: this.setResultat(nb1+nb2);
				break;
		case 2: this.setResultat(nb1-nb2);
				break;
		case 3: this.setResultat(nb1*nb2);
				break;
		case 4: this.setResultat(nb1/nb2);
				break;
		}
		
	}
	

	public double getResultat() {
		return resultat;
	}
	public void setResultat(double resultat) {
		this.resultat = resultat;
	}
	public double getNb1() {
		return nb1;
	}
	public void setNb1(double nb1) {
		this.nb1 = nb1;
	}
	public double getNb2() {
		return nb2;
	}
	public void setNb2(double nb2) {
		this.nb2 = nb2;
	}
}
