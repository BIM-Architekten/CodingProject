package hpi.w2;


public class TemperaturKonverter {

    public static void main(String[] args) {
         TemperaturKonverter konverter = new TemperaturKonverter();
         System.out.println("0 Celsius sind " + konverter.konvertiereTemperatur(0.0, false) + " Fahrenheit");
         System.out.println("32 Fahrenheit sind " + konverter.konvertiereTemperatur(32.0, true) + " Celsius");

    }
    

    double konvertiereTemperatur(double temperatur, boolean richtung){
        if(richtung == true){
            return konvertiereFahrenheit(temperatur);
        }
        else {
            return konvertiereCelsius(temperatur);
        }
    }


	private double konvertiereCelsius(double temperatur) {
		// TODO Auto-generated method stub
		return (temperatur * 9 / 5 + 32);
	}


	private double konvertiereFahrenheit(double temperatur) {
		// TODO Auto-generated method stub
		
		return ((temperatur - 32) * 5 / 9);
	}
	 //Celsius = (t - 32) * 5 / 9; Temperatur t in Celsius zu Fahrenheit: Fahrenheit = t * 9 / 5 + 32
	/* Benoetigte Methoden: 
	 * konvertiereCelsius(Parameter temperatur vom Typ double, Rueckgabe double)
	 * konvertiereFahrenheit(Parameter temperatur vom Typ double, Rueckgabe double)
	 */
}

