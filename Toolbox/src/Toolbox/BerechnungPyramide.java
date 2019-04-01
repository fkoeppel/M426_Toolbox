package Toolbox;

public class BerechnungPyramide {

	public double Hoehea(double hoehe, double seitenkante) {
		double ha = Math.sqrt(Math.pow(hoehe, 2)+Math.pow((seitenkante/2), 2));
		return Math.round(ha*1000)/1000.0;
	}
	
	//Funktioniert nicht
	/*
	public double Mantellinie(double hoehe, double seite) {
		double s = Math.sqrt(Math.pow(hoehe, 2) + Math.pow(seite, 2)/2);
		return Math.round(s*1000)/1000.0;
	}
	*/
	
	public double Diagonale(double seite) {
		double d=Math.sqrt(Math.pow(seite, 2)+Math.pow(seite, 2));
		return Math.round(d*1000)/1000.0;
	}
	
	public double Umfang(double seite) {
		double umfang=4*seite;
		return Math.round(umfang*1000)/1000.0;
	}
	
	public double Grundflaeche(double seite) {
		double grundflaeche = Math.pow(seite, 2);
		return Math.round(grundflaeche*1000)/1000.0;
	}
	
	public double Mantelflaeche(double seite, double hoehea) {
		double mantelflaeche = 2*seite*hoehea;
		return Math.round(mantelflaeche*1000)/1000.0;
	}
	
	public double Oberflaeche(double seite, double hoehea) {
		double oberflaeche = Math.pow(seite, 2) + 2*seite*hoehea;
		return Math.round(oberflaeche*1000)/1000.0;
	}
	
	//Funktioniert nicht
	/*public double Volumen(double seite, double hoehe) {
		double volumen = 1/3*Math.pow(seite, 2)*hoehe;
		return Math.round(volumen*1000)/1000.0;
	}
	 */
}
