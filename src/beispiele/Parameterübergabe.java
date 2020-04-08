package beispiele;

/***************************************************************/
/* Prof. Dr. Carsten Vogt                                      */
/* FH Koeln, Fak. 07 / Nachrichtentechnik                      */
/* http://www.nt.fh-koeln.de/vogt                              */
/*                                                             */
/* Das Programm illustriert die Parameteruebernahme durch das  */
/* Hauptprogramm.                                              */
/***************************************************************/



public class Parameterübergabe {

 public static void main(String args[]) {

  /* Nach Aufruf des Programms von der Kommandozeile aus enthaelt
     der Array args[] die Strings, die der Aufrufer im Anschluss an
     den Dateinamen eingeben hat. Diese aktuellen Parameter muessen
     bei der Eingabe durch Blanks voneinander getrennt werden. 
     Aufrufbeispiel:
      java Hauptprogramm Anton Berta Caesar
  */

  System.out.println();
  System.out.println("Hier ist das Hauptprogramm");
  System.out.println();

  if (args.length==0)
    System.out.println("Keine aktuellen Parameter vorhanden");
   else {
    System.out.println("Meine aktuellen Parameter:");
    System.out.println();
    for (int i=0;i<args.length;i++)
     System.out.println(args[i]);  
   }
 }

}