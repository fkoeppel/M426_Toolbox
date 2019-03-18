package Toolbox;

/*
 * author:		Vorname Nachname
 * element:		XXX
 * date:		18.03.19
 * 
 */

public class Toolbox {
	private TextSuchen TextSuchen;
	private TextEditor TextEditor;
	private Promillewert Promillewert;
	private ElectricalResistance ElectricalResistance;
	private Density Density;
	private TemperatureCalculation TemperatureCalculation;

	public Toolbox() {
		this.TextSuchen = new TextSuchen();
		this.TextEditor = new TextEditor();
		this.Promillewert = new Promillewert();
		this.ElectricalResistance = new ElectricalResistance();
		this.Density = new Density();
		this.TemperatureCalculation = new TemperatureCalculation();

	}
}
