package Toolbox;

/*
 * author:		Federico Köppel
 * element:		007
 * date:		18.03.19
 * 
 */

import java.text.DecimalFormat;

public class TemperatureCalculation {


	public double CelsiusToFahrenheit(double celsius) {

		double fahrenheit = ((9.0/5.0) * celsius) + 32;

		return decimalFormat(fahrenheit);
	}

	public double FahrenheitToCelsius(double fahrenheit) {

		double celsius = (5.0/9.0) * (fahrenheit - 32);

		return decimalFormat(celsius);
	}


	public double CelsiusToKelvin(double celsius) {

		double kelvin = celsius + 273.15;

		return decimalFormat(kelvin);
	}



	public double FahrenheitToKelvin(double fahrenheit) {

		double kelvin = (fahrenheit + 459.67) * 5/9;

		return decimalFormat(kelvin);
	}


	public double KelvinToCelsius(double kelvin) {

		double celsius = kelvin - 273.15;

		return decimalFormat(celsius);
	}



	public double KelvinToFahrenheit(double kelvin) {

		double fahrenheit = (9.0/5.0) * (kelvin - 273.15) + 32;

		return decimalFormat(fahrenheit);
	}


	public double decimalFormat(double result) {
		DecimalFormat df = new DecimalFormat("###.##");
		String resultFormatted = df.format(result);

		return Double.parseDouble(resultFormatted);
	}



}
