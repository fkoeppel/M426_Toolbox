package Toolbox;



/*
 * author:		Joel Stauffiger
 * element:		030
 * date:		25.03.19
 * 
 */

public class GewichtsmasseUmwandeln {

	//Funktionen
	public double GrammtoKilogramm(double gramm){
		double kilogramm=gramm*0.001;
		return kilogramm;
	}
	
	public double KilogrammtoGramm(double kilogramm){
		double gramm = kilogramm*1000;
		return gramm;
	}
	
	public double GrammtoTonne(double gramm){
		double tonne = gramm*0.000001;
		return tonne;
	}
	
	public double TonnetoGramm(double tonne){
		double gramm = tonne*1000000;
		return gramm;
	}
	
	public double GrammtoPfund(double gramm){
		double pfund = gramm*0.00220462;
		return pfund;
	}
	
	public double PfundtoGramm(double pfund){
		double gramm = pfund*453.592;
		return gramm;
	}
	
	public double KilogrammtoTonne(double kilogramm){
		double tonne = kilogramm*0.001;
		return tonne;
	}
	
	public double TonnetoKilogramm(double tonne){
		double kilogramm = tonne*1000;
		return kilogramm;
	}
	
	public double KilogrammtoPfund(double kilogramm) {
		double pfund=kilogramm*2.20462;
		return pfund;
	}
	
	public double PfundtoKilogramm(double pfund) {
		double kilogramm=pfund*0.453592;
		return kilogramm;
	}
	
	public double TonnetoPfund(double tonne) {
		double pfund = tonne*2204.62;
		return pfund;
	}
	
	public double PfundtoTonne(double pfund) {
		double tonne = pfund*0.000453592;
		return tonne;
	}
}

