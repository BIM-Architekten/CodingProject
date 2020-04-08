package beispiele;

/***************************************************************/

/* Das Programm demonstriert die Arbeitsweise einer kopf-      */
/* gesteuerten Schleife mit while:                             */
/* Es werden alle Zweierpotenzen kleiner als 20 ausgegeben.    */
/***************************************************************/



public class WhileSchleife {

 public static void main(String args[]) {

  int zahl = 1;
  
  System.out.println();

  while ( zahl < 20 ) { /* Solange zahl < 20 */

   /* gib zahl aus */
   System.out.println("Zweierpotenz: " + zahl);

   /* verdopple zahl */
   zahl = zahl * 2;

  }

 }

}