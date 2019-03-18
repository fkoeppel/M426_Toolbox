package Toolbox;

/*
 * author:		Vorname Nachname
 * element:		XXX
 * date:		18.03.19
 * 
 */

public class Toolbox {
	public TextSuchen TextSuchen;
	//public ElectricalResistance ElectricalResistance;
	public Toolbox() {
		this.TextSuchen = new TextSuchen();
		//this.ElectricalResistance = new ElectricalResistance();
		//Promillewert prom = new Promillewert();
		//prom.getStarted();
		Length leng = new Length(12, "inche","meter");
		System.out.println(leng.getStarted());
		Length asdf = new Length(12, "inche","mile");
		System.out.println(asdf.getStarted());
		Length fdsa = new Length(12, "inche","feet");
		System.out.println(fdsa.getStarted());
	}
}
