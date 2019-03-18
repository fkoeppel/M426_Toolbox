package Toolbox;

public class Main {

	public static void main(String[] args) {
		Toolbox t = new Toolbox();

		System.out.println(t.TextSuchen.suchen("Koll", "Ma"));


		System.out.println(t.TemperatureCalculation.CelsiusToFahrenheit(20));
		System.out.println();
		System.out.println(t.TemperatureCalculation.FahrenheitToCelsius(70));
		System.out.println();
		System.out.println(t.TemperatureCalculation.CelsiusToKelvin(20));
		System.out.println();
		System.out.println(t.TemperatureCalculation.FahrenheitToKelvin(70));
		System.out.println();
		System.out.println(t.TemperatureCalculation.KelvinToCelsius(70));
		System.out.println();
		System.out.println(t.TemperatureCalculation.KelvinToFahrenheit(500));



	}
}
