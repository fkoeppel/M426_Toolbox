package Testing;

import Toolbox.Promillewert;

public class PromillewertTest {
	
	public PromillewertTest() {
		this.testPromillewert1();
		this.testPromillewert2();
	}
	
	public boolean testPromillewert1() {
		String methodName = new Object() {}
	      .getClass()
	      .getEnclosingMethod()
	      .getName();
		System.out.println(methodName + "...");
		try {
			//OWN BEGIN
			Promillewert prom = new Promillewert();
			prom.wassergehalt = 0.68;
			prom.anz_getraenke= 2;
			prom.gewicht = 70;
			prom.liter = new double[2];
			prom.liter[0] = 0.3;
			prom.liter[1] = 0.5;
			prom.volumen = new double[2];
			prom.volumen[0] = 6.6;
			prom.volumen[1] = 4.8;
			prom.anzahl = new int[2];
			prom.anzahl[0] = 3;
			prom.anzahl[1] = 4;
			double res = prom.berechnen();
			if (res == 2.61) {
			//OWN END
				System.out.println("SUCCESS " + methodName);
				return true;
			}
		} catch (Exception e) {
			System.out.println("FAILURE, " + methodName + " " + e);
		}	
		
		System.out.println("FAILURE " + methodName);
		return false;
	}
	
	public boolean testPromillewert2() {
		String methodName = new Object() {}
	      .getClass()
	      .getEnclosingMethod()
	      .getName();
		System.out.println(methodName + "...");
		try {
			//OWN BEGIN
			Promillewert prom = new Promillewert();
			prom.wassergehalt = 0.68;
			prom.anz_getraenke= 2;
			prom.gewicht = -1;
			prom.liter = new double[2];
			prom.liter[0] = 0.3;
			prom.liter[1] = 0.5;
			prom.volumen = new double[2];
			prom.volumen[0] = 6.6;
			prom.volumen[1] = 4.8;
			prom.anzahl = new int[2];
			prom.anzahl[0] = 3;
			prom.anzahl[1] = 4;
			double res = prom.berechnen();
			if (res != 2.61) {
			//OWN END
				System.out.println("SUCCESS " + methodName);
				return true;
			}
		} catch (Exception e) {
			System.out.println("FAILURE, " + methodName + " " + e);
		}	
		
		System.out.println("FAILURE " + methodName);
		return false;
	}
}
