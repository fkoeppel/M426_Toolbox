package Toolbox;
/*
 * author:		Federico Degan
 * element:		#020
 * date:		25.03.19
 * 
 */

import java.text.DecimalFormat;

public class TriangleCalc {
	 DecimalFormat df = new DecimalFormat(".##");

	public double TriangleGleichSeitigUmfang(double Seite) {
		if(Seite>0)
			return Math.round(3*Seite*100)/100;
		else {
			System.out.println("Bad Data TriangleGleichSeitigUmfang");
			return 0;
		}
	}
	
	public double TriangleGleichSeitigFlaeche(double Seite) {
		if(Seite>0) {
			return Math.round((Math.pow(Seite, 2)/4)*Math.sqrt(3)*100)/100;
		}
		else {
			System.out.println("Bad Data TriangleGleichSeitigFlaeche");
			return 0;
		}
	}
	
	public double Triangle2SeitenWinkel(double SeiteA, double SeiteB, double Winkelin) {
		
		if((SeiteA+SeiteB+Winkelin)>0) {
			if(Winkelin>0&&Winkelin<=360) {
				double flaeche;
				double Winkel = Winkelin;
				Winkel = Math.toRadians(Winkel);					
				flaeche = 0.5*SeiteA*SeiteB*Math.sin(Winkel);
				
				return Math.round(flaeche*100)/100;
			}
			else {
				System.out.println("Bad Data Triangle2SeitenWinkel");
				return 0;
			}
		}
		else {
			System.out.println("Bad Data Triangle2SeitenWinkel");
			return 0;
		}
	}
}
