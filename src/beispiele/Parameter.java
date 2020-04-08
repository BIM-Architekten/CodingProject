package beispiele;

/***************************************************************/
/* Prof. Dr. Carsten Vogt                                      */
/* FH Koeln, Fak. 07 / Nachrichtentechnik                      */
/* http://www.nt.fh-koeln.de/vogt                              */
/*                                                             */
/* Das Programm demonstriert den Unterschied zwischen Refe-    */
/* renz- und Wertuebergabe von Parametern.                     */
/***************************************************************/



public class Parameter {

 /* Methode zur Verdopplung des Inhalts einer int-Variablen:
    Der aktuelle Parameter enthält einen int-Wert, der beim Aufruf
    in den formalen Parameter kopiert wird. Die Anweisungen des
    Methodenkoerpers arbeitet auf der Wertkopie im formalen
    Parameter, was keine Auswirkung auf den aktuellen Parameter hat. */

 public static void doppel(int formParam) {
  formParam = 2*formParam;
 }

 /* Methode zur "Verdopplung" des Inhalts eines StringBuffers, d.h. der bisherige
    Inhalt wird zweimal hintereinander in den StringBuffer geschrieben:
    Der aktuelle Parameter enthaelt eine Referenz auf einen StringBuffer, und
    dieser Verweis wird beim Aufruf in den formalen Parameter kopiert. Die
    Anweisungen des Methodenkoerpers greifen ueber diesen Verweis im formalen
    Parameter auf den StringBuffer zu und haben somit Auswirkungen auf den
    aktuellen Parameter, da auch dieser auf den StringBuffer verweist. */

 public static void doppel(StringBuffer formParam) {
  formParam.append(formParam);
 }
 
 /* Hauptprogramm */

 public static void main(String args[]) {

  int aktParam1=1;

  System.out.println();
  System.out.println("aktParam1 vor Aufruf von doppel(aktParam1):  " + aktParam1);

  doppel(aktParam1);

  System.out.println();
  System.out.println("aktParam1 nach Aufruf von doppel(aktParam1):  " + aktParam1);

  StringBuffer aktParam2 = new StringBuffer("Hallo");

  System.out.println();
  System.out.println("aktParam2 vor Aufruf von doppel(aktParam2):  " + aktParam2);

  doppel(aktParam2);

  System.out.println();
  System.out.println("aktParam2 nach Aufruf von doppel(aktParam2):  " + aktParam2);

 }

}