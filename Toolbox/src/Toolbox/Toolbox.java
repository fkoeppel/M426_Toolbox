package Toolbox;

/*
 * author:		Vorname Nachname
 * element:		XXX
 * date:		18.03.19
 * 
 */

public class Toolbox {
	public TextSuchen TextSuchen;
	public TextEditor TextEditor;
	public Promillewert Promillewert;
	public ElectricalResistance ElectricalResistance;
	public Density Density;
	
	public Toolbox() {
		this.TextSuchen = new TextSuchen();
		this.TextEditor = new TextEditor();
		this.Promillewert = new Promillewert();
		this.ElectricalResistance = new ElectricalResistance();
		this.Density = new Density();
	}
}
