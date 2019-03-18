package Toolbox;

public class Toolbox {
	public TextSuchen TextSuchen;
	public TemperatureCalculation TemperatureCalculation;
	
	public Toolbox() {
		this.TextSuchen = new TextSuchen();
		this.TemperatureCalculation = new TemperatureCalculation();
	}
}