package Toolbox;

/*
 * author:		Vorname Nachname
 * element:		XXX
 * date:		18.03.19
 * 
 */

public class Toolbox {
	public TextSuchen TextSuchen;
	public TemperatureCalculation TemperatureCalculation;
	
	public Toolbox() {
		this.TextSuchen = new TextSuchen();
		this.TemperatureCalculation = new TemperatureCalculation();
	}
}
