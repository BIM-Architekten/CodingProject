package beispiele;

/***************************************************************/
/* Das Programm zeigt die Arbeitsweise der for-Schleife        */
/* anhand einer int-Laufvariablen.                             */
/***************************************************************/



public class ForSchleife {

 /**
 * @param args
 */
public static void main(String args[]) {

   int i; /* Laufvariable */

   System.out.println();

   
   /* for-Schleife
      - initialisiert zu Beginn i mit dem Wert 1
      - wird (erstmalig oder erneut) durchlaufen, solange i <= 10 ist
      - zaehlt nach jedem Durchlauf i um 1 hoch */

   for (i=1; i<=68; i++) {

    System.out.print("i, i hoch 2, i hoch 3: ");
    System.out.println(i + " " + i*i + " " + i*i*i);
    

   }

 }
}
