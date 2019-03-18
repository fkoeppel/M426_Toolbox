package Testing;


	/*
	 * author:		Federico Köppel
	 * element:		007
	 * date:		18.03.19
	 * 
	 */



public class TemperatureCalculationTest {

	package Testing;

	import Toolbox.TemperatureCalculation;

	public class TemperatureCalculationTest {
		private TemperatureCalculation test = new TemperatureCalculation();

		TemperatureCalculationTest() {
			this.testCelsiusToFahrenheit();
			this.testFahrenheitToCelsius();
			this.testCelsiusToKelvin();
			this.testFahrenheitToKelvin();
			this.testKelvinToCelsius();
			this.testKelvinToFahrenheit();
		}

		private boolean testCelsiusToFahrenheit() {
			String methodName = new Object() {}
		      .getClass()
		      .getEnclosingMethod()
		      .getName();
			System.out.println(methodName + "...");
			try {
				double celsius = 20;

				//CelsiusToFahrenheit Test
				double result = test.CelsiusToFahrenheit(celsius);
				if (result == 68.0) {
					System.out.println("SUCCESS " + methodName);
					return true;
				}

			} catch (Exception e) {
				System.out.println("FAILURE, " + methodName + " " + e);
			}	

			System.out.println("FAILURE " + methodName);
			return false;
		}


		private boolean testFahrenheitToCelsius() {
			String methodName = new Object() {}
		      .getClass()
		      .getEnclosingMethod()
		      .getName();
			System.out.println(methodName + "...");
			try {
				double fahrenheit = 50;

				//CelsiusToFahrenheit Test
				double result = test.FahrenheitToCelsius(fahrenheit);
				if (result == 10) {
					System.out.println("SUCCESS " + methodName);
					return true;
				}

			} catch (Exception e) {
				System.out.println("FAILURE, " + methodName + " " + e);
			}	

			System.out.println("FAILURE " + methodName);
			return false;
		}




		private boolean testCelsiusToKelvin() {
			String methodName = new Object() {}
		      .getClass()
		      .getEnclosingMethod()
		      .getName();
			System.out.println(methodName + "...");
			try {
				double celsius = 20;

				//CelsiusToFahrenheit Test
				double result = test.CelsiusToKelvin(celsius);
				if (result == 293.15) {
					System.out.println("SUCCESS " + methodName);
					return true;
				}

			} catch (Exception e) {
				System.out.println("FAILURE, " + methodName + " " + e);
			}	

			System.out.println("FAILURE " + methodName);
			return false;
		}




		private boolean testFahrenheitToKelvin() {
			String methodName = new Object() {}
		      .getClass()
		      .getEnclosingMethod()
		      .getName();
			System.out.println(methodName + "...");
			try {
				double fahrenheit = 50;

				//CelsiusToFahrenheit Test
				double result = test.FahrenheitToKelvin(fahrenheit);
				if (result == 283.15) {
					System.out.println("SUCCESS " + methodName);
					return true;
				}

			} catch (Exception e) {
				System.out.println("FAILURE, " + methodName + " " + e);
			}	

			System.out.println("FAILURE " + methodName);
			return false;
		}



		private boolean testKelvinToCelsius() {
			String methodName = new Object() {}
		      .getClass()
		      .getEnclosingMethod()
		      .getName();
			System.out.println(methodName + "...");
			try {
				double kelvin = 300;

				//CelsiusToFahrenheit Test
				double result = test.KelvinToCelsius(kelvin);
				if (result == 26.85) {
					System.out.println("SUCCESS " + methodName);
					return true;
				}

			} catch (Exception e) {
				System.out.println("FAILURE, " + methodName + " " + e);
			}	

			System.out.println("FAILURE " + methodName);
			return false;
		}



		private boolean testKelvinToFahrenheit() {
			String methodName = new Object() {}
		      .getClass()
		      .getEnclosingMethod()
		      .getName();
			System.out.println(methodName + "...");
			try {
				double kelvin = 300;

				//CelsiusToFahrenheit Test
				double result = test.KelvinToFahrenheit(kelvin);
				if (result == 80.33) {
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
	
}
