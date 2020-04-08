package beispiele;

/***************************************************************/
/* Das Programm demonstriert die switch-Anweisung.             */
/***************************************************************/

import java.io.*;

public class SwitchAnweisung {

 public static void main(String args[]) throws IOException {

  BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

  int sender;

  System.out.println();
  System.out.println("Bitte Sendernummer eingeben: ");
  sender = Integer.parseInt(in.readLine());

  System.out.println();

  switch(sender) { /* Auswahl des case-Zweigs
                      in Abhaengigkeit des Werts von sender */
                         
   case 1: System.out.println("ARD"); break;   /* break zum Sprung hinter das
                                                  Ende der switch-Anweisung */
   case 2: System.out.println("ZDF"); break;

   case 3: System.out.println("Drittes"); break;

   default: System.out.println("Privat"); break; /* default = "sonstiger Wert" */

  }

  System.out.println();
 
  switch(sender){ /* Hier: Zusammenfassung mehrerer case-Zweige */
   case 1:
   case 2:
   case 3: System.out.println("Oeffentlich-rechtlich"); break;
   default: System.out.println("Privat"); break;
  }

 }
}