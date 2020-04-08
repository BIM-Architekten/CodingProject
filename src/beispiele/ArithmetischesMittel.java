package beispiele;

public class ArithmetischesMittel {
    
    static int berechneSumme(int[] zahlen){
        // Berechne hier die Summe aller Zahlen mit einer foreach Schleife und gib sie zurück:
    		int[] array = {8, 7};
    		for(int k : array){
    			System.out.println(k);
    		}
			return 8+7;
    }

   // static double berechneMittel(int[] zahlen){
        //double summe = berechneSumme(zahlen);

        // Berechne hier das Arithmetische Mittel und gib es zurück:

  //  }

    public static void main(String[] args){
        int[] zahlen = new int[]{8,7};
        System.out.println("Summe: "+berechneSumme(zahlen));
      //  System.out.println("Mittel: "+ berechneMittel(zahlen));
    }
}